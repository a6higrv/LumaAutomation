package com.luma.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.luma.baseclass.BaseTest;

public class SortBy extends BaseTest{
	//Test case 22: verified the sort by function with shirt as search item
	@Test(priority=21)
	void sortByDropDown() throws InterruptedException {
        
        Thread.sleep(2000);
        driver.findElement(By.id("search")).sendKeys("shirt");
        driver.findElement(By.cssSelector("button[title='Search']")).click();
        
        
        WebElement sortby = driver.findElement(By.cssSelector("body > div:nth-child(5) > main:nth-child(4) > div:nth-child(4) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(4) > select:nth-child(2)"));
       sortby.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Select sort = new Select(sortby);
        sort.selectByVisibleText("Price");
        
        System.out.println("Test case 22: verified the sort by function with shirt as search item");
        

    }
	
	

	@BeforeMethod
	void login() throws InterruptedException {
//		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.findElement(By.xpath("(//li[@class='authorization-link']//a)[1]")).click();
		
		driver.findElement(By.id("email")).sendKeys("abcde9900@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("78QywEwA##5BLL7");
		driver.findElement(By.xpath("//button[@class='action login primary']//span")).click();
	}

}
