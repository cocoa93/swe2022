package C0922;

public class ClassBase {
    static public void main(String[] arg){
        Parent parent = new Child(); //대체 가능성. parent 변수지만 child(내적)가 호출됨


        String a = "ac";

        System.out.println(a.length());



        parent.mutator("abc");
        System.out.println(parent.getName());
        parent.mutator("123");
        System.out.println(parent.getName());
        System.out.println(parent.getName());





    }
}
