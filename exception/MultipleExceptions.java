package exception;

public class MultipleExceptions {
    public static void main(String[] args) {
        int numbers[] = {10, 20, 30};
        String s = null;

        try {
            System.out.println(numbers[6]);
            System.out.println(s);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index not valid");
        } catch (NullPointerException e) {
            System.out.println("Requested value is null");
        }
    }
}