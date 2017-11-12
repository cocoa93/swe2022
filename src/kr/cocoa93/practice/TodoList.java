package kr.cocoa93.practice;

import java.util.ArrayList;
import java.util.Date;

public class TodoList {
    static ArrayList<TodoList> todos = new ArrayList<TodoList>();
    ArrayList<TodoTask> taskList = new ArrayList<>();
    String todoListName;
    boolean sortingDir=false;
    boolean showIfComplete=false;
    TodoTheme listTheme;

    public TodoList(String name) {
        this.todoListName = name;
    }

    public static void addTodoList(String name){
        todos.add(new TodoList(name));
    }
    void addTask(String name){
        taskList.add(new TodoTask(name));
    }
    void deleteTask(int index){
        taskList.remove(index);
    }
    void changeSortingDir(){
        this.sortingDir=!this.sortingDir;
    }
    void changeTheme() {
    }
    void changeShowIfComplete(){
        this.showIfComplete=!this.showIfComplete;
    }
    void TodoListPrint(){
        System.out.println(this.taskList);
    }
    void TodoListDelete(){
        todos.remove(this);
    }


    class TodoTask {

        String toDoTaskName;
        Date dueDate;
        boolean isComplete=false;

        TodoTask(String name) {
            this.toDoTaskName = name;
        }

        public String toString() {
            return "name: " + this.toDoTaskName + ", date: " + dueDate.toString()+"\n";
        }

    }
}
