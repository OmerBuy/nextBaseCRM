package com.nextBaseCRM.tests;

import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.utilities.BrowserUtils;
import com.nextBaseCRM.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class userstory_11_Salih extends TestBase{


    @Test
    public void userStory11(){



        LoginPage loginPage = new LoginPage();

        loginPage.userNamInput.sendKeys(ConfigurationReader.get("driver_username"));
        loginPage.passwordInput.sendKeys(ConfigurationReader.get("driver_password"));
        loginPage.submitButton.click();

        driver.findElement(By.name("USER_LOGIN")).sendKeys(ConfigurationReader.get("driver_username"));




    }
}
