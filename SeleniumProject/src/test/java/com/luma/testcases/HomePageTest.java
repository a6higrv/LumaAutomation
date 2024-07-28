package com.luma.testcases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.luma.baseclass.BaseTest;

public class HomePageTest extends BaseTest {

	//TEST CASE 8:VERIFIED THE HOME PAGE
    @Test(priority = 7)
    public void verifyHomePageTitle() {
        String expectedTitle = "Home Page";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

    @Test(priority = 8)
    public void verifyLogoPresence() {
        WebElement logo = driver.findElement(By.xpath("//img[@src='https://magento.softwaretestingboard.com/pub/static/version1695896754/frontend/Magento/luma/en_US/images/logo.svg']"));
        Assert.assertTrue(logo.isDisplayed(), "Logo is displayed on the homepage.");
    }

    @Test(priority = 9, enabled=false)
    public void verifyNavigationMenu() {
        WebElement navMenu = driver.findElement(By.cssSelector("nav"));
        Assert.assertTrue(navMenu.isDisplayed(), "Navigation menu is displayed on the homepage.");
        
        // Further checks can be added to verify the presence of specific menu items
        WebElement womenMenu = driver.findElement(By.linkText("Women"));
        Assert.assertTrue(womenMenu.isDisplayed(), "Women menu item is not displayed.");
    }

    @Test(priority = 10, enabled = false)
    public void verifySearchBarPresence() {
        WebElement searchBar = driver.findElement(By.id("search"));
        Assert.assertTrue(searchBar.isDisplayed(), "Search bar is displayed on the homepage.");
    }

//    @Test(priority = 5)
//    public void verifyFeaturedProducts() {
//        WebElement featuredProductsSection = driver.findElement(By.cssSelector(".featured-products"));
//        Assert.assertTrue(featuredProductsSection.isDisplayed(), "Featured products section is not displayed on the homepage.");
//    }

//    @Test(priority = 6)
//    public void verifyPromotionalBanner() {
//        WebElement promoBanner = driver.findElement(By.cssSelector(".promo-banner"));
//        Assert.assertTrue(promoBanner.isDisplayed(), "Promotional banner is not displayed on the homepage.");
//    }
}
