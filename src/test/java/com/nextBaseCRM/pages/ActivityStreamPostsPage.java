package com.nextBaseCRM.pages;

import com.nextBaseCRM.utilities.BrowserUtils;
import com.nextBaseCRM.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class ActivityStreamPostsPage extends BasePage {

    @FindBy(xpath = "(//*[@*='bx-ilike-left-wrap']/a)")
    public WebElement postLikeButton;

    @FindBy(xpath = "(//*[@*='feed-inform-comments']/a)")
    public WebElement postCommentButton;

    @FindBy(xpath = "(//*[@*='feed-inform-follow'])")
    public WebElement postFollowButton;

    @FindBy(xpath = "(//span[@class='feed-inform-follow']")
    public WebElement postUnFollowButton;

    @FindBy(xpath = "//span[@class='feed-post-more-text']")
    public WebElement postMoreButton;

    @FindBy(xpath = "//*[@id=\"feed-post-contentview-cnt-BLOG_POST-222\"]")
    public WebElement postViewButton;

    @FindBy(xpath = "//*[@id=\"log_entry_favorites_936\"]")
    public WebElement postAddFavorites;

    @FindBy(xpath = "//a[@class='feed-post-user-name']")
    public WebElement userName;

    @FindBy(xpath = "//*[text()='Contact information']")
    public WebElement userInformation;


    @FindBy(xpath = "//button[contains(@id,'lhe_button_submit_blogCommentForm')]")
    public WebElement postSubmitButton;

    @FindBy(xpath = "(//div[@class='feed-item-wrap'])//iframe[@class='bx-editor-iframe']")
    public WebElement frame;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement writeText;

    @FindBy(xpath = "(//*[@title='Add to favorites'])")
    public WebElement starIcon;

    public void viewLikeOrReviewersComments(String num){

        WebElement element = Driver.get().findElement(By.xpath("(//div[starts-with(@class,'feed-com-block-cover')])[" + num + "]"));
        element.click();

    }

    public void addClickingStarIcon(String num) {

        WebElement element = Driver.get().findElement(By.xpath("(//*[@title='Add to favorites'])[" + num + "]"));
        element.click();
    }


    public void  makeCommentLikeOrFollow(String str,String num,String message){

        WebElement element = Driver.get().findElement(By.xpath("(//a[contains(text(),'" + str + "')])[" + num + "]"));
        element.click();
        Driver.get().switchTo().frame(frame);
       // WebElement editable = Driver.get().switchTo().activeElement();
        //writeText.sendKeys(mesaj);
       // writeText.sendKeys(message+ Keys.ENTER);
        writeText.sendKeys(message);
        Driver.get().switchTo().defaultContent();
        postSubmitButton.click();



    }

}

