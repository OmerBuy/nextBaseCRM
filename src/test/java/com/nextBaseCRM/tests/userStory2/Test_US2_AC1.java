package com.nextBaseCRM.tests.userStory2;

import com.nextBaseCRM.pages.AppreciationPage;
import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.pages.TasksLocatorsUS2;
import com.nextBaseCRM.tests.TestBase;
import org.testng.annotations.Test;

public class Test_US2_AC1 extends TestBase {

//User should be able to click on "High Priority" checkbox
// to set the current task to a top priority task.
    @Test
    public void highPriorityTest() {
        extentLogger = report.createTest("Assigning tasks by clicking on Task tab under Active Stream");
        LoginPage loginPage = new LoginPage();
        extentLogger.info("Login as Marketing");
        new LoginPage().loginAsMarketing();

        TasksLocatorsUS2 tasksLocatorsUS2 = new TasksLocatorsUS2();

        //  Navigating from Activity Stream Tab to Task Module

        tasksLocatorsUS2.navigateToModule("Activity Stream","Task");
        //new ActivityStream().navigateToModule("Activity Stream", "Task");
        extentLogger.info("Navigating from Activity Stream Tab to Task Module");

        // STEP11. User should be able to click on "High Priority" checkbox
        // to set the current task to a top priority task.

        TasksLocatorsUS2 tasksLocators_highPriority = new TasksLocatorsUS2();
        tasksLocators_highPriority.highPriorityCheckBox.click();

        //ActivityStreamTask activityStreamTask = new ActivityStreamTask();
        //activityStreamTask.highPriority.click();

        //STEP 2. User should be able to click on Visual Editor and see the editor
        // text-bar displays on top of the message box.
        TasksLocatorsUS2 tasksLocators_visual = new TasksLocatorsUS2();
        tasksLocators_visual.visualEditor.click();
        System.out.println("Editor Text Bar is Displayed :" + tasksLocators_visual.visualEditor.isDisplayed());

        //3. User should be able to click on upload files icon to upload files and pictures
        // from local disks, download from external drive, select documents from bixtrix24,
        // and create files to upload.
        TasksLocatorsUS2 tasksLocators_uploadFileIcon = new TasksLocatorsUS2();
        tasksLocators_uploadFileIcon.uploadFileIcon.click();

        TasksLocatorsUS2 tasksLocators_upLoadFile = new TasksLocatorsUS2();
        String filePath = System.getProperty("user.dir") + "C:/Users/volkan/Desktop.hiMan.txt";
        tasksLocators_upLoadFile.uploadFilesAndImages.sendKeys(filePath);











    }


}
