package com.selenium.linkedinQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BridgelabRegister {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://bridgelabz.com/papregistration");

        driver.findElement(By.name("ContactNumber")).sendKeys("974122222");
        Thread.sleep(2000);
        driver.findElement(By.name("fullName")).sendKeys("PAVANTIGANI");
        Thread.sleep(2000);


        driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.name("gradStream")).sendKeys("Engineering(NON IT)");
        driver.findElement(By.name("passoutYear")).sendKeys("2022");
        driver.findElement(By.name("location")).sendKeys("pune");
        WebElement register=driver.findElement(By.linkText("REGISTER NOW"));
        register.click();
        Thread.sleep(2000);
        driver.close();

    }
}