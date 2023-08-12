package com.selenium.linkedinQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");
        Thread.sleep(2000);
        //signin
        driver.findElement(By.name("username")).sendKeys("testdata");
        driver.findElement(By.name("password")).sendKeys("testingtestdatablz");
        Thread.sleep(20000);
        WebElement login=driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();

        //forgotpassword
        WebElement forgotpassword=driver.findElement(By.linkText("Forgot password?"));
        forgotpassword.click();

        driver. findElement(By.name("cppEmailOrUsername")).sendKeys("abcd123@gmail.com");
        driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
        Thread.sleep(1000);

        //create new account
         WebElement newaccount=driver.findElement(By.linkText("Create new account"));
         newaccount.click();

         driver.findElement(By.name("emailOrPhone")).sendKeys("1234567890");
         driver.findElement(By.name("fullName")).sendKeys("BRIDGELAB TEST");
         driver.findElement(By.name("username")).sendKeys("labzbridge");
         driver.findElement(By.name("password")).sendKeys("123@bridgeLab");

         WebElement submit=driver.findElement(By.linkText("Sign up"));
         submit.click();
         driver.close();
    }
}
