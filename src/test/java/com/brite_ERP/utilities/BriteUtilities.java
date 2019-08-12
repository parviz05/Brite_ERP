package com.brite_ERP.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class BriteUtilities {
    WebDriver driver=Driver.getDriver();
    String acctionLocator ="//button[contains(text(),'Action')]";
    WebDriverWait wait=new WebDriverWait(driver,3);
    String okLocator="//span[text()='Ok']";

    /**
     * this method for select Opportunity based on opportunity title
     * @param opportunity
     */
    public void selectOpportunity(String opportunity){
        String opportunityLocator="//td[text()='"+opportunity+"']/preceding-sibling::td//input";
        driver.findElement(By.xpath(opportunityLocator)).click();

    }

    /**
     * Method that for delete opportunity based on opportunity title
     * @param opportunity
     */
    public void deleteOpportunity(String opportunity){
        selectOpportunity(opportunity);
        selectAction("Delete");
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(okLocator)));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(okLocator))));
        driver.findElement(By.xpath(okLocator)).click();

    }

    /**
     * This method that selects actions
     * @param actionName
     */
    public void selectAction(String actionName){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(acctionLocator))));
        driver.findElement(By.xpath(acctionLocator)).click();
        String actionOptionsLocator="//a[contains(@data-section,'other') and contains(text(),'"+actionName+"')]";
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(actionOptionsLocator))));
        driver.findElement(By.xpath(actionOptionsLocator)).click();



    }

    /**
     * Based on opportunity title this method verify that the there is no cell with a giving text
     * @param opportunity
     */
    public void verifyThatOpportunityDeleted(String opportunity){
        String opportunityLocator="//td[text()='"+opportunity+"']";
        List<WebElement> listOfOportunities=driver.findElements(By.xpath(opportunityLocator));
        Assert.assertTrue(listOfOportunities.size()==0);
        Assert.assertTrue(listOfOportunities.isEmpty());

    }

    /**
     *
     * @param driver
     * @param tab
     */
    public void navigateToModule(WebDriver driver,String tab){
        String tabLocator="//span[contains(text(),'"+tab+"') and @class='oe_menu_text']";
        SeleniumUtils.clickWithWait(driver,By.xpath(tabLocator),3);
        SeleniumUtils.waitPlease(2);


    }
}
