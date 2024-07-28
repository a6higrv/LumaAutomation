package com.luma.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.luma.baseclass.BaseTest;

public class SearchTest extends BaseTest {
	// TEST CASE 9: VERIFIED THE VALID SEARCH INPUT SUCCESSFUL.
	// TEST CASE 10: VERIFIED THE INVALID SEARCH INPUT
    @Test(priority=11)
    public void searchPositive() {
        driver.findElement(By.id("search")).sendKeys("shirt");
        driver.findElement(By.cssSelector("button[title='Search']")).click();

        String expectedUrl = "https://magento.softwaretestingboard.com/catalogsearch/result/?q=shirt";
        Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl));

        WebElement searchTerm = driver.findElement(By.xpath("//span[@class='base']"));
        Assert.assertTrue(searchTerm.getText().contains("shirt"));
        System.out.println("Test Case 9: VERIFIED THE VALID SEARCH INPUT SUCCESSFUL");
    }

    @Test(priority=12)
    public void searchNegativeNoResults() {
        driver.findElement(By.id("search")).sendKeys("shirtwww");
        driver.findElement(By.cssSelector("button[title='Search']")).click();

        WebElement noResultsMessage = driver.findElement(By.cssSelector("#maincontent > div.page-title-wrapper > h1 > span"));
        Assert.assertTrue(noResultsMessage.isDisplayed());
        System.out.println("TEST CASE 10: VERIFIED THE INVALID SEARCH INPUT");
    }
}
