package com.nextBaseCRM.tests.userStory6;

import com.nextBaseCRM.pages.AppreciationPage;
import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.tests.TestBase;
import com.nextBaseCRM.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
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

        appreciationPage.sendLink("link", "some URL" + Keys.ENTER);

        BrowserUtils.waitFor(2);

        String actualLink = appreciationPage.lastAddedLink.getText();
        String expectedLink ="link";

        extentLogger.info("Verify the link");
        Assert.assertEquals(actualLink,expectedLink,"Verify the link just was sent");

        extentLogger.pass("PASS: Attaching Link");

    }
}
