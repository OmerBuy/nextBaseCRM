package com.nextBaseCRM.tests.userStory4;

import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.pages.Poll;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AC_2 {

    // 2. User should be able to add users from selecting contact from E-mail user,
    //    Employees and Departments and Recent contact lists.
    @BeforeMethod
    public void pollSetUp() {
        new LoginPage().loginAsHR();
        new Poll().navigateToModule("Activity Stream","Poll");
    }

    @Test
    public void tc1() {






    }
}
