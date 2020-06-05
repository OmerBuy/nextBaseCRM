package com.nextBaseCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(css = ".b24-app-icon.b24-app-icon-macos")
    public WebElement macosButton;

    @FindBy (xpath = "//span[text()='Windows']")
    public WebElement windowsButton;

    @FindBy(xpath = "//span[text()='Linux']")
    public WebElement linuxButton;
}
