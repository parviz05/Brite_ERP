package com.brite_ERP.pages.crm;

import com.brite_ERP.utilities.ConfigurationReader;
import com.brite_ERP.utilities.Driver;
import com.brite_ERP.utilities.SeleniumUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class CRM_Pages {
    WebDriver driver=Driver.getDriver();
    @FindBy(linkText = "CRM")
   public WebElement crmElement;
    @FindBy(css = "button[data-view-type='pivot']")
    public WebElement pivotElement;

    @FindBy(xpath ="//tbody//tr//td[contains(text(),'New')]")
            public WebElement NewLocator;
    @FindBy(css = "li[data-field='name']>a")
    public WebElement opportunityLocator;
    @FindBy(xpath = "//tbody//tr[4]//td[contains(text(),'Computer')]/following-sibling::td[1]")
            public WebElement ComputerLocator;
    @FindBy(css = "button[aria-label='list']")
            public WebElement listLocator;
    @FindBy(xpath = "//tbody//tr[3]//td[contains(text(),'Computer')]/following-sibling::td[6]")
            public WebElement computerLocatorOnlist;


    @FindBy(xpath = "//tbody//tr//td[contains(text(),'Total')]/following-sibling::td[1]")
    public WebElement totalValueLocator;

    @FindBy(css = "tfoot td:nth-of-type(9)")
    public WebElement footValueLocator;

    public CRM_Pages(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

}
