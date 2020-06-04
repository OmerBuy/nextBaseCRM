package com.nextBaseCRM.tests.userStory6;

import com.nextBaseCRM.pages.AppreciationPage;
import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.tests.TestBase;
import com.nextBaseCRM.utilities.BrowserUtils;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_US6_AC4 extends TestBase {

    @Test
    public void sendingVideoTest(){

        extentLogger = report.createTest("Sending video Test");

        extentLogger.info("Login as HelpDesk");
        new LoginPage().loginAsHelpdesk();

        AppreciationPage appreciationPage = new AppreciationPage();

        extentLogger.info("Navigate to Appreciation");
        appreciationPage.navigateToModule("Activity Stream","Appreciation");

        extentLogger.info("Click insert video icon");
        appreciationPage.insertVideoIcon.click();
        String videoUrl = "https://www.youtube.com/watch?v=sJeFA6HEQK8";

        extentLogger.info("send link and click enter");
        appreciationPage.videoSourceInputBox.sendKeys("videoUrl" + Keys.ENTER);
        extentLogger.info("Click send button");
        appreciationPage.sendButton.click();
        BrowserUtils.waitFor(3);

        extentLogger.info("Verify that the error message appears");
        Assert.assertTrue(appreciationPage.errorMessageElement.isDisplayed());

        extentLogger.pass("PASS: Insert Video Test");

    }



}
