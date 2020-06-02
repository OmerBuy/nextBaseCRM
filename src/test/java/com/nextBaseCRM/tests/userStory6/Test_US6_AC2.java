package com.nextBaseCRM.tests.userStory6;

import com.nextBaseCRM.pages.AppreciationPage;
import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_US6_AC2 extends TestBase {

    @Test
    public void sendingToEmployeesAndDepartments(){

        extentLogger = report.createTest("Sending To Employees And Departments");
        extentLogger.info("Login as Marketing");
        new LoginPage().loginAsMarketing();

        AppreciationPage appreciationPage = new AppreciationPage();

        extentLogger.info("Select a given mail inside the list");
        appreciationPage.sendToEmployeesAndDepartments("helpdesk19@cybertekschool.com");

        String actualText = appreciationPage.destinationBox.getText();
        String expectedText = "helpdesk19@cybertekschool.com";

        extentLogger.info("Verify the selected mail");
        Assert.assertEquals(actualText,expectedText,"verify the selected email");

        extentLogger.pass("PASS");



    }




}
