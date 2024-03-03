package com.gt

import com.thoughtworks.gauge.Step
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

class DisplayScreenTest {

  private val driver: WebDriver = ChromeDriver()

  init {
    System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver")
  }

  @Step("Navigate to the application URL")
  fun navigateToApplicationURL() {
    driver.get("http://localhost:8080") // 仮のURL、実際のアプリケーションURLに置き換えてください
  }

  @Step("Verify the todo list title is displayed")
  fun verifyTodoListTitleIsDisplayed() {
    assert(driver.findElement(By.id("todo-title")).isDisplayed)
  }

  // テスト後のクリーンアップ
  // @AfterClassなどを使ってブラウザを閉じるなどの後処理を行う
}
