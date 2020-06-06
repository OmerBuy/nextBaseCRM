package com.nextBaseCRM.tests.UserStory7;

import com.nextBaseCRM.pages.Announcement;
import com.nextBaseCRM.pages.AppreciationPage;
import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.tests.TestBase;
import org.testng.annotations.Test;

public class Test_US7_AC6 extends TestBase {


    @Test

    public void uploadFileTest() {
        new LoginPage().loginAsMarketing();

       // AppreciationPage appreciationPage=new AppreciationPage();
       // appreciationPage.navigateToModule("Activity Stream","Announcement");
        //AnnouncementPage announcementPage=new AnnouncementPage();
        //announcementPage.uploadFilesIcon.click();
        //announcementPage.selectFromBitrix.click();

        AppreciationPage appreciationPage=new AppreciationPage();
        appreciationPage.navigateToModule("Activity Stream","Announcement");
        Announcement announcementPage1=new Announcement();
        announcementPage1.uploadFilesIcon.click();
        announcementPage1.selectFromBitrix.click();




        //announcementPage.moreButton.click();


        //WebElement dropdownElement = driver.findElement(By.id("dropdownMenuLink"));
       // WebElement dropdownElement = driver.findElement(By.cssSelector("#dropdownMenuLink"));
       // dropdownElement.click();

        //List<WebElement> dropdownOptions= driver.findElements(By.cssSelector("a.dropdown-item"));

        //List<WebElement> more = driver.findElements(By.xpath ("//span[@id='feed-add-post-form-link-text']"));

       // for (WebElement option : more) {
         //   System.out.println(option.getText());
        //}
        // for (WebElement option : dropdownOptions) {
        //    System.out.println(option.getText());
        // }

        //click yahoo
       // more.get(2).click();






        //announcementPage.AnnouncementButton.click();


    }
}




