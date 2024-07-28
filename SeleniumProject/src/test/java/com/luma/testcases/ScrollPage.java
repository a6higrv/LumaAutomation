package com.luma.testcases;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.luma.baseclass.BaseTest;
public class ScrollPage extends BaseTest{
	//Test case 21: verified the webpage scrolling till footer
	@Test(priority=20)
public void scr()  {
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://magento.softwaretestingboard.com/");
//        driver.manage().window().maximize();
       
       
        // Scroll to the bottom of the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        System.out.println("Test case 21: verified the webpage scrolling till footer");
        // Close the browser
        driver.quit();
    }
}
