package C1013;

import java.util.Arrays;

public class main {
    static public void main(String[] arg){
        Customer customer = new Customer();
        Banker banker = new Banker();
        customer.deposit(banker, Currency.WON, 20);
        System.out.println(customer.deposit(banker,Currency.WON,20));
        System.out.println(customer.deposit(banker,Currency.WON,200));

        Employee me = new Employee(100), you = new Employee(200);
        System.out.println(me.compareTo(you));
        System.out.println(Competition.compare(you,me));

        Employee[] employees = {me,you};
        Arrays.sort(employees);
        System.out.println(employees[0]== you);
        }
    }

