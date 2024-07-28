package com.luma.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.luma.baseclass.BaseTest;

public class CreateAccountTest extends BaseTest {
	// TEST CASE 4: ACCOUNT CREATED WITH VALID DATA SUCCESSFULL
	// TEST CASE 5: ACCOUNT CREATED WITH INVALID EMAIL AND PASSWORD FORMAT
	// TEST CASE 6: VERFIED THE ACCOUNT WITH INVALID DATA FILLED WITH NAMING TEXTBOX
	
	
    @Test(priority = 0, enabled = true)
    public void createAccountPositive() {
        driver.findElement(By.linkText("Create an Account")).click();
        driver.findElement(By.id("firstname")).sendKeys("max");
        driver.findElement(By.id("lastname")).sendKeys("burger");
        driver.findElement(By.id("email_address")).sendKeys("abcde9900@gmail.com");
        driver.findElement(By.id("password")).sendKeys("78QywEwA##5BLL7");
        driver.findElement(By.id("password-confirmation")).sendKeys("78QywEwA##5BLL7");
        driver.findElement(By.xpath("//button[@class='action submit primary']")).click();

        String expectedUrl = "https://magento.softwaretestingboard.com/customer/account/create/";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);

        WebElement welcomeMessage = driver.findElement(By.xpath("/html/body/div[2]/main/div[2]/div[2]/div/div"));
        Assert.assertTrue(welcomeMessage.isDisplayed());
    }

    @Test(priority=1 ,enabled=false)
    public void createAccountNegativeInvalidEmail() {
        driver.findElement(By.linkText("Create an Account")).click();
        driver.findElement(By.id("firstname")).sendKeys("John");
        driver.findElement(By.id("lastname")).sendKeys("Doe");
        driver.findElement(By.id("email_address")).sendKeys("invalid-email");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("password-confirmation")).sendKeys("Password123");
        driver.findElement(By.xpath("//button[@class='action submit primary']")).click();

//        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div"));
//        Assert.assertTrue(errorMessage.isDisplayed());
    }

    @Test( priority =2,enabled=false)
    public void createAccountNegativePasswordMismatch() {
        driver.findElement(By.linkText("Create an Account")).click();
        driver.findElement(By.id("firstname")).sendKeys("John");
        driver.findElement(By.id("lastname")).sendKeys("Doe1");
        driver.findElement(By.id("email_address")).sendKeys("john.doe@example.com");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("password-confirmation")).sendKeys("DifferentPassword");
        driver.findElement(By.xpath("//button[@class='action submit primary']")).click();

//        WebElement errorMessage = driver.findElement(By.cssSelector(".message-error"));
//        Assert.assertTrue(errorMessage.isDisplayed());
    }
}
