package Orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.ie.InternetExplorerDriver;

import javax.sql.rowset.WebRowSet;

public class LoginOrange {

    public static void main (String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Maggie\\Downloads\\chromedriver_win32\\chromedriver.exe"); //Driver Chrome
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Maggie\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe"); //Driver Firefox
        //System.setProperty("java.net.preferIPv4Stack", "true");
        //System.setProperty("webdriver.ie.driver","C:\\Users\\Maggie\\Downloads\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe"); //Driver Internet Explorer

        //WebDriver driver = new ChromeDriver();
        WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new InternetExplorerDriver();

        driver.get("http://opensource.demo.orangehrmlive.com/index.php/dashboard");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"txtUsername\"]")).sendKeys("admin");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("admin");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/ul/li[2]/a")).click();
        //driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
        //driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();
        //driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
        //driver.findElement(By.xpath("//*[@id=\"btnAdd\"]")).click();
        //Thread.sleep(250);
        //Select sel=new Select(driver.findElement(By.xpath("//*[@id=\"systemUser_userType\"]")));
        //sel.selectByValue("1");
        //driver.findElement(By.xpath("//*[@id=\"systemUser_employeeName_empName\"]")).sendKeys("Jasmine Morgan");
        //Thread.sleep(250);
        //driver.findElement(By.xpath("//*[@id=\"systemUser_userName\"]")).sendKeys("Jassmiiin");
        //Thread.sleep(250);
        //Select sel1 = new Select(driver.findElement(By.xpath("//*[@id=\"systemUser_status\"]")));
        //sel1.selectByValue("0");
        //Thread.sleep(250);
        //driver.findElement(By.xpath("//*[@id=\"systemUser_password\"]")).sendKeys("Conect@1");
        //Thread.sleep(250);
        //driver.findElement(By.xpath("//*[@id=\"systemUser_confirmPassword\"]")).sendKeys("Conect@1");
        //Thread.sleep(250);
        //driver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();

        if ((driver.getCurrentUrl()).equals("http://opensource.demo.orangehrmlive.com/index.php/dashboard")){
            System.out.println("Admin Login Orange Passed");
        }
        else {
            System.out.print("Admin Login Orange Failed");
        }
        Thread.sleep(500);
        driver.close();
    }
}


