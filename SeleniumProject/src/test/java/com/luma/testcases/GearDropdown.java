package com.luma.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.luma.baseclass.BaseTest;

public class GearDropdown extends BaseTest {

	//TEST CASE 19: GEAR DROPDOWN OPENED SUCCESFULLY
	//TEST CASE 20: GEAR BAG ADDED TO THE WISHLIST SUCCESSFULLY
	@BeforeMethod
	public void loginPage() throws InterruptedException {
		System.out.println("Log into the application");
		
		
//		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
//		Thread.sleep(5000);
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
	
	@Test(priority=19)
	public void gearDropDownSelectitem() {
//		driver.get("https://magento.softwaretestingboard.com/");
		System.out.println("TEST CASE 19: GEAR DROPDOWN OPENED SUCCESFULLY");
		driver.findElement(By.xpath("//span[text()='Gear']")).click();
		driver.findElement(By.linkText("Bags")).click();
		driver.findElement(By.xpath("//img[@alt='Push It Messenger Bag']")).click();
		driver.findElement(By.xpath("//a[@class='action towishlist']")).click();
		System.out.println("TEST CASE 20: GEAR BAG ADDED TO THE WISHLIST SUCCESSFULLY");
}
}
