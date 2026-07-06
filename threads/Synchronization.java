package threads;

class BankAccount{
    private int balance = 1000;

    public synchronized void deposit(int amt){
        balance += amt;
        System.out.println(Thread.currentThread().getName() + " deposited " + amt + ", Balance = " + balance);
    }

    public synchronized void withdraw(int amt){
        balance -= amt;
        System.out.println(Thread.currentThread().getName() + " withdrew " + amt + ", Balance = " + balance);
    }

    public int getBalance(){
        return balance;
    }
}

public class Synchronization{
    public static void main(String[] args) throws InterruptedException{
        BankAccount account = new BankAccount();

        Thread depositer = new Thread(() -> {
            for (int i=0; i<5; i++){
                account.deposit(100);
            }
        }, "Depositor");

        Thread withdrawer = new Thread(() ->{
            for (int i=0; i<5; i++){
                account.withdraw(50);
            }
        }, "Withdrawer");

        depositer.start();
        withdrawer.start();

        depositer.join();
        withdrawer.join();

        System.out.println("Final Balance: " + account.getBalance());
    }
}
