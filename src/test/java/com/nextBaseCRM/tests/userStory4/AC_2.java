package com.nextBaseCRM.tests.userStory4;

import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.pages.Poll;
import com.nextBaseCRM.tests.TestBase;
import com.nextBaseCRM.utilities.BrowserUtils;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AC_2 extends TestBase {

    // 2. User should be able to add users from selecting contact from E-mail user,
    //    Employees and Departments and Recent contact lists.
    @BeforeMethod
    public void pollSetUp() {
        new LoginPage().loginAsHR();
        new Poll().navigateToModule("Activity Stream","Poll");
    }

    @Test
    public void tc1() throws InterruptedException {

        Poll poll = new Poll();
        Thread.sleep(2000);
        poll.addEmployees.click();
        Thread.sleep(2000);
        BrowserUtils.clickWithJS(poll.addEmployesByDepartment);
        poll.addMarketing19.click();
        driver.switchTo().frame(poll.textFrame);
        poll.writeText.click();
        poll.writeText.sendKeys("Hi Marketing19" );
        driver.switchTo().defaultContent();
        BrowserUtils.clickWithJS(poll.sendButton);
        System.exit(1);

    }
}
