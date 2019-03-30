package sentrifugotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {

    WebDriver driver;

    @Test (dataProvider = "login-provider")
    public void signIn (String email, String password, boolean success) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Maggie\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
        driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();

        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("passwd")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();

        System.out.println("Log In Credentials: " + "\n" +
                "Email = " + email + "\n" +
                "Password = " + password + "\n" +
                "Successful Login In = " + success + "\n");

        String actualResult = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).getText();
        String expectedResult = "Sign out";
        Assert.assertEquals(actualResult, expectedResult, "The Actual & Expected Results Do Not Match");

        driver.quit();
    }

    @DataProvider (name = "login-provider")
    public Object [][] loglnData()
    {
        Object [] [] data = new Object[3][3];

        data [0][0] ="TestNG@Framework.com";    data [0] [1] = "TestNG1234";    data [0] [2] = true;
        data [1][0] ="Joe@Doe.com";             data [1] [1] = "Testng1234";    data [1] [2] = false;
        data [2][0] ="Test@Framework.com";      data [2] [1] = "TestNg1234";    data [2] [2] = true;

    return data;
    }
}