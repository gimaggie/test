package sentrifugotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static java.lang.Thread.*;

public class Crossbrowser {

    WebDriver driver;

    @Parameters("browser")
    @Test(invocationCount = 2)

    public void crossBrowser(String browserName) throws Exception {

        if (browserName.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maggie\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            System.out.println("Chrome Browser started");
        } else if (browserName.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.firefox.driver", "C:\\Users\\Maggie\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");
            driver = new FirefoxDriver();
            System.out.println("Firefox Browser started");
        } else if (browserName.equalsIgnoreCase("IE")) {
            System.setProperty("webdriver.ie.driver", "C:\\Users\\Maggie\\Downloads\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            System.out.println("Internet Explorer Browser started");
        } else {
            throw new Exception("Browser is not correct");
        }
        driver.get("http://demo.sentrifugo.com/index.php/");
        driver.manage().window().maximize();
        System.out.println("Sentrifugo Page Loaded");
        driver.findElement(By.name("username")).sendKeys("EM01");
        driver.findElement(By.id("password")).sendKeys("sentrifugo");
        //driver.findElement(By.id("password")).clear();
        Thread.sleep(2000);
        driver.findElement(By.id("loginsubmit")).click();
        System.out.println("Login Successful");
        Thread.sleep(2000);

        String strErrorMessage = driver.findElement(By.xpath("//*[@id=\"format1_div\"]/div[1]/div/div[1]")).getText();
        System.out.println("What Is The Error Message?" + "\t" + strErrorMessage);

        driver.quit();
        System.out.println("Browser closed");
    }
}
        //driver.quit();
        //System.out.println("Browser closed");