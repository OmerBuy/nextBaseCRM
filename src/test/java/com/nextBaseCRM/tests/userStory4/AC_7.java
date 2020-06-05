package com.nextBaseCRM.tests.userStory4;

import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.pages.Poll;
import com.nextBaseCRM.tests.TestBase;
import com.nextBaseCRM.utilities.BrowserUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AC_7 extends TestBase {

    // 2. User should be able to add users from selecting contact from E-mail user,
    //    Employees and Departments and Recent contact lists.
    @BeforeMethod
    public void pollSetUp() {
        new LoginPage().loginAsHR();
        new Poll().navigateToModule("Activity Stream", "Poll");
    }
    //User should be able to click on Visual Editor and see the editor
    // text-bar displays on top of the message box.
    @Test
    public void tc1(){

        Poll poll = new Poll();
        BrowserUtils.waitFor(4);

        BrowserUtils.clickWithJS(poll.visiulEditor);

        poll.messageBox.isDisplayed();

    }
}
