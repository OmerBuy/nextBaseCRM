package com.nextBaseCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Poll extends BasePage{

    @FindBy(id = "id=\"bx-b-uploadfile-blogPostForm\"")
    public WebElement uploadIcon;

    @FindBy(id="bx-destination-tag")
    public WebElement addEmployees;

    @FindBy(xpath = "//span[@class=\"bxhtmled-top-bar-btn bxhtmled-button-link\"]/i")
    public WebElement linkIcon;

    @FindBy(xpath = "//span[@class=\"bxhtmled-top-bar-btn bxhtmled-button-video\"]/i")
    public WebElement insertVideoIcon;

    @FindBy(id="bx-b-tag-input-blogPostForm")
    public WebElement quoteIcon;


}
