package com.nextBaseCRM.tests.userStory4;

import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.pages.Poll;
import com.nextBaseCRM.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AC_4 extends TestBase {

    // 4. User should be able to insert videos by clicking on the video icon and entering the video URL.
    @BeforeMethod
    public void pollSetUp() {
        new LoginPage().loginAsHR();
        new Poll().navigateToModule("Activity Stream","Poll");
    }

    @Test
    public void tc1() {






    }
}
