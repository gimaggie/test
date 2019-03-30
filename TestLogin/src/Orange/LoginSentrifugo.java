package Orange;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginSentrifugo {

    public static void main (String [] args) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Maggie\\Downloads\\chromedriver_win32\\chromedriver.exe"); //Driver Chrome
        System.setProperty("webdriver.gecko.driver","C:\\Users\\Maggie\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe"); //Driver Firefox
        //System.setProperty("java.net.preferIPv4Stack", "true");
        //System.setProperty("webdriver.ie.driver","C:\\Users\\Maggie\\Downloads\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe"); //Driver Internet Explorer

    WebDriver driver = new FirefoxDriver();

        driver.get("http://demo.sentrifugo.com/index.php/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("EM01");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("sentrifugo");
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"loginsubmit\"]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"logoutbutton\"]")).click();
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

        if ((driver.getCurrentUrl()).equals("http://demo.sentrifugo.com/index.php/index/welcome")){
        System.out.println("Admin Login Sentrifugo Passed");
    }
        else {
        System.out.print("Admin Login Failed");
    }
        Thread.sleep(500);
        driver.close();
}
}
