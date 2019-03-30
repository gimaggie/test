package SpeiPruebas;

import com.sun.javafx.scene.KeyboardShortcutsHandler;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Eribank {

    WebDriver driver;


    @Parameters("browser")
    @Test(invocationCount = 2)

    public void mutiBrowser(String browserName) throws InterruptedException{

        if(browserName.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver", "C:\\Users\\Maggie\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
            driver=new FirefoxDriver();
        }
        else if(browserName.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maggie\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver=new ChromeDriver();
        }
        else if(browserName.equalsIgnoreCase("IE"))
        {

            System.setProperty("webdriver.ie.driver","C:\\Users\\Maggie\\Downloads\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");
            driver=new InternetExplorerDriver();
        }

        driver.manage().window().maximize();
        driver.get("http://demo.sentrifugo.com/");
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("EM01");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("sentrifugo");
        driver.findElement(By.xpath("//*[@id=\"loginsubmit\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"4\"]/b")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"prof_name\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"logoutid\"]/a[6]")).click();
        //driver.findElement(By.xpath("//*[@id=\"lst-ib\"]")).sendKeys("administrador");
        //WebElement text = driver.findElement(By.xpath("//*[@id=\"lst-ib\"]"));
        //Thread.sleep(5000);
        //text.sendKeys("halloween");
        //text.submit();
        //driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin");
        //driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"spanMessage\"]"))));
        //WebElement errorMessageElement = driver.findElement(By.xpath("//*[@id=\"spanMessage\"]"))
        //Thread.sleep(2500);
        //driver.findElement(By.xpath("//*[@id=\"menu_time_viewTimeModule\"]/b")).click();
        //Thread.sleep(1000);
        //driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
        //Thread.sleep(1000);
        //driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();

        if ((driver.getCurrentUrl()).equals("http://demo.sentrifugo.com/index.php/")) {
            System.out.println("Login Sentrifugo Passed! :D");
        } else {
            System.out.print("Login Sentrifugo Failed :(");
        }
        Thread.sleep(5000);
        driver.quit();
    }
}