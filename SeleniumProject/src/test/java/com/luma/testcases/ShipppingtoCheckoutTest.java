package com.luma.testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.luma.baseclass.BaseTest;

public class ShipppingtoCheckoutTest extends BaseTest {
// Test case 26: order place successful
@Test
public void shippingtoCheckout() throws InterruptedException,ElementClickInterceptedException,NoSuchElementException {
	try {
	   Thread.sleep(3000);
	   driver.findElement(By.xpath("//a[@class='action showcart']")).click();
       driver.findElement(By.xpath("//button[@id='top-cart-btn-checkout']")).click();
       Thread.sleep(3000);
      WebElement shipping= driver.findElement(By.name("firstname"));
      shipping.clear();
      shipping.sendKeys("max");
      Thread.sleep(3000);
      WebElement last=driver.findElement(By.name("lastname"));
      last.clear();
      last.sendKeys("burger");
      Thread.sleep(2000);
      driver.findElement(By.name("company")).sendKeys("xyz");
      Thread.sleep(2000);
      driver.findElement(By.xpath("(//input[@class='input-text'])[6]")).sendKeys("India");
      driver.findElement(By.name("city")).sendKeys("City");
      Thread.sleep(2000);
      driver.findElement(By.xpath("(//select[@class='select'])[1]")).sendKeys("Phurela");
     
      driver.findElement(By.xpath("(//input[@class='input-text'])[11]")).sendKeys("123456");
    
      driver.findElement(By.xpath("(//select[@class='select'])[2]")).sendKeys("India");
    
      driver.findElement(By.name("telephone")).sendKeys("1234567890");
      
      driver.findElement(By.xpath("(//td[@class='col col-method']//input)[1]")).click();
      Thread.sleep(3000);
      driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	//
	driver.navigate().refresh();
	driver.findElement(By.xpath("//button[@class='button action continue primary']")).click();
	
	//
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	driver.navigate().to("https://magento.softwaretestingboard.com/checkout/#payment");
	Thread.sleep(5000);
	driver.navigate().refresh();
	
	driver.findElement(By.cssSelector("span[data-bind=\"i18n: 'Place Order'\"]")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}catch (Exception e) {}
	Thread.sleep(5000);
	System.out.println("// Test case 26: order place successful");

}

@BeforeMethod
void login() throws InterruptedException {
//	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.manage().window().maximize();
	driver.get("https://magento.softwaretestingboard.com/");
	driver.findElement(By.xpath("(//li[@class='authorization-link']//a)[1]")).click();
	
	driver.findElement(By.id("email")).sendKeys("abcde9900@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("78QywEwA##5BLL7");
	driver.findElement(By.xpath("//button[@class='action login primary']//span")).click();


}
@AfterMethod
void logOut() {
	driver.quit();
}
}