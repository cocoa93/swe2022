package C1013;

public interface Request {
    /* 값 대신에 method를 넣음 인터페이스에는 값x
    클래스를 정의하기 전에 인터페이스를 먼저 만든다.*/

    Customer getCustomer();
    Money getMoney();

}
