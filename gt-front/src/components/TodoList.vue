<template>
  <div>
    <h1 id="todo-title">Todo リスト</h1>
    <div>
      <ul>
        <li v-for="todo in todos" :key="todo.id">
          {{ todo.title }}
        </li>
      </ul>
      <div v-if="!addingTodo" @click="addTodo" class="add-todo-placeholder">
        Click here to add a new todo...
      </div>
      <!-- 新しいTodoの入力フィールド -->
      <input v-if="addingTodo" v-model="newTodoTitle" @keyup.enter="saveTodo" placeholder="Enter new todo title" class="todo-input" ref="newTodoInput" />
    </div>
  </div>
</template>

<script setup>
import { ref, nextTick } from 'vue';

const todos = ref([
  { id: 1, title: "買い物に行く" },
  { id: 2, title: "レポートを書く" },
  { id: 3, title: "運動する" }
]);

const addingTodo = ref(false);
const newTodoTitle = ref("");

const addTodo = () => {
  addingTodo.value = true;
  nextTick(() => {
    document.querySelector('.todo-input').focus();
  });
};

const saveTodo = () => {
  if (!newTodoTitle.value.trim()) return;
  const newTodo = {
    id: todos.value.length + 1, // 単純化のためIDを現在の長さ+1とする
    title: newTodoTitle.value
  };
  todos.value.push(newTodo);
  newTodoTitle.value = "";
  addingTodo.value = false;
};
</script>

<style>
.add-todo-placeholder {
  cursor: pointer;
  padding: 10px;
  background-color: #f0f0f0;
}
.todo-input {
  width: 100%;
  padding: 10px;
  margin-top: 10px;
}
</style>