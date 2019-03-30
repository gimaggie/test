package SPEIINFONAVIT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EliminarUsuario {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Maggie\\Downloads\\geckodriver-v0.19.1-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("http://10.82.0.34:9080/tesoreria/login");
        driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("Benjamin");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Infonavit@2");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div/div/div/div/div/div[2]/form/div[4]/div[2]/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"tableUsuarios_paginate\"]/span/a[3]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"tableUsuarios\"]/tbody/tr/td[7]/a")).click();
        Thread.sleep(2500);
        driver.findElement(By.xpath("//*[@id=\"nav-vertical\"]/nav/div[2]/ul/li[6]/a")).click();


        if ((driver.getCurrentUrl()).equals("http://10.82.0.34:9080/tesoreria/login")) {
        System.out.println("Elimina Usuario Passed");
    } else {
        System.out.print("Elimina Usuario Failed");
    }

        Thread.sleep(500);
        driver.close();
}
}
