package com.brite_ERP.tests.components.login;

import com.brite_ERP.pages.login.LoginPage;
import com.brite_ERP.utilities.ConfigurationReader;
import com.brite_ERP.utilities.SeleniumUtils;
import com.brite_ERP.utilities.TestBase;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    @Test
    public void loginTest1(){
        LoginPage loginPage=new LoginPage();

        String username=ConfigurationReader.getProperty("username");
        String password=ConfigurationReader.getProperty("password");
        SeleniumUtils.waitPlease(2);
        loginPage.login(username,password);


    }


}
