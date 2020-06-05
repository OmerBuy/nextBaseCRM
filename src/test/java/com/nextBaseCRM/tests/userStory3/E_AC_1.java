package com.nextBaseCRM.tests.userStory3;

import com.nextBaseCRM.pages.EventPage;
import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.tests.TestBase;
import com.nextBaseCRM.utilities.BrowserUtils;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class E_AC_1 extends TestBase {

    EventPage eventPage = new EventPage();

    public void navigateToEvent(){

        extentLogger.info("login user:helpdesk19@cybertekschool.com, pw:UserUser");
        new LoginPage().loginAsHelpdesk();

        extentLogger.info("navigate to Event module");
        eventPage.navigateToModule("Activity Stream","Event");
        BrowserUtils.waitFor(4);

    }

    @Test
    public void uploadFile(){

        extentLogger = report.createTest("Upload Files");
        navigateToEvent();

        extentLogger.info("Upload Image option");
        eventPage.uploadIcon.click();

        extentLogger.info("upload Image");
        eventPage.ImageUpload();
        BrowserUtils.waitFor(4);

        extentLogger.info("insert document from Bitrix");
        eventPage.documentFromBitrix();
        BrowserUtils.waitFor(3);

    }

    @Test
    public void uploadLink(){

        extentLogger = report.createTest("Insert link");
        navigateToEvent();
        extentLogger.info("insert link");
        eventPage.insertLink();


    }

    @Test
    public void uploadVideoLink(){

        extentLogger = report.createTest("Upload video link");
        navigateToEvent();

        extentLogger.info("insert video");
        eventPage.insertvideoLink();

        wait.until(ExpectedConditions.visibilityOf(eventPage.videoTitle));
        eventPage.videoLinkSave.click();

    }

}
