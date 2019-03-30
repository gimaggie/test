package sentrifugotest;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;

import static org.testng.Assert.assertEquals;

public class sentrifugoTest {

    static WebDriver driver;

    public void main (String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Maggie\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://demo.sentrifugo.com/index.php/");
        takeScreenshot("sentrifugo_loginPage");
    }

    public static void takeScreenshot(String fileName) throws IOException{
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("/Users/Maggie/IdeaProjects/SentrifugoTest/src/main/java/sentrifugotest"+fileName+".jpg"));
    }
}

    /*@Test
    public void test() throws InterruptedException {
        driver.get("http://demo.sentrifugo.com/index.php/");
        driver.findElement(By.name("username")).sendKeys("EM01");
        driver.findElement(By.name("password")).sendKeys("sentrifugo");
        //driver.findElement(By.name("password")).clear();
        //driver.findElement(By.name("password")).submit();
    }*/

    /*@Test
    public void test() {
        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("EM01");

    }*/

    /*@Test
    public void test2(){
        WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.clear();
        searchbox.sendKeys("quality-stream Introducción a la Automatización de Pruebas de Software");
        searchbox.submit();
        assertEquals("quality-stream Introducción a la Automatización de Pruebas de Software - Buscar con Google", driver.getTitle());
    }*/

    /*@Test
    public void test(){
        try{
            Assert.assertTrue(2<1);
            System.out.println("Assertion Failed in Test 1");
            Assert.assertFalse(1>0);
            System.out.println("Assertion Failed in Test 1");
            Assert.assertEquals("Sample", "Sample");
            System.out.println("Assertion Passed in Test 1");
        } catch(AssertionError ae){
            ae.printStackTrace();
        }
    }

    @Test
    public void test2(){
        try{
            Assert.assertTrue(2>1);
            System.out.println("Assertion passed in Test 2");
            Assert.assertFalse(1<0);
            System.out.println("Assertion passed in Test 2");
            Assert.assertEquals("Sample", "Sample");
            System.out.println("Assertion Passed in Test 2");
        } catch(AssertionError ae){
            ae.printStackTrace();
        }
    }*/

    /*SoftAssert softAssert = new SoftAssert();

    @Test
    public void test(){
        System.out.println("Open browser");

        Assert.assertEquals(true,true);

        System.out.println("enter username");
        System.out.println("enter password");
        System.out.println("click on sign in button");

        Assert.assertEquals(true,true);

        System.out.println("validate home page");
        Assert.assertEquals(true,true,"home page tittle is missing");

        System.out.println("go to deals page");
        System.out.println("create a deal");
        softAssert.assertEquals(true,false,"not able to create a deal");

        System.out.println("go to contacts page");
        System.out.println("create a contact");
        softAssert.assertEquals(true,false,"not able to create a contact");

        softAssert.assertAll();

    }*/
