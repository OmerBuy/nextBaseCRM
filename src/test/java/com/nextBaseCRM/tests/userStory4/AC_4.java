package com.nextBaseCRM.tests.userStory4;

import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.pages.Poll;
import com.nextBaseCRM.tests.TestBase;
import com.nextBaseCRM.utilities.BrowserUtils;
import com.nextBaseCRM.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.security.Key;

public class AC_4 extends TestBase {

    // 4. User should be able to insert videos by clicking on the video icon and entering the video URL.
    @BeforeMethod
    public void pollSetUp() {
        new LoginPage().loginAsHR();
        new Poll().navigateToModule("Activity Stream","Poll");
    }

    @Test
    public void tc1() {
        Poll poll = new Poll();
        BrowserUtils.clickWithJS(poll.insertVideoIcon);
        BrowserUtils.waitFor(3);
        poll.videoUrl.sendKeys("https://vimeo.com/360091151");
        BrowserUtils.clickWithJS(poll.videoSave);
        poll.videoUrl.sendKeys(Keys.ENTER);
        BrowserUtils.clickWithJS(poll.sendButton);

        System.exit(1);






    }
}
