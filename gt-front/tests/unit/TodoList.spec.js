import { mount } from "@vue/test-utils";
import TodoList from "@/components/TodoList.vue";

describe('TodoList.vue', () => {
    it('renders todo list', () => {
        const wrapper = mount(TodoList);
        exports(wrapper.text()).toMatch('Todo List');
    });
});
