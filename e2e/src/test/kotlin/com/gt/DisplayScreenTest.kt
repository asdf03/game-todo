package com.gt

import com.thoughtworks.gauge.AfterSpec
import com.thoughtworks.gauge.BeforeSpec
import com.thoughtworks.gauge.Step
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

class DisplayScreenTest {

  private lateinit var driver: WebDriver

  @BeforeSpec
  fun setUp() {
    System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver")
    driver = ChromeDriver()
  }

  @AfterSpec
  fun tearDown() {
    driver.quit()
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
