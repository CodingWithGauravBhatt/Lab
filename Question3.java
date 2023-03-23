package Today23Mar;

import java.util.Scanner;

public class Question3 {
    public static int addTwoPositive() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a <= 0 || b <= 0) {
            throw new ArithmeticException("Non-positive integer sent");
        }
        return a + b;
    }

    public static void main(String[] args) {
        try {
            int sum = addTwoPositive();
            System.out.println(sum);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
