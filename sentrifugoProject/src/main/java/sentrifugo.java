import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sentrifugo {

    public static WebDriver driver;

    @BeforeTest
    public void browser() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Maggie\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test(invocationCount = 2)
    public static void LoginSentrifugo() throws InterruptedException {
        String url = "https://es-la.facebook.com/";
        driver.get(url);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        Select sel1=new Select(driver.findElement(By.xpath("//*[@id=\"day\"]")));
        sel1.selectByValue("10");
        Thread.sleep(1000);
        Select sel2=new Select(driver.findElement(By.xpath("//*[@id=\"month\"]")));
        sel2.selectByVisibleText("mar");
        Thread.sleep(1000);
        Select sel3=new Select(driver.findElement(By.xpath("//*[@id=\"year\"]")));
        sel3.selectByValue("1990");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"u_0_11\"]")).click();
        Thread.sleep(5000);

        if ((driver.getCurrentUrl()).equals("https://es-la.facebook.com/")) {
            System.out.println("Login Facebook Passed :D");
        }

        else {
            System.out.println("Login Facebook Failed :(");
        }
        driver.quit();
    }
}