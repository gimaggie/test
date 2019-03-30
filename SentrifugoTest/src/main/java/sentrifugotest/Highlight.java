package sentrifugotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class Highlight {

    WebDriver driver;

    @BeforeTest
    public void browser (){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Maggie\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Browser started");
    }

    @Test
    public void login() throws InterruptedException {
        driver.get("http://demo.sentrifugo.com/index.php/");
        driver.manage().window().maximize();
        System.out.println("Page loaded");
        driver.findElement(By.name("username")).sendKeys("EM01");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("sentrifugo");
        Thread.sleep(2000);
        driver.findElement(By.id("loginsubmit")).click();
        System.out.println("Login successful");
        driver.findElement(By.xpath("//*[@id=\"143\"]/b")).click();
        Thread.sleep(2000);
        Select sel1=new Select(driver.findElement(By.xpath("//*[@id=\"perpage_servicedeskconf\"]")));
        sel1.selectByVisibleText("150");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"sidebar-wrapper\"]/div[13]/div/div[1]/ul/li[4]/a/img")).click();
        //driver.findElement(By.cssSelector("img[src='http://demo.sentrifugo.com/public/media/images/menuIcons/shortcuts/countries.jpg']")).click();

       /*String text = driver.findElement(By.xpath("//*[@id=\"today_bday_name\"]")).getText();
        assertTrue(text.contains("No birthdays today."));
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"prof_name\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"logoutid\"]/a[6]")).click();
        Thread.sleep(2000);*/
    }

    /*@AfterTest
    public void close(){
        driver.quit();
        System.out.println("Browser closed");
    }*/
}

//Vevo Hottest New HIP-HOP
