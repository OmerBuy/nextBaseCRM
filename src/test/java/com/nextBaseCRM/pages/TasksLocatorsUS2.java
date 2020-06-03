package com.nextBaseCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TasksLocatorsUS2 extends BasePage{

    @FindBy(id = "feed-add-post-form-tab-tasks")
    public WebElement taskSection;

    //@FindBy(id = "task-edit-priority-cb")
   @FindBy(xpath = "//*[@id=\"tasks-task-priority-cb\"]")
    public WebElement highPriorityCheckBox;

    @FindBy(id = "lhe_button_editor_task-form-lifefeed_task_form")
    public WebElement visualEditor;

    @FindBy (id = "bx-html-editor-tlbr-lifefeed_task_form")
    public WebElement editorTextBar;

    @FindBy(name = "bxu_files[]")
    public WebElement uploadFileIcon;

    @FindBy(xpath = "(//input[@class='diskuf-fileUploader wd-test-file-light-inp diskuf-filemacos'])[5]")
    //""(//td[@class='diskuf-selector wd-fa-add-file-light-cell wd-fa-add-file-from-main'])[5]")
    public WebElement uploadFilesAndImages;

    @FindBy(xpath = "//*[@id=\"bx-b-quote-task-form-lifefeed_task_form\"]/span/i")
    public WebElement commaIcon;








}
