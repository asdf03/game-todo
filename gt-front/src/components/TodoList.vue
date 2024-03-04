<template>
  <div>
    <h1>ToDo</h1>
    <ul>
      <li v-for="todo in todos" :key="todo.id">
        {{ todo.text }}
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: 'TodoList',
  data() {
    return {
      todos: [
        { id: 1, text: 'Learn Vue.js' }
        ,{ id: 2, text: 'Build a Todo List' }
        ,{ id: 3, text: 'Explore more projects' }
      ]
    }
  }
}
</script>