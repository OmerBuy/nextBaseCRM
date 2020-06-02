package com.nextBaseCRM.tests.userStory4;

import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.pages.Poll;
import com.nextBaseCRM.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AC_1 extends TestBase {

    //1. User should be able to click on upload files icon to upload files and pictures from local disks,
    //   download from external drive, select documents from bixtrix24, and create files to upload.
    @BeforeMethod
    public void pollSetUp() {
        new LoginPage().loginAsHR();
        new Poll().navigateToModule("Activity Stream","Poll");
    }

    @Test
    public void tc1() throws InterruptedException {

        Poll poll = new Poll();
        Thread.sleep(2000);
        poll.uploadIcon.click();
        Thread.sleep(2000);
        poll.differentUploadChoices("Select document from Bitrix24","My Drive");
    //    poll.uploadedFiles.click();
        poll.exampleDocuments.click();
        poll.selectDocumentButton.click();
        poll.sendButton.click();

       //System.exit(1);

    }

    @Test
    public void tc2() throws InterruptedException {

        Poll poll = new Poll();
        Thread.sleep(2000);
        poll.uploadIcon.click();
        Thread.sleep(2000);
        poll.differentUploadChoices("Download from external drive","Office 365");




    }
    @Test
    public void tc3() throws InterruptedException {

        Poll poll = new Poll();
        Thread.sleep(2000);
        poll.uploadIcon.click();
        Thread.sleep(2000);
        poll.differentUploadChoices("Google Docs","Office 365");




    }
}
