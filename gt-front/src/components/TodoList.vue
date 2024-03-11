<template>
  <div>
    <h1 id="todo-title">Todo リスト</h1>
    <div>
      <ul>
        <li v-for="todo in todos" :key="todo.id">
          {{ todo.title }}
        </li>
      </ul>
    </div>
  </div>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      todos: []
    };
  },
  mounted() {
    this.fetchTodos();
  },
  methods: {
    async fetchTodos() {
      try {
        const response = await axios.get('http://aaa/todos');
        this.todos = response.data;
      } catch (error) {
        console.error('Error fetching todos:', error);
      }
    }
  }
};
</script>

<style></style>