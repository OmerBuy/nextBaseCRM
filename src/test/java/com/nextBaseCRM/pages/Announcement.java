package com.nextBaseCRM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Announcement extends BasePage {


    @FindBy(css = "#bx-b-uploadfile-blogPostForm")
    public WebElement uploadFilesIcon;

    @FindBy(xpath = "//span[.='Select document from Bitrix24']")
    public WebElement selectFromBitrix;

    @FindBy(xpath = "(//span[@id='feed-add-post-form-link-text'])")
    public WebElement moreButton;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'][contains(text(),'Announcement')])")
    public WebElement AnnouncementButton;

    @FindBy (id = "bx-b-mention-blogPostForm")
    public WebElement Addmention;

    @FindBy (id = "destDepartmentTab_mention54883870")
    public WebElement EmployeeContacts;

    @FindBy (xpath = "//div[@class='bx-finder-company-department-text']")
    public  WebElement DropdownContacts;

    @FindBy ( id = "feed-add-post-form-link-text" )
    public  WebElement More;




}
