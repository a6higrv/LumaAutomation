package com.luma.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.luma.baseclass.BaseTest;

public class FooterSearchTerm extends BaseTest {

	//Test case 24: verified the Search term hyperlink which are placed in footer
		@Test
		public void searchTerm() throws InterruptedException {
	    // Scroll to the bottom of the page
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//a[normalize-space()='Search Terms']")).click();
	  
		Thread.sleep(2000);
		System.out.println("Test case 24: verified the Search term hyperlink which are placed in footer");
		}
}
