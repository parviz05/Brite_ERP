package com.brite_ERP.pages.crm;

import com.brite_ERP.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CRM_Pages {

    @FindBy(linkText = "CRM")
   public WebElement crmElement;
    @FindBy(css = "button[data-view-type='pivot']")
    public WebElement pivotElement;




    CRM_Pages(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
}
