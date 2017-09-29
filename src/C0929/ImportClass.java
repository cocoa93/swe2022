package C0929;

import C0929.sample.Imported;
import C0929.StaticInnerClass.Class2.Class2Class1;


public class ImportClass {
    static public void main(String[] arg){
        System.out.println(C0929.sample.Imported.getText());
        System.out.println(Imported.getText());
        StaticInnerClass.Class2 c = new StaticInnerClass.Class2();
        Class2Class1 a = new Class2Class1();


    }
}
