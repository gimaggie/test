package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.AssertJUnit.assertEquals;

public class testwd {

    WebDriver driver;
    By registerImageElement = By.xpath("//img[@src='/images/masts/mast_register.gif']");
    By usernameElement = By.name("userName");

    @BeforeTest
    public void browser() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maggie\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/mercurywelcome.php");
        System.out.println("Browser started");
    }

    @Test
    public void register() throws InterruptedException {
        driver.findElement(By.linkText("REGISTER")).click();
        Thread.sleep(2000);
        if (driver.findElement(registerImageElement).isDisplayed()) {
            driver.findElement(By.name("email")).sendKeys("testing");
            Thread.sleep(2000);
            driver.findElement(By.name("password")).sendKeys("test");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("input[name='confirmPassword']")).sendKeys("test");
            driver.findElement(By.name("register")).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText("Home")).click();
            Thread.sleep(2000);
            System.out.println("Register successful");
        } else {
            System.out.println("Register page was not found");
        }
         //List<WebElement> fonts = driver.findElements(By.tagName("font"));
         //assertEquals("Note: Your user name is testing.",fonts.get(5).getText());
    }

    @Test(dependsOnMethods = "register")
    public void login()throws InterruptedException{
        if (driver.findElement(By.xpath("//img[@src='/images/featured_destination.gif']")).isDisplayed());
        System.out.println("");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//img[@src='/images/hdr_right.gif']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("userName")).sendKeys("hola");
    }

    @AfterTest
    public void closeApp(){
        driver.quit();
        System.out.println("Browser closed");
    }
}