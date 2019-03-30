package SPEIINFONAVIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AltaUsuario {


    public static void  main (String [] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\Maggie\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("http://10.82.0.34:9080/tesoreria/login");
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Benjamin");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Infonavit@2");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"command\"]/div[4]/div[2]/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[1]/div/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"nomUser\"]")).sendKeys("Alejandra1");
        Thread.sleep(2500);
        driver.findElement((By.xpath("//*[@id=\"realNomUser\"]"))).sendKeys("Alejandra Lopez");
        Thread.sleep(2500);
        driver.findElement(By.xpath("//*[@id=\"passUser\"]")).sendKeys("Infonavit@1");
        Thread.sleep(2500);
        driver.findElement((By.xpath("//*[@id=\"passUserConfirm\"]"))).sendKeys("Infonavit@1");
        Thread.sleep(2500);
        Select sel1 = new Select(driver.findElement(By.xpath("//*[@id=\"usuario\"]/div[1]/div/div[5]/div/select")));
        sel1.selectByValue("3");
        Thread.sleep(2500);
        Select sel2 = new Select(driver.findElement(By.xpath("//*[@id=\"usuario\"]/div[1]/div/div[6]/div/select")));
        sel2.selectByValue("8");
        Thread.sleep(2500);
        driver.findElement(By.xpath("//*[@id=\"usuario\"]/div[2]/div/input")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("//*[@id=\"tableUsuarios_paginate\"]/span/a[2]")).click();
        Thread.sleep(5000);


        if ((driver.getCurrentUrl()).equals("http://10.82.0.34:9080/tesoreria/usuarios/ver")){
            System.out.println("Alta Usuario SPEI Passed");
        }
        else {
            System.out.print("Alta Usuario Failed");
        }
        Thread.sleep(500);
        driver.close();

    }
}
