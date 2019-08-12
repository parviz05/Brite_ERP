package com.brite_ERP.tests.components.crm;

import com.brite_ERP.pages.crm.CRM_Pages;
import com.brite_ERP.pages.login.LoginPage;
import com.brite_ERP.utilities.ConfigurationReader;
import com.brite_ERP.utilities.Driver;
import com.brite_ERP.utilities.SeleniumUtils;
import com.brite_ERP.utilities.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CRM_Test extends TestBase {

    WebDriver driver= Driver.getDriver();
    @Test
    public void verifyRevenueExpectedResult(){

        LoginPage loginPage=new LoginPage();

        String username=ConfigurationReader.getProperty("username");
        String password=ConfigurationReader.getProperty("password");
        SeleniumUtils.waitPlease(2);
        loginPage.login(username,password);
        SeleniumUtils.waitPlease(2);
        CRM_Pages crm_pages=new CRM_Pages();
        crm_pages.crmElement.click();
        SeleniumUtils.waitPlease(2);
        crm_pages.pivotElement.click();
        SeleniumUtils.waitPlease(2);
        crm_pages.NewLocator.click();
        SeleniumUtils.waitPlease(2);
        WebDriverWait wait=new WebDriverWait(driver,Long.valueOf(ConfigurationReader.getProperty("excplicitwait")));
        wait.until(ExpectedConditions.visibilityOf(crm_pages.opportunityLocator));
        crm_pages.opportunityLocator.click();
        String pivoValu= crm_pages.ComputerLocator.getAttribute("value");
        SeleniumUtils.waitPlease(2);
        String totalValue=crm_pages.totalValueLocator.getAttribute("value");
        crm_pages.listLocator.click();
        String listValue=crm_pages.computerLocatorOnlist.getAttribute("value");
        String footValue=crm_pages.footValueLocator.getAttribute("value");
        Assert.assertEquals(pivoValu,listValue);
        Assert.assertEquals(totalValue,footValue);










    }

}
