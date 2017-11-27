package kr.cocoa93.practice;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);
        String command;

        App newApp = new App();
        newApp.addTodoList("first");
        newApp.addTodoList("second");
        App.TodoList current=newApp.todos.get(0);
        boolean loopComplete=false;

        while (!loopComplete){
            command = scanner.next();
            if (command=="addList"){
                newApp.addTodoList(scanner.next());
            }
            else if (command=="list"){
                String tmp = scanner.next();
                for(App.TodoList i : newApp.todos){
                    if (i.todoListName==tmp){
                        i.viewTasks();
                        current = i;
                        break;
                    }

                }
            }
            else if (command=="addTodo"){
                String tmp = scanner.next();
                current.addTask(tmp);
            }
            else if (command=="complete"||command=="incomplete"){
                String tmp = scanner.next();
                for(App.TodoList.TodoTask i : current.taskList){
                    if (i.toDoTaskName==tmp){
                        i.setIsDone();
                    }
                }
            }
            else if (command=="exit"){
                loopComplete=true;
            }
            else {System.out.print("wrong input");}

        }

    }



}
