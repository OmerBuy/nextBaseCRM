package com.nextBaseCRM.tests.userStory8;

import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.pages.WorkflowPge;
import com.nextBaseCRM.tests.TestBase;
import com.nextBaseCRM.utilities.BrowserUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AC_1 extends TestBase {
@Test
    public void leaveApproal(){
    new LoginPage().loginAsHelpdesk();
    WorkflowPge workflowPge=new WorkflowPge();
    workflowPge.more.click();

    BrowserUtils.waitFor(1);
    workflowPge.workflow.click();
    workflowPge.leaveapp.click();

   // workflowPge.navigateToModule("Activity Stream","Workflow");
    BrowserUtils.waitFor(3);
    driver.switchTo().activeElement().sendKeys(Keys.ESCAPE);
    BrowserUtils.waitFor(4);
    workflowPge.date.sendKeys("09/06/2020");
    workflowPge.endDate.sendKeys("11/06/2020");
    Select select=new Select(workflowPge.businessDrp);
    select.selectByValue("89");
    workflowPge.send.click();
    BrowserUtils.waitFor(4);




}



}

