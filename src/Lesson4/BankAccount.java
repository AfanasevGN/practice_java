package Lesson4;

public class BankAccount {
    int id=10;
    String name= "Petr";
    double balance=100;
}

class BankAccountTest{

    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.name = "Gleb";
        MyAccount.balance = 12.35;

        YourAccount.id = 2;
        YourAccount.name = "John";
        YourAccount.balance = 15.00;

        HisAccount.id = 3;
        HisAccount.name = "Kendrick";
        HisAccount.balance = 148.98;

        System.out.println(HisAccount.balance);

    }
}
