package C0922;

public class classBase1 {
    static public void main(String[] arg){
        constructor c = new constructor();
        System.out.println(c.getName());
        constructor c1 = new constructor("haeree");
        System.out.println(c1.getName());
        constructor c2 = new constructor("haeree","seo");
        System.out.println(c2.getName());



    }
}
