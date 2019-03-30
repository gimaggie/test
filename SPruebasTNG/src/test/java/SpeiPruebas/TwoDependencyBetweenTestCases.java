package SpeiPruebas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TwoDependencyBetweenTestCases
{
    WebDriver driver;

    @BeforeClass
    public void startBrowser()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Maggie\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Browser started");
    }

    @Test(invocationCount = 2)
    public void startApp()
    {
        driver.get("http://demo.sentrifugo.com/index.php/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String currentURL=driver.getCurrentUrl();
        Assert.assertTrue(currentURL.contains("index.php/"));
        System.out.println("Application loaded ");
    }

    @Test(dependsOnMethods = "startApp")
    public void loginApp()
    {
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("EM01");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("sentrifugo");
        driver.findElement(By.xpath("//*[@id=\"loginsubmit\"]")).click();

        boolean status=driver.findElement(By.xpath("//*[@id=\"173\"]/b")).isDisplayed();
        Assert.assertTrue(status);
        System.out.println("Login successful");

    }

    @Test(dependsOnMethods = "loginApp")
    public void logoutApp() throws InterruptedException
    {
        driver.findElement(By.xpath("//*[@id=\"logoutbutton\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"logoutid\"]/a[6]")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"username\"]")).isDisplayed());
        System.out.println("Logout done");
     }

     @AfterClass
     public void closeApp()
     {
         driver.quit();
         System.out.println("Browser closed");
     }
}


