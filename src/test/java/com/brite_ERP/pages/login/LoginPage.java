package com.brite_ERP.pages.login;

import com.brite_ERP.utilities.ConfigurationReader;
import com.brite_ERP.utilities.Driver;
import com.brite_ERP.utilities.SeleniumUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    static private WebDriver driver= Driver.getDriver();
    private WebDriverWait wait= new WebDriverWait(driver,Long.valueOf(ConfigurationReader.getProperty("excplicitwait")));

    @FindBy(css = "[id='login']")
    public WebElement userNameElement;
    @FindBy(css = "[id='password']")
    public WebElement passwordElement;
    @FindBy(css = "button[type='submit']")
    public WebElement loginButtonElement;

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    public void login(String username,String password){
        userNameElement.sendKeys(username);
        passwordElement.sendKeys(password);
        loginButtonElement.click();
    }

}

