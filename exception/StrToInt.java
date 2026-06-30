package exception;

public class StrToInt {
    public static void main(String[] args){
        String num = "abc";

        try {
            int value = Integer.parseInt(num);
            System.out.println(value);
        } catch(NumberFormatException e){
            System.out.println("Invalid number");
        }
    }
}