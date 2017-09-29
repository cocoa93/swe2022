package C0929;

import C0929.sample.Imported;

public class StaticInnerClass {
    private static class Class1{
        // staticInnerclass의 정적 메소드나 클래스에서만 사용할 수 있음
    }
    static class Class2{
        static class Class2Class1{}
    }
    static public void main(String[] arg){
        C0929.StaticInnerClass.Class1 c = new StaticInnerClass.Class1();
        System.out.print(Imported.getText());


    }
}
