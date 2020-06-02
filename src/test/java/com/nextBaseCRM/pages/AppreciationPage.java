package com.nextBaseCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppreciationPage extends BasePage{

    @FindBy(xpath ="(//span[@title='Upload files'])[1]")
    public WebElement uploadFilesIcon;

    @FindBy(xpath ="(//span[@title='Link'])[1]")
    public WebElement linkIcon;

    @FindBy (xpath = "//*[@title='Insert video']")
    public WebElement insertVideoIcon;

    @FindBy (xpath = "//*[@title='Quote text']")
    public WebElement quateTextIcon;

    @FindBy (xpath = "(//*[@title='Add mention'])[1]")
    public WebElement addMentionIcon;

    @FindBy (xpath = "//*[@title='Add tag']")
    public WebElement addTagIcon;

    @FindBy (xpath = "(//*[@class='feed-add-post-form-but-cnt feed-add-videomessage'])[1]")
    public WebElement recordVideoIcon;

    @FindBy (xpath = "(//*[@title='Visual editor'])[1]")
    public WebElement visualEditorIcon;

    @FindBy (xpath = "//*[@title='Topic']")
    public WebElement topicIcon;

    @FindBy (id = "POST_TITLE")
    public WebElement messageTopicTextBox;

    @FindBy (id ="linkidPostFormLHE_blogPostForm-text")
    public WebElement linkTextInputbox;

    @FindBy (id ="linkidPostFormLHE_blogPostForm-href")
    public WebElement linkUrlInputbox;

    @FindBy (id ="video_idPostFormLHE_blogPostForm-source")
    public WebElement videoSourceInputBox;
    @FindBy (id="undefined")
    public  WebElement videoSaveBtn;

    @FindBy (xpath = "//div[@id='player']/following-sibling::noscript")
    public WebElement dataOfTHeSentVideo;

    //******
    @FindBy (id = "feed-add-post-form-tab-message")
    public WebElement messageTab;

    @FindBy(xpath="(//img)[4]")
    public WebElement lastUploadedPhoto;
}
