package com.nextBaseCRM.pages;

import com.nextBaseCRM.utilities.BrowserUtils;
import com.nextBaseCRM.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class TaskAndLocators extends BasePage{


        @FindBy(id = "bx-b-uploadfile-blogPostForm")
        public WebElement uploadIcon;

        @FindBy(xpath = "//span[contains(text(),\"All employees\")]")
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

        @FindBy(xpath = "//input[@name=\"bxu_files[]\"]")
        public WebElement uploadFilesdrag;

        @FindBy(css = ".files-name-edit-btn")
        public WebElement editName;

        @FindBy(xpath = "//a[contains(text(),'Employees and departments')]")
        public WebElement addEmployesByDepartment;

        @FindBy(xpath = "//a[contains(@id,'destDepartmentTab_destination')]")
        public WebElement getAddEmployeesByRecent;

        @FindBy(xpath = "//a[contains(@id,'destEmailTab_destination')]")
        public WebElement getAddEmployeesByEmail;

        @FindBy(xpath = "//div[contains(text(),'marketing19@cybertekschool.com')]")
        public WebElement addMarketing19;

        @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
        public WebElement textFrame;

        @FindBy(xpath = "//body[@contenteditable=\"true\"]")
        public WebElement writeText;

        @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
        public WebElement linkUrl;

        @FindBy(id="linkidPostFormLHE_blogPostForm-text")
        public WebElement textUrl;

        @FindBy(id = "cancel")
        public WebElement linkCancel;

        @FindBy(id="video_idPostFormLHE_blogPostForm-source")
        public WebElement videoUrl;

        @FindBy(id ="video_idPostFormLHE_blogPostForm-title")
        public WebElement videoSave;

        @FindBy(xpath = "(//span[contains(@class,'feed-add-post-form-but feed-add-mention')])[1]")
        public WebElement mentionButton;

        @FindBy(xpath = "//a[contains(@class,'bx-finder-box-tab bx-lm-tab-department')]")
        public WebElement employeeBtn;

        @FindBy(xpath = "//div[contains(@class,'bx-finder-company-department-arrow')]")
        public WebElement dropDownList;

        @FindBy (xpath = "(//input[contains(@type,'checkbox')])[2]")
        public WebElement checkBoxBtn;

        @FindBy (id = "lhe_button_editor_blogPostForm")
        public WebElement visiulEditor;

        @FindBy (xpath = "//body[contains(@contenteditable,'true')]")
        public WebElement messageBox;

        @FindBy (xpath = "//span[contains(@title,'Topic')]")
        public WebElement topicBtn;

        @FindBy (id = "POST_TITLE")
        public WebElement topicText;

        @FindBy(xpath = "(//iFrame)[1]")
        public WebElement iFrame;



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

        public void attachNameFile(String name ,String filePath){
            // String filepath="C:\\Users\\muham\\Desktop\\SDET\\Coding\\nextBaseCRM\\src\\test\\resources\\RegressionTest10.jpg";
            uploadFilesdrag.sendKeys(filePath);
            BrowserUtils.clickWithJS(editName);
            WebElement currentElement = Driver.get().switchTo().activeElement();
            String aa = Keys.chord(Keys.CONTROL+"a");
            //currentElement.sendKeys(Keys.CONTROL+"a");
            currentElement.sendKeys(aa);
            currentElement.sendKeys(Keys.SHIFT+name);
        }

        public void employeeList(String employeeName) {
            List<WebElement> elementList = Driver.get().findElements(By.cssSelector(".bx-finder-company-department-employee.bx-finder-element"));
            //List<String> elementsText = BrowserUtils.getElementsText(elementList);
            for (WebElement element : elementList) {
                if (element.getText().contains(employeeName)) {
                    element.click();
                    break;
                }
            }





        }

    }


