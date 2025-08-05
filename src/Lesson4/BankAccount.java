package Lesson4;

public class BankAccount {

    // Instance Variable
    int id;
    String name;
    double balance;

}

class BankAccountTest{
    public static void main(String[] args) {

        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id=1;
        MyAccount.name="Ruslan";
        MyAccount.balance=6200.42;

        YourAccount.id=2;
        YourAccount.name="Ivan";
        YourAccount.balance=1200.12;

        HisAccount.id=3;
        HisAccount.name="Sergey";
        HisAccount.balance=5212.55;

        System.out.println(HisAccount.name);





    }


}
