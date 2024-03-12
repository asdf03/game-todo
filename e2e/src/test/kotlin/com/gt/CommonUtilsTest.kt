package com.gt

import com.codeborne.selenide.Selenide.open
import com.thoughtworks.gauge.Step

object CommonUtils {

  @Step("Navigate to the application URL")
  fun navigateToApplicationURL() {
    open("http://localhost:8080")
  }

}