package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class sentrifugo {

    public static WebDriver driver;

    @BeforeTest
    public void browser() {
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\Maggie\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        //driver = new FirefoxDriver();
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Maggie\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        //System.setProperty("webdriver.ie.driver","C:\\Users\\Maggie\\Downloads\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");
        //driver = new InternetExplorerDriver();

    }

    @Test
    public static void LoginSentrifugo() throws InterruptedException {
        String url = "http://demo.sentrifugo.com/index.php/";
        driver.get(url);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("EM01");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("sentrifugo");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"loginsubmit\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"logoutbutton\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"logoutid\"]/a[6]")).click();
        Thread.sleep(2000);
        if ((driver.getCurrentUrl()).equals("http://demo.sentrifugo.com/index.php/")){
            System.out.println("Sentrifugo Login Passed");
        } else {
            System.out.println("Sentrifugo Login Failed");
        }
        Thread.sleep(2000);
        driver.close();
        }
}
