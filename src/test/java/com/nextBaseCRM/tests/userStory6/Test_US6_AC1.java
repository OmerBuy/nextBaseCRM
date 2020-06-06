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

        extentLogger.info("Navigate to Appreciation");
        appreciationPage.navigateToModule("Activity Stream", "Appreciation");

        extentLogger.info("Send Ja-va File");
        appreciationPage.uploadFilesFromPC("src/test/resources/Ja-va.jpg");
        BrowserUtils.waitFor(2);

        String expectedFileName = "Ja-va";
        extentLogger.info("Get the name of the uploaded file");

        String actualFileName = appreciationPage.getNameOfLastUploadedPhoto();
        Assert.assertTrue(actualFileName.contains(expectedFileName));

        extentLogger.pass("PASS: Upload from PC");
    }

    @Test
    public void uploadFilesFromExternalDriveTest(){

        extentLogger = report.createTest("Selecting Files from External device");

        extentLogger.info("Login as HR");
        new LoginPage().loginAsHR();

        AppreciationPage appreciationPage = new AppreciationPage();

        extentLogger.info("Navigate to Appreciation");
        appreciationPage.navigateToModule("Activity Stream", "Appreciation");

        extentLogger.info("Send some address");
        appreciationPage.uploadFilesFromExternalDrive("Some address");

        extentLogger.info("After sending Verify that the system displays the error message");
        String actualErrorMessage = appreciationPage.errorMessageElement.getText();

        String expectedErrorMessage = "The message title is not specified";
        extentLogger.info("Verify the error message");
        Assert.assertEquals(actualErrorMessage,expectedErrorMessage,"Verify the error message");

        extentLogger.pass("PASSED: External Drive");
    }

    @Test
    public void uploadFilesFromBitrix24Test(){

        extentLogger = report.createTest("Uploading Files from Bitrix24");

        extentLogger.info("Login as Marketing");
        new LoginPage().loginAsMarketing();

        AppreciationPage appreciationPage = new AppreciationPage();

        extentLogger.info("Navigate to Appreciation");
        appreciationPage.navigateToModule("Activity Stream", "Appreciation");

        extentLogger.info("Send the photo among recent named Ja-va");
        appreciationPage.uploadFilesFromBitrix24("Ja-va");

        String expectedFileName = "Ja-va";

        extentLogger.info("Get the name of the last photo");
        String actualFileName = appreciationPage.getNameOfLastUploadedPhoto();

        extentLogger.info("Verify that last photo name is expected file name");
        Assert.assertTrue(actualFileName.contains(expectedFileName),"Verify that file is displayed");

        extentLogger.pass("PASSED: Upload from Bitrix24");
    }





}
