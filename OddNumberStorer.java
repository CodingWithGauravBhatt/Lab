package Today13Apr;
import java.util.ArrayList;

public class OddNumberStorer {
    private ArrayList<Integer> A1;
    private ArrayList<Integer> A2;

    public ArrayList<Integer> storeOddNumbers(int N) {
        A1 = new ArrayList<>();

        // Loop through numbers from 2 to N and add odd numbers to A1
        for (int i = 2; i <= N; i++) {
            if (i % 2 != 0) {
                A1.add(i);
            }
        }

        return A1;
    }

    public ArrayList<Integer> printOddNumbers() {
        A2 = new ArrayList<>();

        // Loop through A1 and multiply each odd number with 5
        for (int num : A1) {
            int product = num * 5;
            System.out.print(product + ",");
            A2.add(product);
        }

        System.out.println(); // Print a new line after the last number
        return A2;
    }

    public int retrieveOddNumber(int N) {
        // Search for the number N in A1
        for (int num : A1) {
            if (num == N) {
                return num;
            }
        }

        return 0; // N was not found in A1
    }

    public static void main(String[] args) {
        OddNumberStorer storer = new OddNumberStorer();
        storer.storeOddNumbers(10);
        storer.printOddNumbers();
        System.out.println(storer.retrieveOddNumber(5)); // Output: 5
        System.out.println(storer.retrieveOddNumber(4)); // Output: 0
    }
}
