package Lesson4;

import java.sql.SQLOutput;

public class BankAccount {
    int id=10;
    String name= "Petr";
    double balance=100;

    void deposit(double amountUp){
        System.out.println("Balance before deposit: " + balance);
        System.out.println("Balance gets higher on  " + amountUp);
        balance += amountUp;
        System.out.println("Balance after deposit: " + balance);
        System.out.println();
    }

    void withdraw(double amountDown){
        System.out.println("Balance before withdraw: " + balance);
        System.out.println("Balance gets lower on  " + amountDown);
        balance -= amountDown;
        System.out.println("Balance after withdraw: " + balance);
        System.out.println();
    }
}

class BankAccountTest{

    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();

        MyAccount.deposit(10.5);
        MyAccount.withdraw(20.5);
    }
}
