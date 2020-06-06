package com.nextBaseCRM.pages;

import com.nextBaseCRM.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class EventPage extends BasePage {

    @FindBy(css = "#bx-b-uploadfile-blogPostForm_calendar")
    public WebElement uploadIcon;

    @FindBy(xpath = "//input[@name='bxu_files[]']")
    public WebElement uploadFilesAndImages;

    @FindBy(xpath = "(//span[contains(text(),'Select document from Bitrix24')])[3]")
    public WebElement documentBitrix;

    @FindBy(xpath = "//a[contains(text(),'yellow-rose-transparent.png')]")
    public WebElement yellowRose;

    @FindBy(css = ".popup-window-button.popup-window-button-accept")
    public WebElement selectDocument;

    @FindBy(xpath = "(//span[@title='Link'])[2]")
    public WebElement linkIcon;

    @FindBy(css = "#linkoCalEditorcal_3Jcl-href")
    public WebElement linkInputBox;

    @FindBy(css = "#linkoCalEditorcal_3Jcl-text")
    public WebElement linkTextBox;

    @FindBy(xpath = "//input[@name='undefined']")
    public WebElement saveBtn;

    @FindBy (xpath = "(//span[@title='Insert video'])[2]")
    public WebElement videoIcon;

    @FindBy(css = "#video_oCalEditorcal_3Jcl-source")
    public WebElement videoSource;

    @FindBy(css = "#video_oCalEditorcal_3Jcl-title")
    public WebElement videoTitle;

    @FindBy(css = "undefined")
    public WebElement videoLinkSave;





    public void ImageUpload(){

        String projectPath = System.getProperty("user.dir");
        String relativePath = "src/test/resources/Ja-va.jpg";
        String filePath = projectPath+"/"+relativePath;

        uploadFilesAndImages.sendKeys(filePath);

        }

    public void documentFromBitrix() {

        documentBitrix.click();
        BrowserUtils.waitFor(3);
        yellowRose.click();
        selectDocument.click();


    }

    public void insertLink(){

        linkIcon.click();
        BrowserUtils.waitFor(3);
        linkTextBox.sendKeys("https://www.amazon.com/");
        BrowserUtils.waitFor(3);
        linkInputBox.sendKeys("amazon.com");
        BrowserUtils.waitFor(3);
        saveBtn.click();
    }

    public void insertvideoLink(){

        videoIcon.click();
        BrowserUtils.waitFor(3);
        videoSource.sendKeys("https://www.youtube.com/watch?v=TxBj8R7XKe4&t=57s");
    }







    }


