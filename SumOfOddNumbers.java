package Today2Mar;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= N; i += 2) {
            sum += i;
        }

        System.out.println("The sum of odd numbers up to " + N + " is " + sum);
    }
}
