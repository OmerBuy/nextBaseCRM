package com.nextBaseCRM.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TasksLocatorsUS2 extends BasePage{

    @FindBy(id = "task-edit-priority-cb")
    public WebElement highPriorityCheckBox;

    @FindBy(id = "lhe_button_editor_task-form-lifefeed_task_form")
    public WebElement visualEditor;

    @FindBy (id = "bx-html-editor-tlbr-lifefeed_task_form")
    public WebElement editorTextBar;

    @FindBy(name = "bxu_files[]")
    public WebElement uploadFileIcon;






}
