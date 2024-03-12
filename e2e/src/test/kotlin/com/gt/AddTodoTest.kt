package com.gt

import com.codeborne.selenide.Condition.text
import com.codeborne.selenide.Selenide.open
import com.codeborne.selenide.Selenide.`$`
import com.thoughtworks.gauge.Step

class AddTodoTest {

  @Step("Add a new todo item")
  fun addNewTodoItem() {
    open("http://localhost:8080") // ToDoリストアプリケーションのURLを開く
    `$`("#new-todo").setValue("New Todo Item").pressEnter() // 新しいToDo項目を入力して送信
  }

  @Step("Verify the new todo item is displayed")
  fun verifyNewTodoItemIsDisplayed() {
    `$`(".todo-list").`$`("li:last-child").shouldHave(text("New Todo Item")) // 最後に追加された項目が期待するテキストを持つか検証
  }

}