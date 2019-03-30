import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.testng.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.security.auth.spi.LoginModule;
import java.net.URL;
import java.net.MalformedURLException;

import static java.lang.Thread.*;

public class appium2 {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Untitled";
    protected AndroidDriver<AndroidElement> driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
        dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.experitest.ExperiBank");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".LoginActivity");
        driver = new AndroidDriver<>(new URL("http://localhost:4723/wd/hub"), dc);
    }

    @Test
    public void testUntitled() throws InterruptedException {
        driver.getKeyboard().sendKeys("company");
        driver.findElement(By.xpath("(//*[@class='android.widget.LinearLayout' and ./parent::*[@class='android.widget.ScrollView']]/*/*[@class='android.widget.EditText'])[2]")).sendKeys("company");
        driver.findElement(By.xpath("//*[@text='Login']")).click();
        sleep(1000);
        driver.findElement(By.xpath("//*[@text='EriBank']")).click();
        sleep(1000);
        Assert.assertEquals("EriBank",driver.findElement(By.xpath("//*[@text='EriBank']")).getText());
        driver.findElement(By.xpath("//*[@text='Logout']")).click();


    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        sleep(1000);
        driver.quit();
        System.out.println("Login success");
    }
}