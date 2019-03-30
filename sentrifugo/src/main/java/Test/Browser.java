package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Browser {

    WebDriver driver;

    @Test
    @Parameters("browser")

    public void multiBrowser(String browserName){

        if(browserName.equalsIgnoreCase("firefox"))
        {
            System.setProperty("webdriver.gecko.driver","C:\\Users\\Maggie\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
            driver=new FirefoxDriver();
        }
        else if(browserName.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Maggie\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver=new ChromeDriver();
        }
        else if(browserName.equalsIgnoreCase("IE"))
        {
            System.setProperty("webdriver.ie.driver","\"C:\\Users\\Maggie\\Downloads\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");
            driver=new InternetExplorerDriver();
        }

        driver.manage().window().maximize();
        driver.get("http://demo.sentrifugo.com/index.php/");
        System.out.println(driver.getTitle());
        driver.quit();
    }
}