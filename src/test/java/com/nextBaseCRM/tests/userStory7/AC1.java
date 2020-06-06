package com.nextBaseCRM.tests.userStory7;

import com.nextBaseCRM.pages.AnnouncementPage;
import com.nextBaseCRM.pages.AppreciationPage;
import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.tests.TestBase;
import org.testng.annotations.Test;

public class AC1 extends TestBase {


    @Test

    public void uploadFileTest(){
        new LoginPage().loginAsMarketing();

        AppreciationPage appreciationPage=new AppreciationPage();
        appreciationPage.navigateToModule("Activity Stream","Announcement");
        AnnouncementPage announcementPage=new AnnouncementPage();
        announcementPage.uploadFilesIcon.click();
        announcementPage.selectFromBitrix.click();




    }

}
