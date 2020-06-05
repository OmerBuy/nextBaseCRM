package com.nextBaseCRM.pages;

import com.nextBaseCRM.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WorkflowPge extends BasePage {




    @FindBy(xpath = "//span[@class='menu-popup-item-text'][contains(text(),'Workflow')]")
    public WebElement workflow;
    @FindBy(xpath = "//span[text()='Leave Approval']")
    public WebElement leaveapp;
    @FindBy(xpath = "//span[text()='Business Trip']")
    public WebElement business;
    @FindBy(xpath = "//span[text()='General Requests']")
    public WebElement generalReq;
    @FindBy(xpath = "//span[text()='Purchase Request']")
    public WebElement purchase;
    @FindBy(xpath = "//span[text()='Expense Report']")
    public WebElement expense;
    @FindBy(xpath = "//span[contains(text(),'Workflows Directory')]")
    public WebElement workflowDirectory;
    @FindBy(xpath = "//span[text()='Settings']")
    public  WebElement settings;
    @FindBy(xpath = "//input[@name='PROPERTY_86[n0][VALUE]']")
    public WebElement date;
    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement more;
    @FindBy(xpath = "//input[@name='PROPERTY_87[n0][VALUE]']")
    public WebElement endDate;
    @FindBy(name = "PROPERTY_88")
    public WebElement businessDrp;
    @FindBy(id="blog-submit-button-save")
    public WebElement send;








}


