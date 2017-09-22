package C0922;

public class classBase1 {
    static public void main(String[] arg){
        constructor c = new constructor();
        System.out.println(c.getName());
        System.out.println(c.getFriend(0));
        constructor c1 = new constructor("haeree");
        System.out.println(c1.getName());
        System.out.println(c1.getFriend(0));
        constructor c2 = new constructor("haeree","seo");
        System.out.println(c2.getName());
        System.out.println(c2.getFriend(0));

        final String a;
        a= "abbc";

        NoConst no = new NoConst(); // 생성자가 없어도 만들 수 있음. 자바가 기본 생성자를 만들어주기 때문
        System.out.println(no.a);

        System.out.println(no.getFirstName(c1));

        System.out.println(StaticClass.getData("abcdefg"));

    }
}
