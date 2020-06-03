package com.nextBaseCRM.pages;

import com.nextBaseCRM.utilities.BrowserUtils;
import com.nextBaseCRM.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Poll extends BasePage{

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadIcon;

    @FindBy(id="bx-destination-tag")
    public WebElement addEmployees;

    @FindBy(xpath = "//span[@class=\"bxhtmled-top-bar-btn bxhtmled-button-link\"]/i")
    public WebElement linkIcon;

    @FindBy(xpath = "//span[@class=\"bxhtmled-top-bar-btn bxhtmled-button-video\"]/i")
    public WebElement insertVideoIcon;

    @FindBy(xpath = "//span[@class='bxhtmled-top-bar-btn bxhtmled-button-quote']")
    public WebElement quoteIcon;

    @FindBy(linkText = "Uploaded files")
    public WebElement uploadedFiles;

    @FindBy(partialLinkText = "shutterstock_1897158")
    public WebElement exampleDocuments;

    @FindBy(xpath = "//span[@class='popup-window-button popup-window-button-accept']")
    public  WebElement selectDocumentButton;

    @FindBy(id = "blog-submit-button-save")
    public WebElement sendButton;

    @FindBy(tagName = "blockquote")
    public WebElement quoteDisplayed;

    @FindBy(xpath = "(//span[contains(@class,'feed-add-post-form-but feed-add-mention')])[1]")
    public WebElement mentionButton;

    @FindBy(xpath = "//a[contains(@class,'bx-finder-box-tab bx-lm-tab-department')]")
    public WebElement employeeBtn;

    @FindBy(xpath = "//div[contains(@class,'bx-finder-company-department-arrow')]")
    public WebElement dropDownList;
    ////div[.='Cyber Vet']

    public void differentUploadChoices(String tab, String module) {
        //span[normalize-space(text())='My Drive']
        //(//span[normalize-space(text())='Download from external drive'])[1]
        String tabLocator = "(//span[normalize-space(text())='" + tab + "'])[1]";
        String moduleLocator = "//span[normalize-space(text())='" + module + "']";
        try {
            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
            WebElement tabElement = Driver.get().findElement(By.xpath(tabLocator));
            new Actions(Driver.get()).moveToElement(tabElement).pause(200).click(tabElement).build().perform();
        } catch (Exception e) {
            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
        }
        try {
            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
            // BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath(moduleLocator)));
            Driver.get().findElement(By.xpath(moduleLocator)).click();
        } catch (Exception e) {
//            BrowserUtils.waitForStaleElement(Driver.get().findElement(By.xpath(moduleLocator)));
            BrowserUtils.clickWithTimeOut(Driver.get().findElement(By.xpath(moduleLocator)),  5);
        }
    }
}
