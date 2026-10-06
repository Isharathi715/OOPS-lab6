public class AbstractBankAccount {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount();
        BankAccount current = new CurrentAccount();
        savings.deposit(1000);
        savings.withdraw(300);
        current.deposit(2000);
        current.withdraw(500);
    }
}
abstract class BankAccount {
    protected double balance;
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}
class SavingsAccount extends BankAccount {
    void deposit(double amount) {
        if (amount > 0) balance += amount;
        System.out.println("Savings balance: " + balance);
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
        System.out.println("Savings balance: " + balance);
    }
}
class CurrentAccount extends BankAccount {
    void deposit(double amount) {
        if (amount > 0) balance += amount;
        System.out.println("Current balance: " + balance);
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
        System.out.println("Current balance: " + balance);
    }
}
