package com.nextBaseCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnnouncementPage extends BasePage {

    @FindBy(css = "#bx-b-uploadfile-blogPostForm")
    public WebElement uploadFilesIcon;

    @FindBy(xpath = "//span[.='Select document from Bitrix24']")
    public WebElement selectFromBitrix;
}
