package com.nextBaseCRM.tests.userStory2;

import com.nextBaseCRM.pages.AppreciationPage;
import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.pages.TasksLocatorsUS2;
import com.nextBaseCRM.tests.TestBase;
import com.nextBaseCRM.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_US2_AC3 extends TestBase {
    @Test

    public void uploadFilesFromTaskPage() {
//3. User should be able to click on upload files icon to upload files and pictures
// from local disks, download from  external drive, select documents
// from Bixtrix24, and create files to upload.

        extentLogger = report.createTest("Upload Files From PC Test");
        extentLogger.info("Login as Marketing");
        new LoginPage().loginAsMarketing();

        //AppreciationPage appreciationPage = new AppreciationPage();
        TasksLocatorsUS2 tasksLocatorsUS2 = new TasksLocatorsUS2();

        extentLogger.info("Navigate to Activity and Task ");
        //go to activity stream-task section
        tasksLocatorsUS2.navigateToModule("Activity Stream", "Task");


        extentLogger.info("upload a file");
        TasksLocatorsUS2 tasksLocators_uploadFile = new TasksLocatorsUS2();
        tasksLocators_uploadFile.uploadFileIcon.click();

        AppreciationPage uploadFile = new AppreciationPage();
        uploadFile.uploadFilesFromPC("src/test/resources/testfileUS2.txt");

        //AppreciationPage.uploadFilesFromPC("src/test/resources/testfileUS2.txt");
        BrowserUtils.waitFor(2);

        String expectedFileName = "testfileUS2.txt";
        extentLogger.info("Get the name of the uploaded file");

        String actualFileName = uploadFile.getNameOfLastUploadedPhoto();
        Assert.assertTrue(actualFileName.contains(expectedFileName));

        extentLogger.pass("PASS: Upload from PC");
    }
}
