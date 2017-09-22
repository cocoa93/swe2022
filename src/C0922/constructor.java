package C0922;

public class constructor {

    private String firstName;
    private String lastName;


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

    public String getName() {
        return firstName + " " + lastName;
    }

}
