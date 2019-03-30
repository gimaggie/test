package testselenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testSelenium {

    public static WebDriver driver;

    @BeforeTest
    public void browser(){
        System.setProperty("webdriver.ie.driver","C:\\Users\\Maggie\\Downloads\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");
        driver = new InternetExplorerDriver();
    }

    @Test
    public static void Login() throws InterruptedException {
        String url = "http://192.168.15.105:3005/";
        driver.get(url);
        driver.findElement(By.xpath("//*[@id=\"input-usr\"]")).sendKeys("S0035241");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/form/div[2]/input")).sendKeys("Electronico11.");
        //driver.findElement(By.xpath("//*[@id=\"video-gallery-button\"]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/form/div[3]/button")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/form/div[1]/input[2]")).sendKeys("12121212");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/form/div[2]/button")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"bs-navbar-collapse\"]/ul[1]/li[1]/a")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"closeSessionEmmit\"]")).click();
}
}