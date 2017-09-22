package C0922;

import java.util.ArrayList;

public class constructor {

    private final String firstName;  // final 변수는 method에서 변경할 수 없다.
    private final String lastName;
    private String seperator;
    private ArrayList<String> friends;

    {
        seperator = " ";

    }
    {
        friends = new ArrayList<>();
        friends.add("mike");
        friends.add("jane");
    }

    public constructor(){
        this("Mike","m"); //생성자에서 다른 생성자를 부를 때 this() 를 쓸 수 있다.

    } // 생성자는 반환값 없이 이름이 바로 나옴. 인자를 무엇으로 보낼지는 결정할 수 있음
    public constructor(String fname){
        this(fname,"m");

    } // 오버로딩 겹쳐서 로딩!


    public constructor(String fname, String lname) {
        firstName = fname;
        lastName = lname;

    }

    /*
    public String getName(String a ){
        return a;
    } -> 가능

    public int getName(int a){
        return a;
    } -> 불가능. 반환형식이 다른 것만으로는 구분이 안된다. 인자가 다르거나 이름이 달라야함.
    */

    public String getName() {
        return firstName + " " + lastName;
    }

    public String getFriend(int index){
        return friends.get(index)+ " is " + this.getName()+"'s friend";
    }

}
