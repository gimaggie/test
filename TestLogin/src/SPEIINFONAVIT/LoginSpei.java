package SPEIINFONAVIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LoginSpei {

        public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Maggie\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("http://10.82.0.34:9080/tesoreria/login");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS );
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Benjamin");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Infonavit@2");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/form/div[4]/div[2]/div/input")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[1]/nav/div[2]/ul/li[6]/a")).click();


        if ((driver.getCurrentUrl()).equals("http://10.82.0.34:9080/tesoreria/login")) {
            System.out.println("Login SPEI Passed");
        } else {
            System.out.print("Login SPEI Failed");
        }

        Thread.sleep(500);
        driver.close();
    }
}

