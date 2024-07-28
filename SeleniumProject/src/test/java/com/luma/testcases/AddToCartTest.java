package com.luma.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.luma.baseclass.BaseTest;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class AddToCartTest extends BaseTest {
	//TEST CASE 13 : VERIFIED THE SELECTED PRODUCT WHICH IS ADDED TO THE ADDTOCART 
	//TEST CASE 14 : VERIFIED THE NEGATIVE Add to cart scenarios 
	
    @Test(priority = 15)
    public void addToCartPositive() {
    	driver.get("https://magento.softwaretestingboard.com/radiant-tee.html");
//        driver.findElement(By.cssSelector("a[title='Joust Duffle Bag']")).click();
        driver.findElement(By.xpath("//div[@id='option-label-size-143-item-167']")).click();
        driver.findElement(By.xpath("//div[@id='option-label-color-93-item-56']")).click();
        driver.findElement(By.id("qty")).clear();
        driver.findElement(By.id("qty")).sendKeys("1");
        driver.findElement(By.xpath("//button[@id='product-addtocart-button']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement successMessage = driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div"));
        Assert.assertTrue(successMessage.isDisplayed());
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement cartItemCount = driver.findElement(By.xpath("/html/body/div[2]/header/div[2]/div[1]/a/span[2]/span[1]"));
        Assert.assertEquals(cartItemCount.getText(), "1");
        System.out.println("TEST CASE 13 : VERIFIED THE SELECTED PRODUCT WHICH IS ADDED TO THE ADDTOCART ");
    }

    @Test(priority = 16 , enabled = false)
    public void addToCartNegativeOutOfStock() {
        driver.findElement(By.cssSelector("a[title='Joust Duffle Bag']")).click();
        driver.findElement(By.id("option-label-size-143-item-167")).click();
        driver.findElement(By.id("option-label-color-93-item-52")).click();
        driver.findElement(By.id("qty")).clear();
        driver.findElement(By.id("qty")).sendKeys("1000"); 
        driver.findElement(By.id("product-addtocart-button")).click();

        WebElement errorMessage = driver.findElement(By.cssSelector(".message-error"));
        Assert.assertTrue(errorMessage.isDisplayed());
        System.out.println("TEST CASE 14 : VERIFIED THE NEGATIVE Add to cart scenarios ");
    }
	
	

}


