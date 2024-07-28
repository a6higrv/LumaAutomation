package com.luma.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.luma.baseclass.BaseTest;

public class SelectProductTest extends BaseTest {
	//TEST CASE 11: SEARCHED SHIRT PRODUCT WAS SELECTED AND PAGE OPENED SUCCESSFULL
	//TEST CASE 12: VERIFIED THE INVALID SEARCHED PRODUCT 

    @Test(priority = 13)
    public void searchAndSelectProduct() {
        // Perform a search for a product
        WebElement searchBar = driver.findElement(By.id("search"));
        searchBar.sendKeys("shirt");
        searchBar.submit();
        
        // Wait for search results to load
        WebElement searchResult = driver.findElement(By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[2]/div[2]/ol[1]/li[1]"));
        Assert.assertTrue(searchResult.isDisplayed(), "Search results are not displayed.");

        // Select the first product from the search results
        searchResult.click();

        // Verify that the product detail page is displayed
        WebElement productTitle = driver.findElement(By.xpath("//a[@class='product-item-link'][1]"));
        Assert.assertTrue(productTitle.isDisplayed(), "Product detail page is not displayed.");
        System.out.println("TEST CASE 11: SEARCHED SHIRT PRODUCT WAS SELECTED AND PAGE OPENED SUCCESSFULL");
    }

    @Test(priority = 14, enabled = false)
    public void searchAndSelectProductNegative() {
        // Perform a search for a product that does not exist
        WebElement searchBar = driver.findElement(By.id("search"));
        searchBar.sendKeys("nonexist");
        searchBar.submit();
        
        // Wait for search results to load
        WebElement noResultsMessage = driver.findElement(By.xpath("//span[@class='base']"));
        Assert.assertTrue(noResultsMessage.isDisplayed(), "Your search returned no results");
        System.out.println("TEST CASE 12: VERIFIED THE INVALID SEARCHED PRODUCT");
    }
}
