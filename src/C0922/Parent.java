package C0922;

public class Parent {



    private String name = "";

    public String mutator(String v){
        name +=v;
        return name;
    }

    public String getName(){
        return name;
    }


}
