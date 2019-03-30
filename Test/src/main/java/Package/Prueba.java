package Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Prueba {
    public static WebDriver driver;


    @BeforeTest
    public void browser(){
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Maggie\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Maggie\\Downloads\\chromedriver_win32\\chromedriver.exe");
        //driver = new ChromeDriver();
        //System.setProperty("webdriver.ie.driver","C:\\Users\\Maggie\\Downloads\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");
        //driver = new InternetExplorerDriver();
    }

    @Test
    public static void LoginSPEI() throws InterruptedException {
        driver.get("http://demo.sentrifugo.com/index.php/");
        Thread.sleep(2000);
        driver.close();
    }
}
