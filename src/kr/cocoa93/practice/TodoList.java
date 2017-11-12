package kr.cocoa93.practice;

import java.util.ArrayList;
import java.util.Date;

public class TodoList {
    static ArrayList<TodoList> todos = new ArrayList<TodoList>();
    ArrayList<TodoTask> taskList = new ArrayList<>();
    String todoListName;
    int sortingSt =1;
    boolean hideIfDone =false;
    TodoTheme listTheme;

    public TodoList(String name) {
        this.todoListName = name;
    }

    static void addTodoList(String name){
        todos.add(new TodoList(name));
    }
    void addTask(String name){
        taskList.add(new TodoTask(name));
    }
    void deleteTask(int index){
        taskList.remove(index);
    }
    void changeListName(String name){
        this.todoListName=name;
    }
    void changeSortingSt(int st){
        this.sortingSt =st;
    }
    void changeTheme() {
    }
    void changeShowIfComplete(){
        this.hideIfDone =!this.hideIfDone;
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
        boolean todaysTask=false;
        boolean isDone =false;

        TodoTask(String name) {
            this.toDoTaskName = name;
        }

        public String toString() {
            return "name: " + this.toDoTaskName + ", date: " + dueDate.toString()+"\n";
        }

    }
}
