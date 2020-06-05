package com.nextBaseCRM.tests.userStory4;

import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.pages.Poll;
import com.nextBaseCRM.tests.TestBase;
import com.nextBaseCRM.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class AC_6 extends TestBase {

    // 2. User should be able to add users from selecting contact from E-mail user,
    //    Employees and Departments and Recent contact lists.
    @BeforeMethod
    public void pollSetUp() {
        new LoginPage().loginAsHR();
        new Poll().navigateToModule("Activity Stream", "Poll");

    }
        /*
     6. User should be able to add mention by clicking on the Add mention icon and select
     contacts from the lists provided in dropdown.
    */

    @Test
    public void tc1() throws InterruptedException {

        Poll poll = new Poll();
        Thread.sleep(4000);

        poll.mentionButton.click();
        Thread.sleep(4000);

        BrowserUtils.clickWithJS(poll.employeeBtn);
        Thread.sleep(3000);

        poll.employeeList("helpdesk28@cybertekschool.com");
        BrowserUtils.waitFor(5);

        poll.checkBoxBtn.click();

        BrowserUtils.clickWithJS(poll.sendButton);
















    }
}
