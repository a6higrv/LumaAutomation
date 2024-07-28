package com.luma.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.luma.baseclass.BaseTest;

public class SignOutTest extends BaseTest {

// Test case 27: Application logged out successfully

	 @Test
	public void signOut() {
		 driver.findElement(By.linkText("Sign In")).click();
	        driver.findElement(By.id("email")).sendKeys("abcde9900@gmail.com");
	        driver.findElement(By.id("pass")).sendKeys("78QywEwA##5BLL7");
	        driver.findElement(By.id("send2")).click();

	        String expectedUrl = "https://magento.softwaretestingboard.com/";
	        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
	        System.out.println(" Login with valid credentials");
		
	        // Locate the account dropdown element
	        WebElement accountDropdown = driver.findElement(By.xpath("//div[@class='panel header']//button[@type='button']"));

	        // Click the account dropdown to expand it
	        accountDropdown.click();

	        // Locate the Sign Out link
	        WebElement signOutLink = driver.findElement(By.xpath("//a[contains(text(), 'Sign Out')]"));

	        // Click the Sign Out link
	        signOutLink.click();
	        System.out.println("Test case 27: Application logged out successfully");
	        
	 }
	 }
