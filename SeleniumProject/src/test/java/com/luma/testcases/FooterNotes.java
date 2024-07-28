package com.luma.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.luma.baseclass.BaseTest;

public class FooterNotes extends BaseTest{
	//Test case 23: verified the Notes hyperlink which are placed in footer
	@Test
	public void notes() throws InterruptedException {
    // Scroll to the bottom of the page
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//a[@href='https://softwaretestingboard.com/magento-store-notes/?utm_source=magento_store&utm_medium=banner&utm_campaign=notes_promo&utm_id=notes_promotion']")).click();
  
	Thread.sleep(2000);
	System.out.println("Test case 23: verified the Notes hyperlink which are placed in footer");
}
}
