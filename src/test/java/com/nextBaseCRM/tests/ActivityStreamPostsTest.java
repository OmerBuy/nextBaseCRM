package com.nextBaseCRM.tests;

import com.nextBaseCRM.pages.ActivityStreamPostsPage;
import com.nextBaseCRM.pages.LoginPage;
import com.nextBaseCRM.utilities.BrowserUtils;
import com.nextBaseCRM.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActivityStreamPostsTest extends TestBase {
    /*
    User should be able to make a comment, like, or unfollow on other employees' posts.

     */
    @Test
    public void makeCommentAndLike() throws InterruptedException {

        extentLogger = report.createTest("Test Posts: make a comment, like, or unfollow on other employees' posts");
        new LoginPage().loginAsMarketing();

        ActivityStreamPostsPage activityStreamPostsPage = new ActivityStreamPostsPage();
        extentLogger.info("Navigate to Post -- Comment and make comment");
        activityStreamPostsPage.makeCommentLikeOrFollow("Comment", "1", "that is nice");
        extentLogger.info("Verify that added post comment is that is nice");
        Assert.assertTrue(activityStreamPostsPage.postCommentButton.isDisplayed(), "Verify that post comment displayed");


        extentLogger.info("Navigate to Post -- like and click like button");
        activityStreamPostsPage.postLikeButton.click();
        BrowserUtils.waitFor(2);
        extentLogger.info("Verify that post like button is displayed");
        Assert.assertTrue(activityStreamPostsPage.postLikeButton.isDisplayed(), "Verify that post like button displayed");
        extentLogger.pass("PASS: Contact Info Test");


    }
    /*
    2. User should be able to view, like, or make comments on all other reviewers's comments.
    viewLikeOrReviewersComments
3. User should be able to click on reviewers' name and visit their profiles.

     */

    @Test
    public void viewLikeAndReviewersComments() {

        extentLogger = report.createTest("Test Posts: to view, like, or make comments on all other reviewers's comments");

        new LoginPage().loginAsMarketing();

        ActivityStreamPostsPage activityStreamPostsPage = new ActivityStreamPostsPage();
        extentLogger.info("to view other reviewer's comment");
        activityStreamPostsPage.viewLikeOrReviewersComments("1");
        BrowserUtils.waitFor(2);
        extentLogger.info("to view liked button");
        activityStreamPostsPage.postLikeButton.click();
        extentLogger.info("to view reviewer's profile");
        activityStreamPostsPage.userName.click();
        BrowserUtils.waitFor(2);
        extentLogger.info("Verify that clicked username is displayed");
        Assert.assertTrue(activityStreamPostsPage.userInformation.isDisplayed(), "Verify that clicked username profile is displayed");
        extentLogger.pass("PASS: Contact Info Test");

    }

    /*
    4. User should be able to add others' posts to favorate by clicking on the Star icon.


     */
    @Test
    public void addOthersPostToFavorate() {

        extentLogger = report.createTest("Test Posts: add others' posts to favorate by clicking on the Star icon");

        new LoginPage().loginAsMarketing();

        ActivityStreamPostsPage activityStreamPostsPage = new ActivityStreamPostsPage();
        extentLogger.info("add to favorate clicking on the Star icon");
        activityStreamPostsPage.addClickingStarIcon("1");
        BrowserUtils.waitFor(2);
        extentLogger.info("Verify that added to favorate");
        Assert.assertTrue(activityStreamPostsPage.starIcon.isEnabled(),"Verify that star icon selected");
        extentLogger.pass("PASS: Contact Info Test");
    }
}