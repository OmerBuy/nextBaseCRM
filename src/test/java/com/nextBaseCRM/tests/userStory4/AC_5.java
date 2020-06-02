package com.nextBaseCRM.tests.userStory4;

import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.pages.Poll;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AC_5 {

// 5. User should be able to create a quote by clicking on the Comma icon.
    @BeforeMethod
    public void pollSetUp() {
        new LoginPage().loginAsHR();
        new Poll().navigateToModule("Activity Stream","Poll");
    }

    @Test
    public void tc1() {






    }
}
