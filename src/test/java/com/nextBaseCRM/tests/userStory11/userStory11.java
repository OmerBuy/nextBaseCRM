package com.nextBaseCRM.tests.userStory11;

import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.pages.MainPage;
import com.nextBaseCRM.tests.TestBase;
import com.nextBaseCRM.utilities.BrowserUtils;
import com.nextBaseCRM.utilities.ConfigurationReader;

import org.testng.annotations.Test;

public class userStory11 extends TestBase {




    @Test
    public void test1() throws InterruptedException {


        LoginPage loginPage = new LoginPage();

        loginPage.login(ConfigurationReader.get("hr_username"),ConfigurationReader.get("hr_password"));

        MainPage mainPage = new MainPage();

        BrowserUtils.waitFor(3);

        BrowserUtils.waitForClickablility(mainPage.macosButton,5);



        mainPage.macosButton.click();

        mainPage.windowsButton.click();

        mainPage.linuxButton.click();


    }
}
