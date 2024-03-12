package com.gt

import com.thoughtworks.gauge.Step
import com.codeborne.selenide.Selenide.open
import com.codeborne.selenide.Selenide.`$`


class DisplayScreenTest {

  @Step("Verify the todo list title is displayed")
  fun verifyTodoListTitleIsDisplayed() {
    open("http://localhost:8080")
    `$`("#todo-title").isDisplayed
  }

}
