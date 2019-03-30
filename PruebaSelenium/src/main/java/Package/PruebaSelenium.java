package Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class PruebaSelenium {

    public static WebDriver driver;

    @BeforeTest
    public void startBrowser() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Maggie\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Browser started");
        Thread.sleep(2000);
    }

    //@Test (invocationCount = 2, threadPoolSize = 2)
    //public void startApp() throws InterruptedException {
        //driver.get("http://demo.sentrifugo.com/index.php/");
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //String currentURL=driver.getCurrentUrl();
        //Assert.assertTrue(currentURL.contains("index.php/"));
        //System.out.println("Application loaded ");
        //Thread.sleep(2000);
        //driver.close();
    //}

    //@Test(invocationCount = 10, threadPoolSize = 3)

    //public void test(){
        //System.out.printf("Thread Id : %s%n", Thread.currentThread().getId());
    //}

    @Test//(invocationCount = 5)
    public void loadTestThisWebsite() {
        driver.get("http://www.google.com");
        System.out.println("Page Title is " + driver.getTitle());
        Assert.assertEquals("Google", driver.getTitle());
        driver.quit();
    }

    /*@Test(invocationCount = 7)
    public void repeat() {
    }*/
}