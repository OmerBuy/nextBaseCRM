package com.nextBaseCRM.pages;

import com.nextBaseCRM.utilities.BrowserUtils;
import com.nextBaseCRM.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

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

    @FindBy(className = "bxhtmled-textarea")
    public WebElement textArea;

    @FindBy(xpath="(//img)[4]")
    public WebElement lastUploadedPhoto;

    @FindBy(xpath = "(//div[@class='feed-post-text-block-inner-inner']/a[@target='_blank'])[1]")
    public WebElement lastAddedLink;

    @FindBy(xpath = "(//table[@class='blogquote'])[1]")
    public WebElement lastAddedQuote;




    @FindBy (className = "feed-add-post-destination-text")
    public WebElement toAllEmployees;

    @FindBy (xpath = "//span[@class='feed-add-post-destination feed-add-post-destination-users']")
    public WebElement destinationBox;

    //recent locator that appears after clicking to allEmployees
    @FindBy (xpath ="//*[@class='bx-finder-box-tab bx-lm-tab-department']")
    public WebElement recent;

    //empolyees locator that appears after clicking to allEmployees
    @FindBy (xpath ="//*[.='Employees and departments']")
    public WebElement employeesAndDepartments;

    //emailUsers locator that appears after clicking to allEmployees
    @FindBy (xpath ="//*[@class='bx-finder-box-tab bx-lm-tab-department']")
    public WebElement emailUsers;






    @FindBy(className ="bxhtmled-textarea")
    public WebElement sendMessageInput;

    @FindBy(name="bxu_files[]")
    public WebElement uploadFilesAndImages;

    @FindBy(xpath="(//span[.='Download from external drive'])[1]")
    public WebElement downloadFromExternalDrive;

    @FindBy(xpath="(//span[.='Select document from Bitrix24'])[1]")
    public WebElement selectDocumentFromBitrix24;

    @FindBy (id="blog-submit-button-save")
    public WebElement sendButton;

    @FindBy (id="blog-submit-button-cancel")
    public WebElement uploadFileCancelButton;

    @FindBy (className = "feed-add-info-text")
    public WebElement errorMessageElement;

    // Select Document Button under uploading files icon
    @FindBy (xpath = "//span[.='Select document']")
    public  WebElement selectDocumentBtn;








    public void sendMessage(String text){

        messageTab.click();
        sendMessageInput.sendKeys(text);
        sendButton.click();
    }

    public void uploadFilesFromPC(String relativePath){

        String projectPath = System.getProperty("user.dir");
        String filePath = projectPath+ "/"+relativePath;

        messageTab.click();
        BrowserUtils.waitForClickablility(uploadFilesIcon,5);
        uploadFilesIcon.click();
        uploadFilesAndImages.sendKeys(filePath);
        try {
            Driver.get().switchTo().alert().accept();
        }catch (NoAlertPresentException e){
            e.printStackTrace();
        }
        BrowserUtils.waitForClickablility(sendButton,3);
        sendButton.click();
    }

    public void uploadFilesFromExternalDrive(String address){

        messageTab.click();
        BrowserUtils.waitForClickablility(uploadFilesIcon,5);
        uploadFilesIcon.click();
        downloadFromExternalDrive.click();
        Driver.get().findElement(By.name("title_value")).sendKeys(address);
        selectDocumentBtn.click();

        sendButton.click();
    }

    public void uploadFilesFromBitrix24(String fileName){

        messageTab.click();
        BrowserUtils.waitForClickablility(uploadFilesIcon,5);
        uploadFilesIcon.click();
        selectDocumentFromBitrix24.click();
        List<WebElement> items=Driver.get().findElements(By.cssSelector(".bx-file-dialog-content-wrap>div"));

        for(WebElement item:items){
            //BrowserUtils.waitForStaleElement(item);
            if(item.getText().contains(fileName)){
                item.click();
                break;
            }

        }
        selectDocumentBtn.click();
        BrowserUtils.waitForClickablility(sendButton,2);
        sendButton.click();
    }

    public void sendToEmployeesAndDepartments(String employeeOrDepartmentName){

        toAllEmployees.click();

        BrowserUtils.clickWithJS(employeesAndDepartments);

        List<WebElement> mailList = Driver.get().findElements(By.cssSelector(".bx-finder-company-department-employee-name"));

        for (WebElement webElement : mailList) {
            if(webElement.getText().equals(employeeOrDepartmentName)){
                webElement.click();
                break;
            }
        }
    }

    public void sendFromRecents(String recentUsername){

        sendMessageInput.click();
        toAllEmployees.click();

        BrowserUtils.clickWithJS(recent);

        List<WebElement> mailList = Driver.get().findElements(By.cssSelector(".bx-finder-company-department-employee-name"));

        for (WebElement webElement : mailList) {
            if(webElement.getText().equals(recentUsername)){
                webElement.click();
                break;
            }
        }
    }

    public void sendLink (String linkText, String linkURL){

        linkIcon.click();
        linkTextInputbox.sendKeys(linkText);
        linkUrlInputbox.sendKeys(linkURL+ Keys.ENTER);

        sendButton.click();

    }

    public String getNameOfLastUploadedPhoto(){
        BrowserUtils.waitFor(2);
        return lastUploadedPhoto.getAttribute("data-bx-title");
    }

    public WebElement getUploadFileElement(String fileName){
        String xpath = "(//img[contains(@data-bx-title,'" + fileName +"')])[1]";
        return Driver.get().findElement(By.xpath(xpath));
    }


}
