package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class CrossBrowser {
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
        //WebDriver driver = new ChromeDriver();
        //driver.get("http://10.82.0.34:9080/tesoreria/login");
        String url = "http://opensource.demo.orangehrmlive.com/index.php/dashboard";
        driver.get(url);
        driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
        //wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//*[@id=\"spanMessage\"]"))));
        //WebElement errorMessageElement = driver.findElement(By.xpath("//*[@id=\"spanMessage\"]"))
        Thread.sleep(2500);
        driver.findElement(By.xpath("//*[@id=\"menu_time_viewTimeModule\"]/b")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();

        if ((driver.getCurrentUrl()).equals("http://opensource.demo.orangehrmlive.com/index.php/auth/login")) {
            System.out.println("Login Oragnge Passes");
        } else {
            System.out.print("Login Orange Failed");
        }
        Thread.sleep(5000);
        driver.close();
    }







}
