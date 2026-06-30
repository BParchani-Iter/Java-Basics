package exception;
import java.util.Scanner;

public class AgeValidation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter age:");
        int age = sc.nextInt();

        try{
            if (age < 18){
                throw new InvalidAgeException("Age should be 18 or above");
            }
            System.out.println("Valid age.");
        } catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}