package Today23Mar;

import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        try {
            x = sc.nextInt();
            y = sc.nextInt();
            if (y == 0) {
                throw new ArithmeticException("/ by zero");
            }
            int result = x / y;
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println("Input Mismatch Exception");
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
