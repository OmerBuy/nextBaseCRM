package com.nextBaseCRM.tests.userStory6;

import com.nextBaseCRM.pages.AppreciationPage;
import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.tests.TestBase;
import com.nextBaseCRM.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Test_US6_AC3 extends TestBase {

    @Test
    public void attachingLink(){

        extentLogger = report.createTest("Attaching Link Test");

        extentLogger.info("Login as marketing");
        new LoginPage().loginAsMarketing();

        AppreciationPage appreciationPage = new AppreciationPage();

        extentLogger.info("Navigate to Appreciation");
        appreciationPage.navigateToModule("Activity Stream", "Appreciation");

        appreciationPage.sendLink("some text", "some URL" + Keys.ENTER);
        BrowserUtils.clickWithJS(appreciationPage.sendButton);
    }
}
