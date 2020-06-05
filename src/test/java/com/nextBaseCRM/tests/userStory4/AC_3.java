package com.nextBaseCRM.tests.userStory4;

import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.pages.Poll;
import com.nextBaseCRM.tests.TestBase;
import com.nextBaseCRM.utilities.BrowserUtils;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AC_3 extends TestBase {

    //3. User should be able to attach link by clicking on the link icon.
    @BeforeMethod
    public void pollSetUp() {
        new LoginPage().loginAsHR();
        new Poll().navigateToModule("Activity Stream","Poll");
    }

    @Test
    public void tc1() throws InterruptedException {

        Poll poll = new Poll();
        Thread.sleep(2000);
        poll.linkIcon.click();
        poll.linkUrl.sendKeys("www.amazon.com");
        poll.textUrl.sendKeys("Amz" + Keys.ENTER);
        BrowserUtils.clickWithJS(poll.sendButton);

        System.exit(1);
    }
        @Test
        public void ntc2() throws InterruptedException {

            Poll poll = new Poll();
            Thread.sleep(2000);
            poll.linkIcon.click();
            poll.linkUrl.sendKeys("amaz");
            poll.textUrl.sendKeys("Amz" + Keys.ENTER);
            BrowserUtils.clickWithJS(poll.sendButton);

            System.exit(1);
        }

    @Test
    public void tc3() throws InterruptedException {

        Poll poll = new Poll();
        Thread.sleep(2000);
        poll.linkIcon.click();
        poll.linkUrl.sendKeys("amaz");
        poll.textUrl.sendKeys("Amz" );
        Thread.sleep(5000);
        poll.linkCancel.click();
       // BrowserUtils.clickWithJS(poll.sendButton);

        System.exit(1);
    }

}
