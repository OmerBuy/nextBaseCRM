package com.nextBaseCRM.tests.userStory2a;

import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.pages.Poll;
import com.nextBaseCRM.pages.TaskAndLocators;
import com.nextBaseCRM.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_US2_AC3 extends TestBase {
    @BeforeMethod
    public void gotoActivityTaskPage() {
        //FROM ACTIVITY-TASK PAGE 1. User should be able to click on upload files icon to upload files and pictures from local disks,
        //   download from external drive, select documents from bixtrix24, and create files to upload.
        //@BeforeMethod

        //public void taskAndLocatorsSetUp () {
            new LoginPage().loginAsHR();
            TaskAndLocators taskAndLocators = new TaskAndLocators();
            taskAndLocators.navigateToModule("Activity Stream", "Task");

        }

    @Test
    public void tc1 () throws InterruptedException {

        TaskAndLocators taskAndLocators = new TaskAndLocators();
        taskAndLocators.navigateToModule("Activity Stream", "Task");

            Thread.sleep(1998);
            taskAndLocators.uploadIcon.click();


            taskAndLocators.differentUploadChoices("Select document from Bitrix24", "My Drive");
            //    task.uploadedFiles.click();
            taskAndLocators.exampleDocuments.click();
            taskAndLocators.selectDocumentButton.click();
            System.exit(1);

            taskAndLocators.sendButton.click();

            //System.exit(1);

        }
    }












