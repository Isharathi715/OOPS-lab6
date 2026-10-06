public class SavingsAccount {
    public static void main(String[] args) {
        BankAccount account = new Savings();
        account.deposit(500);
        account.withdraw(450);
        account.withdraw(100);
    }
}
class BankAccount {
    protected double balance;
    void deposit(double amount) {
        if (amount > 0) balance += amount;
        System.out.println("Balance: " + balance);
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) balance -= amount;
        System.out.println("Balance: " + balance);
    }
}
class Savings extends BankAccount {
    @Override
    void withdraw(double amount) {
        if (balance - amount >= 100 && amount > 0) {
            balance -= amount;
            System.out.println("Withdrawal successful. Balance: " + balance);
        } else {
            System.out.println("Withdrawal denied: balance cannot fall below 100.");
        }
    }
}
