package com.nextBaseCRM.tests.userStory4;

import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.pages.Poll;
import com.nextBaseCRM.tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AC_8 extends TestBase {

    // 2. User should be able to add users from selecting contact from E-mail user,
    //    Employees and Departments and Recent contact lists.
    @BeforeMethod
    public void pollSetUp() {
        new LoginPage().loginAsHR();
        new Poll().navigateToModule("Activity Stream", "Poll");
    }
    /*
    User should be able to click on the Topic icon to see the poll Topic text box
    displays on top of the message box.

     */

    @Test
    public void tc1(){
        Poll poll = new Poll();

        poll.topicBtn.click();

        String expectedText = "Topic";
        String actualText = poll.topicText.getAttribute("placeholder");

        Assert.assertEquals(actualText,expectedText, "Verify Text");




    }



}
