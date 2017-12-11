package kr.cocoa93.practice;

import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] arg) throws ClassNotFoundException {

        Scanner scanner = new Scanner(System.in);
        String command;

        App newApp = new App();
        newApp.addTodoList("first");
        newApp.addTodoList("second");
        App.TodoList current=newApp.todos.get(0);
        boolean loopComplete=false;

        while (!loopComplete){
            command = scanner.next();
            if (command.equals("addList")){
                newApp.addTodoList(scanner.next());
            }
            else if (command.equals("list")){
                String tmp = scanner.next();
                for(App.TodoList i : newApp.todos){
                    if (i.todoListName.equals(tmp)){
                        i.viewTasks();
                        current = i;
                        break;
                    }

                }
            }
            else if (command.equals("addTodo")){
                String tmp = scanner.next();
                current.addTask(tmp);
            }
            else if (command.equals("complete") || command.equals("incomplete")){
                String tmp = scanner.next();
                for(App.TodoList.TodoTask i : current.taskList){
                    if (i.toDoTaskName.equals(tmp)){
                        i.setIsDone();
                    }
                }
            }
            else if (command.equals("exit")){
                loopComplete=true;
            }
            else if (command.equals("save")){
                try {
                    Path p =  Paths.get("c:/test","output.txt");
                    if (!Files.exists(p)) Files.createFile(p);
                    ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(p));
                    out.writeObject(newApp);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else if (command.equals("load")){
                try {
                    Path p = Paths.get("c:/test", "output.txt");
                    ObjectInputStream in = new ObjectInputStream(Files.newInputStream((p)));
                    in.readObject();
                    newApp = (App) in.readObject();
                }catch (IOException e) {
                    e.printStackTrace();
                }


            }
            else {System.out.print("wrong input");}

        }

    }



}
