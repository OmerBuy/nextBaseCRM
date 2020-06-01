package com.nextBaseCRM.tests.userStories4;

import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.pages.Poll;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AC_3 {

    //3. User should be able to attach link by clicking on the link icon.
    @BeforeMethod
    public void pollSetUp() {
        new LoginPage().loginAsHR();
        new Poll().navigateToModule("Activity Stream","Poll");
    }

    @Test
    public void tc1() {






    }
}
