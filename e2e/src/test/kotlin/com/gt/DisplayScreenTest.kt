package com.gt

import com.codeborne.selenide.CollectionCondition
import com.codeborne.selenide.Condition
import com.codeborne.selenide.Condition.*
import com.codeborne.selenide.Selenide.`$`
import com.codeborne.selenide.Selenide.`$$`
import com.thoughtworks.gauge.Step
import org.openqa.selenium.WebDriver

class DisplayScreenTest {

  @Step("Verify the todo list title is displayed")
  fun verifyTodoListTitleIsDisplayed() {
    `$`("#todo-title").isDisplayed
  }

}
