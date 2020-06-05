package com.nextBaseCRM.tests.userStory4;

import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.pages.Poll;
import com.nextBaseCRM.tests.TestBase;
import com.nextBaseCRM.utilities.BrowserUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AC_1 extends TestBase {

    //1. User should be able to click on upload files icon to upload files and pictures from local disks,
    //   download from external drive, select documents from bixtrix24, and create files to upload.
    @BeforeMethod
    public void pollSetUp() {
        new LoginPage().loginAsHR();
        new Poll().navigateToModule("Activity Stream","Poll");
    }

    @Test
    public void tc1() throws InterruptedException {

        Poll poll = new Poll();
        Thread.sleep(2000);
        poll.uploadIcon.click();
        Thread.sleep(2000);
        poll.differentUploadChoices("Select document from Bitrix24","My Drive");
    //    poll.uploadedFiles.click();
        poll.exampleDocuments.click();
        poll.selectDocumentButton.click();
        System.exit(1);

        poll.sendButton.click();

        System.exit(1);

    }

    @Test
    public void tc2() throws InterruptedException {

        Poll poll = new Poll();
        Thread.sleep(2000);
        poll.uploadIcon.click();
        Thread.sleep(2000);
        poll.differentUploadChoices("Download from external drive","Office 365");




    }
    @Test
    public void tc3() throws InterruptedException {

        Poll poll = new Poll();
        Thread.sleep(2000);
        poll.uploadIcon.click();
        Thread.sleep(2000);
        poll.differentUploadChoices("Google Docs","Office 365");




    }

    @Test
    public void tc4() throws InterruptedException {

        String filepath="C:\\Users\\muham\\Desktop\\SDET\\Coding\\nextBaseCRM\\src\\test\\resources\\RegressionTest10.jpg";
        Poll poll = new Poll();
        Thread.sleep(2000);
        poll.uploadIcon.click();
        Thread.sleep(2000);
        poll.uploadFilesdrag.sendKeys(filepath);
        BrowserUtils.clickWithJS(poll.editName);
        WebElement currentElement = driver.switchTo().activeElement();
        String aa =Keys.chord(Keys.CONTROL+"a");
        //currentElement.sendKeys(Keys.CONTROL+"a");
        currentElement.sendKeys(aa);
        currentElement.sendKeys(Keys.SHIFT+"GrouptenWasHere");
        System.exit(1);

        poll.sendButton.click();



        System.exit(1);



    }

    @Test
    public void tc5() throws InterruptedException {

        Poll poll = new Poll();
        Thread.sleep(2000);
        poll.uploadIcon.click();
        Thread.sleep(2000);
        poll.attachNameFile("test1","C:\\Users\\muham\\Desktop\\download.jpg");
        poll.sendButton.click();

        System.exit(1);

    }
}
