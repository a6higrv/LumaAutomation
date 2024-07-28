package com.luma.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.luma.baseclass.BaseTest;

public class Womendropdown extends BaseTest {
	//TEST CASE 18: WOMENS DROPDOWN SELECTED AND JACKED IS ADDED TO WISHLIST

@BeforeMethod
public void loginPage() throws InterruptedException {
	System.out.println("Log into the application");
	
	
//	driver.manage().window().maximize();
	driver.get("https://magento.softwaretestingboard.com/");
//	Thread.sleep(5000);
	
	driver.findElement(By.xpath("(//li[@class='authorization-link']//a)[1]")).click();
	
	driver.findElement(By.id("email")).sendKeys("abcde9900@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("78QywEwA##5BLL7");
	driver.findElement(By.xpath("//button[@class='action login primary']//span")).click();

	
	
}
@AfterMethod
public void logOutPage() throws InterruptedException {
	System.out.println("logout the application succesfully");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	driver.findElement(By.xpath("(//li[@class='authorization-link']//a)[1]")).click();
	
	driver.quit();
	
}
@Test(priority=20)
public void womenDropDownSelectitem() {
	System.out.println("Test case 18: Selected women jacket item wishlisted successfully");
	driver.findElement(By.xpath("(//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e'])[1]")).click();
	driver.findElement(By.xpath("(//li[@class='item']//a)[4]")).click();
	driver.findElement(By.xpath("(//img[@class='product-image-photo'])[10]")).click();
	driver.findElement(By.xpath("(//div[@class='swatch-option text'])[3]")).click();
	driver.findElement(By.xpath("(//div[@class='swatch-option color'])[3]")).click();
	driver.findElement(By.xpath("(//a[@class='action towishlist']//span)[1]")).click();
	}
}