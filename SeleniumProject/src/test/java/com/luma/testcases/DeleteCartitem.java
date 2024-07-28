package com.luma.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.luma.baseclass.BaseTest;

public class DeleteCartitem extends BaseTest {

	// TEST CASE 15: PRODUCT DELETED FROM THE CART SUCCESSFULL
	 @Test(priority=17,enabled = true)
	    void login() throws InterruptedException {
	   
	        

	        driver.findElement(By.xpath("(//li[@class='authorization-link']//a)[1]")).click();

	        driver.findElement(By.id("email")).sendKeys("abcde9900@gmail.com");
	        driver.findElement(By.id("pass")).sendKeys("78QywEwA##5BLL7");
	        driver.findElement(By.xpath("//button[@class='action login primary']//span")).click();

	        Thread.sleep(3000); 
	        }

	    @Test(priority=18)
	    void deleteCart() throws InterruptedException {
	        WebElement cartIcon = driver.findElement(By.xpath("//a[@class='action showcart']"));
	        cartIcon.click();

	        Thread.sleep(2000); 

	        while (true) {
	            try {
	                WebElement removeItemLink = driver.findElement(By.xpath("//a[@title='Remove item']"));
	                removeItemLink.click();

	                WebElement modalOkButton = driver.findElement(By.xpath("//footer[@class='modal-footer']//button[@class='action-primary action-accept']"));
	                modalOkButton.click();

	                Thread.sleep(2000); 
	            } catch (Exception e) {
	                break;
	            }
	            System.out.println("TEST CASE 15: PRODUCT DELETED FROM THE CART SUCCESSFULL");
	        }
	    }
}
