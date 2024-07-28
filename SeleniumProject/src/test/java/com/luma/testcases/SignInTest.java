package com.luma.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.luma.baseclass.BaseTest;

public class SignInTest extends BaseTest{
//TEST CASE 1: LOGIN WITH VALID DATA
//TEST CASE 2: LOGIN WITH INVALID USERNAME AND VALID PASSWORD
//TEST CASE 3: LOGIN WITH VALID USERNAME AND INVALID PASSWORD
	
    @Test(priority=3,enabled = true)
    public void signInPositive() {
        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.id("email")).sendKeys("abcde9900@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("78QywEwA##5BLL7");
        driver.findElement(By.id("send2")).click();

        String expectedUrl = "https://magento.softwaretestingboard.com/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
        System.out.println("Test Case 1: Login with valid credentials");
//        WebElement welcomeMessage = driver.findElement(By.xpath("//span[text()='Welcome, max burger!'][1]"));
//        Assert.assertTrue(welcomeMessage.isDisplayed());
    }

    @Test(priority=4, enabled=false)
    public void signInNegativeInvalidEmail() {
        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.id("email")).sendKeys("invalid-email@example.com");
        driver.findElement(By.id("pass")).sendKeys("78QywEwA##5BLL7");
        driver.findElement(By.id("send2")).click();
        System.out.println("Test case 2: Login with invalid email and valid password");
//        WebElement errorMessage = driver.findElement(By.cssSelector(".message-error"));
//        Assert.assertTrue(errorMessage.isDisplayed());
    }

    @Test(priority=5, enabled=false)
    public void signInNegativeInvalidPassword() {
        driver.findElement(By.linkText("Sign In")).click();
        driver.findElement(By.id("email")).sendKeys("abcde9900@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("invalid-password");
        driver.findElement(By.id("send2")).click();
        System.out.println("Test case 3: Login with valid email and invalid password");

//        WebElement errorMessage = driver.findElement(By.cssSelector(".message-error"));
//        Assert.assertTrue(errorMessage.isDisplayed());
    }
}
