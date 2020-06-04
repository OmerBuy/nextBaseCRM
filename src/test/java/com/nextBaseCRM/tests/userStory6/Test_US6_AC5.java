package com.nextBaseCRM.tests.userStory6;

import com.nextBaseCRM.pages.AppreciationPage;
import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.tests.TestBase;
import com.nextBaseCRM.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_US6_AC5 extends TestBase {

    @Test
    public void creatingQuoteTest() {

        extentLogger = report.createTest("Creating Quote Test");

        extentLogger.info("Login as HelpDesk");
        new LoginPage().loginAsHelpdesk();

        AppreciationPage appreciationPage = new AppreciationPage();

        extentLogger.info("Navigate to Appreciation");
        appreciationPage.navigateToModule("Activity Stream", "Appreciation");

        extentLogger.info("Click insert quote icon");
        appreciationPage.quateTextIcon.click();

        String quote = "The future belongs to those who believe in the beauty of their dreams";
        extentLogger.info("Send a quote");
        appreciationPage.textArea.sendKeys(quote);
        extentLogger.info("Click sent button");
        appreciationPage.sendButton.click();

        BrowserUtils.waitFor(2);

        String actualQuote = appreciationPage.lastAddedQuote.getText();
        extentLogger.info("Verify the sent quote");
        Assert.assertEquals(actualQuote,quote,"Verify the sent quote");

        extentLogger.pass("PASS: Verify the quote that was just sent");


    }



}
