package com.nextBaseCRM.pages;

import com.nextBaseCRM.utilities.BrowserUtils;
import com.nextBaseCRM.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    @FindBy(id = "pagetitle")
    public WebElement pageSubTitle;

    @FindBy(id = "user-name")
    public WebElement userName;

    @FindBy(linkText = "Log out")
    public WebElement logOutLink;

    @FindBy(linkText = "My User")
    public WebElement myProfile;

    @FindBy(id="logo_24_text")
    public WebElement homeButton;


    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }


    public String getPageSubTitle() {

        return pageSubTitle.getText();
    }

    public String getUserName(){
        BrowserUtils.waitForVisibility(userName, 5);
        return userName.getText();
    }


    public void logOut(){
        BrowserUtils.waitFor(2);
        BrowserUtils.clickWithJS(userName);
        BrowserUtils.clickWithJS(logOutLink);
    }
    public void goToMyProfile(){
        BrowserUtils.waitForClickablility(userName, 5).click();
        BrowserUtils.waitForClickablility(myProfile, 5).click();

    }

    public void navigateToModule (String module , String tab) {

        String moduleLocator = "//span[normalize-space()='" + module + "' and contains(@class, 'menu-item-link-text')]";
        String tabLocator = "//span/span[contains(text(),'"+ tab +"')]";

        BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath(moduleLocator)));
        Driver.get().findElement(By.xpath(moduleLocator)).click();

        // this if statement is added to handle the situation to click "MORE" tab
        if (tab.equals("File") || tab.equals("Appreciation")||tab.equals("Announcement")||tab.equals("Workflow")){
            Driver.get().findElement(By.id("feed-add-post-form-link-text")).click();
            List<WebElement> moreElements = Driver.get().findElements(By.cssSelector(".menu-popup-item.menu-popup-no-icon"));
            for (WebElement element : moreElements) {
                if(element.getText().equals(tab)){
                    element.click();
                    return;
                }
            }
        }
        BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath(tabLocator)));
        Driver.get().findElement(By.xpath(tabLocator)).click();
    }

    public void navigateWithSiteMap (String moduleName){
        WebElement siteMap = Driver.get().findElement(By.id("sitemap-menu"));
        siteMap.click();
        List<WebElement> sectionItems = Driver.get().findElements(By.className("sitemap-section-item"));

        for (WebElement item : sectionItems) {
            if(item.getText().equalsIgnoreCase(moduleName)){
                item.click();
                break;
            }
        }
    }

}