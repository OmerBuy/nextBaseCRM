package com.nextBaseCRM.tests.userStory6;

import com.nextBaseCRM.pages.AppreciationPage;
import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.tests.TestBase;
import com.nextBaseCRM.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_US6_AC1 extends TestBase {

    @Test
    public void uploadFilesFromPCTest(){

        extentLogger = report.createTest("Upload Files From PC Test");
        extentLogger.info("Login as Marketing");
        new LoginPage().loginAsMarketing();

        AppreciationPage appreciationPage = new AppreciationPage();

        extentLogger.info("Send Capture File");
        appreciationPage.uploadFilesFromPC("src/test/resources/Capture.PNG");
        BrowserUtils.waitFor(2);

        WebElement fileElement = appreciationPage.getUploadFileElement("Capture");
        Assert.assertTrue(fileElement.isDisplayed());
    }

    @Test
    public void uploadFilesFromExternalDriveTest(){

        extentLogger = report.createTest("Selecting Files from External device");

        extentLogger.info("Login as Marketing");
        new LoginPage().loginAsMarketing();

        AppreciationPage appreciationPage = new AppreciationPage();
        appreciationPage.uploadFilesFromExternalDrive("Some address");

        extentLogger.pass("PASSED: External Drive");
    }

    @Test
    public void uploadFilesFromBitrix24Test(){

        extentLogger = report.createTest("Uploading Files from Bitrix24");

        extentLogger.info("Login as Marketing");
        new LoginPage().loginAsMarketing();

        AppreciationPage appreciationPage = new AppreciationPage();
        appreciationPage.uploadFilesFromBitrix24("Capture");

        extentLogger.pass("PASSED: Upload from Bitrix24");
    }




}
