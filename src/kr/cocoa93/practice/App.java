package kr.cocoa93.practice;
import java.util.ArrayList;
import java.time.*;

public class App {
    ArrayList<TodoList> todos = new ArrayList<TodoList>();

    public App() {
    }

    void addTodoList(String name){
        todos.add(new TodoList(name));
        viewList();
    }
    void deleteTodoList(int index){
        todos.remove(index);
    }
    void viewList(){
        for(int i=0;i<todos.size();i++){
            TodoList tmp =todos.get(i);
            System.out.println(tmp.todoListName+" "+tmp.todoCount+"\n");
        }
    }


    class TodoList{
        ArrayList<TodoTask> taskList = new ArrayList<>();
        String todoListName;
        int sortingSt =0;
        int todoCount =0;
        boolean hideIfDone =false;
        TodoTheme listTheme= new TodoTheme();

        TodoList(String name) {
            this.todoListName = name;
        }
        void addTask(String name){
            taskList.add(new TodoTask(name));
            todoCount++;
            viewTasks();
        }
        void deleteTask(int index){
            taskList.remove(index);
            todoCount--;
        }
        void changeListName(String name){
            this.todoListName=name;
        }
        void changeSortingSt(int st){
            this.sortingSt = st;
        }
        void changeTheme(int color,int pattern) {
            listTheme.colorIdx=color;
            listTheme.patternIdx=pattern;
        }
        void changeHiding(){
            this.hideIfDone =!this.hideIfDone;
        }
        void viewTasks(){
            for(int i=0;i<taskList.size();i++){

                TodoTask tmp=taskList.get(i);

                if (tmp.isDone) System.out.print("[o] ");
                else System.out.print("[x] ");

                System.out.print(tmp.toDoTaskName+" ");

                if (tmp.dueDate!=null) System.out.print(tmp.dueDate.toString()+" ");

                if(tmp.alarm!=null) System.out.print("알림\n");
                else System.out.print("\n");
            }

        }





        class TodoTask{
            String toDoTaskName;
            LocalDate dueDate;
            LocalDate alarm;
            boolean todaysTask=false;
            boolean isDone =false;

            TodoTask(String name) {
                this.toDoTaskName = name;
            }

            void setAlarm(LocalDate d){
                alarm=d;
            }
            void setDueDate(LocalDate d){
                dueDate=d;
            }
            void setIsDone() {
                if (!isDone) this.isDone=false;
                else this.isDone=true;
                viewTasks();
            }

            public String toString() {
                String dueDateP;
                String alarmP;
                String result="";
                if (dueDate==LocalDate.now()) dueDateP ="오늘";
                else if (dueDate==LocalDate.now().plusDays(1)) dueDateP="내일";
                else dueDateP=dueDate.toString();

                if (alarm==LocalDate.now()) alarmP ="오늘";
                else if (alarm==LocalDate.now().plusDays(1)) alarmP="내일";
                else alarmP=alarm.toString();


                if (hideIfDone) return"";
                else if (isDone) result=result+"V ";
                else result=result+"  ";


                if ((dueDate==null)&(alarm==null)) result=result+ "name: " + this.toDoTaskName + "\n";
                if (dueDate==null) result=result+ "name: " + this.toDoTaskName + ", alarm: " + alarmP+"\n";
                if (alarm==null) result=result+ "name: " + this.toDoTaskName + ", dueDate: " + dueDateP+"\n";
                else result=result+ "name: " + this.toDoTaskName + ", alarm: " + alarmP+ ", dueDate: " + dueDateP+"\n";

                return result;
            }


        }
    }
}
