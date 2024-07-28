package com.luma.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.luma.baseclass.BaseTest;

public class Mendropdown extends BaseTest {
// TEST CASE 16: MENS DROPDOWN OPENED SUCCESFULLY
// TEST CASE 17: MENS JACKET ADDED TO THE WISHLIST SUCCESSFULLY
	
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
	public void menDropDownSelectitem() {
//		driver.get("https://magento.softwaretestingboard.com/");
		System.out.println("Test case 16: Selected men jacket item wishlisted successfully");
		driver.findElement(By.xpath("//span[normalize-space()='Men']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Jackets')]")).click();
		driver.findElement(By.xpath("//img[@alt='Proteus Fitness Jackshirt']")).click();
		driver.findElement(By.xpath("//div[@class='product-addto-links']//a[@class='action towishlist']")).click();
		System.out.println("TEST CASE 17: MENS JACKET ADDED TO THE WISHLIST SUCCESSFULLY");
		
		
		
//		driver.get("https://magento.softwaretestingboard.com/");
//		driver.navigate().to("https://magento.softwaretestingboard.com/men.html");
//		driver.findElement(By.xpath("//*[@id=\"maincontent\"]/div[4]/div[2]/div[2]/div/ul[1]/li[1]/a")).click();
		
//		String msgactual = "Hoodies & Sweatshirts";
//		WebElement expected = driver.findElement(By.className("base"));
//		Assert.assertEquals(msgactual, expected);
//		System.out.println("The expected URL"+expected);
		}
}
