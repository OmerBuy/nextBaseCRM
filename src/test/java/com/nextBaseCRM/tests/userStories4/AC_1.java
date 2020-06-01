package com.nextBaseCRM.tests.userStories4;

import com.nextBaseCRM.pages.BasePage;
import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.pages.Poll;
import com.nextBaseCRM.tests.TestBase;
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
    public void tc1() {






    }
}
