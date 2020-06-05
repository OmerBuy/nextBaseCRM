package com.nextBaseCRM.tests.userStory4;

import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.pages.Poll;
import com.nextBaseCRM.tests.TestBase;
import com.nextBaseCRM.utilities.BrowserUtils;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AC_10 extends TestBase {

    // 2. User should be able to add users from selecting contact from E-mail user,
    //    Employees and Departments and Recent contact lists.
    @BeforeMethod
    public void pollSetUp() {
        new LoginPage().loginAsHR();
        new Poll().navigateToModule("Activity Stream", "Poll");
    }
    /*
    User should be able to Add questions and multiple answers;
    user can provide multiple choice to attendees
     by selecting the Allow multiple choice checkbox."
    */

    @Test
    public void tc1(){
        Poll poll = new Poll();

        poll.topicBtn.click();
        BrowserUtils.waitFor(7);

        BrowserUtils.clickWithJS(poll.topicText);


        String myMessage = "Questions?";
        poll.topicText.sendKeys(myMessage);

        BrowserUtils.clickWithJS(poll.messageBox);

        BrowserUtils.waitFor(8);


        String myQuestion = "What is your Job";
        poll.messageBox.sendKeys(myQuestion);

        poll.iFrame.sendKeys(myQuestion);






    }

}
