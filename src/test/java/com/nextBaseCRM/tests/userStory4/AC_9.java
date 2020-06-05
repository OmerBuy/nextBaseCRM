package com.nextBaseCRM.tests.userStory4;

import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.pages.Poll;
import org.testng.annotations.BeforeMethod;

public class AC_9 {


    // 2. User should be able to add users from selecting contact from E-mail user,
    //    Employees and Departments and Recent contact lists.
    @BeforeMethod
    public void pollSetUp() {
        new LoginPage().loginAsHR();
        new Poll().navigateToModule("Activity Stream", "Poll");
    }
    /*
    User should be able to click on ""Record Video"" tab to record a video and
    attach it with the message.
     */

    //It does not work in the page, probably there is a bug


}
