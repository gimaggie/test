package SPEIINFONAVIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CambiarContraseña {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Maggie\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("http://10.82.0.34:9080/tesoreria/login");
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Benjamin");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Infonavit@2");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"command\"]/div[4]/div[2]/div/input")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("//*[@id=\"tableUsuarios_paginate\"]/span/a[2]")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("//*[@id=\"tableUsuarios\"]/tbody/tr[10]/td[6]/a")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("//*[@id=\"usuario\"]/div[1]/div/div[1]/div/a")).click();
        driver.findElement(By.xpath("//*[@id=\"passUser\"]")).sendKeys("Infonavit@4");
        Thread.sleep(2500);
        driver.findElement(By.xpath("//*[@id=\"passUserConfirm\"]")).sendKeys("Infonavit@4");
        Thread.sleep(1500);
        driver.findElement(By.xpath("//*[@id=\"usuario\"]/div[2]/div/input")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"nav-vertical\"]/nav/div[2]/ul/li[6]/a")).click();


        if ((driver.getCurrentUrl()).equals("http://10.82.0.34:9080/tesoreria/login")) {
            System.out.println("Cambia Contraseña Passed");
        } else {
            System.out.print("Cambia Contraseña Failed");
        }

        Thread.sleep(500);
        driver.close();
    }
}