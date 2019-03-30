package Orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LifeCharger {

    public static void main(String [] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Maggie\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("http://lifecharger.org/");
        Thread.sleep(500);
        //driver.findElement(By.xpath("//*[@id=\"menu-item-136\"]/a")).click();
        //Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"search-2\"]/form/input")).sendKeys("love");
        driver.findElement(By.xpath("//*[@id=\"search-2\"]/form/button")).click();

        if ((driver.getCurrentUrl()).equals("http://lifecharger.org/?s=love")){
            System.out.println("Test Life Charger Passed");
        }
        else {
            System.out.print("Test Life Charger Failed");
        }
        Thread.sleep(500);
        driver.close();

    }
}
