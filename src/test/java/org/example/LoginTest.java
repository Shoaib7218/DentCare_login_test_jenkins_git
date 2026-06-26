package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest{


     @Test
    public void loginTest() throws InterruptedException {

         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

         driver.get("http://localhost:5173/login");

         WebElement email = wait.until(ExpectedConditions.presenceOfElementLocated(
                 By.name("email")
         ));

         email.sendKeys("shoaib@gmail.com");
         driver.findElement(By.name("password")).sendKeys("patient123");
         driver.findElement(By.xpath("//button[text()='Sign In']")).click();

         Thread.sleep(2000);

         Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));

     }

}
