package com.luma.testcases;


import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.luma.baseclass.BaseTest;

public class Shipping extends BaseTest  {
	
    @Test(priority = 1)
    public void checkoutPositive() {
    	driver.get("https://magento.softwaretestingboard.com/radiant-tee.html");
//    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	
    	 driver.findElement(By.xpath("//div[@id='option-label-size-143-item-167']")).click();
         driver.findElement(By.xpath("//div[@id='option-label-color-93-item-56']")).click();
         driver.findElement(By.id("qty")).clear();
         driver.findElement(By.id("qty")).sendKeys("1");
         driver.findElement(By.xpath("//button[@id='product-addtocart-button']")).click();
         
         //code runs------till this
         
         try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
    	
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    	try {
        	driver.findElement(By.xpath("//span[text()='My Cart']")).click();
    }catch(ElementNotInteractableException e) {}
       
      
//        driver.switchTo().window("")
//    	   try{driver.findElement(By.cssSelector("a.action.showcart")).click();
//    	   
//    	   }catch(ElementNotInteractableException e) {}
       
    	   
    	   // Open cart dropdown/modal
           WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
           WebElement cartButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a.action.showcart")));
           
        // Scroll into view if needed
           ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", cartButton);
           cartButton.click();

           // Wait for dropdown/modal to be fully visible
//           wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".minicart-items-wrapper")));
           
           // Proceed to checkout
           WebElement proceedToCheckoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("top-cart-btn-checkout")));
           
           // Scroll into view if needed
           ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", proceedToCheckoutButton);
           
           // checkout button click
          driver.findElement(By.id("top-cart-btn-checkout")).click();
          
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          
          //code runs---till this
       driver.navigate().refresh();
         try {
        	   driver.navigate().refresh();
          //shipping address
         driver.findElement(By.id("customer-email")).sendKeys("abcde9900@gmail.com");
         

//         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        		email.submit();
        driver.findElement(By.id("customer-password")).sendKeys("78QywEwA##5BLL7");
//        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Login")));
        driver.findElement(By.xpath("//span[text()='Login']")).submit();
        driver.findElement(By.xpath("//span[text()='Next']")).click();
        
        driver.navigate().refresh();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.xpath("//span[text()='Next']")).click();
         }catch(Exception e) {
       
        
        // company address
       try { driver.findElement(By.id("REK0LQI")).sendKeys("my new address");
       
       
        driver.findElement(By.id("LXQ179O")).sendKeys("123456");
        
        // name fields
        driver.findElement(By.name("firstname")).sendKeys("max");
        driver.findElement(By.name("lastname")).sendKeys("burger");
        
        // street address
        driver.findElement(By.id("CE1SYEB")).sendKeys("123 Main St");
        // city
        driver.findElement(By.id("PR7EY16")).sendKeys("Los Angeles");
        
         }catch(Exception e1) {
        	 
         }
        
        
        //state selection
        try {
        // Wait for the dropdown to be visible----selected state as Goa
        WebElement dropdownElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("X52C1FD")));
         

         
        // Initialize the Select class
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByValue("Goa");
         
        // zip or postal code
        driver.findElement(By.id("I5NK25M")).sendKeys("90001");
        
         
        // Wait for the dropdown to be visible--selected for country as India
        WebElement dropdownElement2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("CQSGYPI")));

        // Initialize the Select class
        Select dropdown2 = new Select(dropdownElement2);
        dropdown2.selectByValue("India");
        
        }catch(TimeoutException e4) {}
        
        // phone number
//        driver.findElement(By.id("TW1XLCH")).sendKeys("555-555-5555");

//        driver.findElement(By.xpath("//input[@value='flatrate_flatrate']")).click();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        driver.navigate().refresh();
//        driver.findElement(By.className("button action continue primary")).click();
        
         
        
        
       
try {
       driver.findElement(By.xpath("//*[@id=\"checkout-payment-method-load\"]/div/div/div[2]/div[2]/div[4]/div/button/span")).click();
//        placeOrderButton.click();
//        Assert.assertTrue(placeOrderButton.isDisplayed()
         }catch(NoSuchElementException ex) {}}
         }

    @Test(priority = 2, enabled=false)
    public void checkoutNegativeIncompleteAddress() {
        driver.findElement(By.cssSelector(".action.showcart")).click();
        driver.findElement(By.cssSelector("button[title='Proceed to Checkout']")).click();

        driver.findElement(By.id("customer-email")).sendKeys("john.doe@example.com");
        driver.findElement(By.name("firstname")).sendKeys("John");
        driver.findElement(By.name("lastname")).sendKeys("Doe");
        driver.findElement(By.name("street[0]")).sendKeys("123 Main St");
        driver.findElement(By.name("city")).sendKeys("Los Angeles");
        driver.findElement(By.name("postcode")).sendKeys("90001");

        driver.findElement(By.cssSelector("input[value='flatrate_flatrate']")).click();
        driver.findElement(By.cssSelector(".button.action.continue.primary")).click();

        WebElement errorMessage = driver.findElement(By.cssSelector(".message-error"));
        Assert.assertTrue(errorMessage.isDisplayed());
    }
}
