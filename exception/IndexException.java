package exception;

public class IndexException{
    public static void main(String[] args){
        int[] numbers = {1, 2, 3, 4, 5};

        try{
            System.out.println(numbers[10]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }
    }
}