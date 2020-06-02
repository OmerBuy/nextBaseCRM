package com.nextBaseCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.naming.Name;

public class LoginPage {

    @FindBy(name = "USER_LOGIN")
   public WebElement userNamInput;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordInput;

    @FindBy(css = "input[type=\"submit\"]")
    public WebElement submitButton;



    public void login (String name, String password){

        userNamInput.sendKeys(name);
        passwordInput.sendKeys((password));
        submitButton.click();
    }
}
