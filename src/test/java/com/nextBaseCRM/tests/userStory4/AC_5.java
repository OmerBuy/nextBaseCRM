package com.nextBaseCRM.tests.userStory4;

import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.pages.Poll;
import com.nextBaseCRM.tests.TestBase;
import com.nextBaseCRM.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AC_5 extends TestBase {

// 5. User should be able to create a quote by clicking on the Comma icon.
    @BeforeMethod
    public void pollSetUp() {
        new LoginPage().loginAsHR();
        new Poll().navigateToModule("Activity Stream","Poll");
    }

    @Test
    public void tc1() {

        Poll poll = new Poll();

        BrowserUtils.clickWithJS(poll.quoteIcon);

        Assert.assertTrue(poll.quoteDisplayed.isEnabled(),"Quote is displayed");





    }
}
