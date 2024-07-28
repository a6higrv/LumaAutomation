package com.luma.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.luma.baseclass.BaseTest;

public class LogoTest extends BaseTest{
	// TEST CASE 7: VERIFIED THE LOGO OF WEBSITE WHICH IS DISPLAYED OR NOT
	@Test(priority =6,enabled=true)
	public void logo() {
		
	driver.get("https://magento.softwaretestingboard.com/");
	WebElement img=driver.findElement(By.xpath("//a[@class='logo']//img"));
	System.out.println("The logo is :"+img.isDisplayed());
}
}
