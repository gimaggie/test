package Orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginFb {

    public static void main (String [] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Maggie\\Downloads\\chromedriver_win32\\chromedriver.exe"); //Driver Chrome
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Maggie\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe"); //Driver Firefox
        //System.setProperty("java.net.preferIPv4Stack", "true");
        //System.setProperty("webdriver.ie.driver","C:\\Users\\Maggie\\Downloads\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe"); //Driver Internet Explorer

        WebDriver driver = new FirefoxDriver();
        //WebElement element = driver.findElement(By("element_path"));
        //Actions actions = new Actions(driver);
        //actions.moveToElement(element).click().perform();


        driver.get("https://es-la.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("magos_7193@live.com.mx");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("@t1ragr4m");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"u_0_2\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"userNavigationLabel\"]")).click();
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

        //driver.navigate().to("https://www.facebook.com/maggie.ggi");

        if ((driver.getCurrentUrl()).equals("https://www.facebook.com/maggie.ggi")){
            System.out.println("Admin Login Passed");
        }
        else {
            System.out.print("Admin Login Failed");
        }
        Thread.sleep(500);
        driver.close();
    }
}
