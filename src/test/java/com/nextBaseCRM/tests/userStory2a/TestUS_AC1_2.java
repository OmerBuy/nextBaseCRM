package com.nextBaseCRM.tests.userStory2a;




import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.pages.TaskAndLocators2a;
import com.nextBaseCRM.tests.TestBase;
import org.testng.annotations.Test;

    public class TestUS_AC1_2 extends TestBase{

        //User should be able to click on "High Priority" checkbox
// to set the current task to a top priority task.
        @Test
        public void highPriorityTest() {
            extentLogger = report.createTest("Assigning tasks by clicking on Task tab under Active Stream");
            LoginPage loginPage = new LoginPage();
            extentLogger.info("Login as Marketing");
            new LoginPage().loginAsMarketing();

            TaskAndLocators2a taskAndLocators2A = new TaskAndLocators2a();

            //  Navigating from Activity Stream Tab to Task Module

            taskAndLocators2A.navigateToModule("Activity Stream","Task");
            //new ActivityStream().navigateToModule("Activity Stream", "Task");
            extentLogger.info("Navigating from Activity Stream Tab to Task Module");

            // STEP1. User should be able to click on "High Priority" checkbox
            // to set the current task to a top priority task.

            TaskAndLocators2a tasksLocators_highPriority = new TaskAndLocators2a();
            tasksLocators_highPriority.highPriorityCheckBox.click();

            //ActivityStreamTask activityStreamTask = new ActivityStreamTask();
            //activityStreamTask.highPriority.click();

            //STEP 2. User should be able to click on Visual Editor and see the editor
            // text-bar displays on top of the message box.
            TaskAndLocators2a tasksLocators_visual = new TaskAndLocators2a();
            tasksLocators_visual.visualEditor.click();
            System.out.println("Editor Text Bar is Displayed :" + tasksLocators_visual.visualEditor.isDisplayed());

            //3. User should be able to click on upload files icon to upload files and pictures
            // from local disks, download from external drive, select documents from bixtrix24,
            // and create files to upload.
            TaskAndLocators2a tasksLocators_uploadFileIcon = new TaskAndLocators2a();
            tasksLocators_uploadFileIcon.uploadFileIcon.click();

            TaskAndLocators2a tasksLocators_upLoadFile = new TaskAndLocators2a();
            String filePath = System.getProperty("user.dir") + "C:/Users/volkan/Desktop.hiMan.txt";
            tasksLocators_upLoadFile.uploadFilesAndImages.sendKeys(filePath);






        }


    }

