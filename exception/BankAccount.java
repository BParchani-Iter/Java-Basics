package exception;

public class BankAccount {
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount < 0){
            throw new InvalidAmountException("Deposit Amt cannot be negative.");
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance: " +balance);
    }

    public void withdraw(double amount) throws InsufficientFundsException{
        if (amount < 0){
            throw new InsufficientFundsException("Withdrawal amount cannot be negative");
        }
        if (amount > balance){
            throw new InsufficientFundsException("Insufficient Balance");
        }

        balance -= amount;

        System.out.println("Withdrawn: " + amount);
        System.out.println("Current Balance: " + balance);

    }

    public double getBalance() {
        return balance;
    }
}