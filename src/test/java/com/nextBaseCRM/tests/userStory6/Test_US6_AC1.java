package com.nextBaseCRM.tests.userStory6;

import com.nextBaseCRM.pages.AppreciationPage;
import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.tests.TestBase;
import com.nextBaseCRM.utilities.BrowserUtils;
import org.testng.annotations.Test;

public class Test_US6_AC1 extends TestBase {

    @Test
    public void test(){

        new LoginPage().loginAsHR();
        AppreciationPage appreciationPage = new AppreciationPage();
        appreciationPage.navigateToModule("Activity Stream" , "Appreciation");

        BrowserUtils.waitFor(5);
    }
}
