 package exception;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args){
        BankAccount account = new BankAccount(5000);

        try{
            account.withdraw(8000);
        } catch (InsufficientFundsException e) {
            System.out.println("LOG: " + e.getMessage());
        }

        try{
            account.deposit(-500);
        } catch (InvalidAmountException e){
            System.out.println("LOG: " + e.getMessage());
        }

        try{
            FileReaderDemo.readFile("account.txt");
        } catch (FileNotFoundException e) {
            System.out.println("LOG: File not found");
        } finally {
            System.out.println("Finally block executed.");
        }
    }
}