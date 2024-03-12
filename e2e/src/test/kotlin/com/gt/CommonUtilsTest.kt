package com.gt

import com.codeborne.selenide.Selenide
import com.thoughtworks.gauge.Step
class CommonUtilsTest {

  @Step("Navigate to the application URL")
  fun navigateToApplicationURL() {
    Selenide.open("http://localhost:8080")
  }

}