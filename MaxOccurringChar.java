package Today15Mar;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxOccurringChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        char maxChar = findMaxOccurringChar(str);

        System.out.println("Max occurring character: " + maxChar);
    }

    public static char findMaxOccurringChar(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = charCountMap.getOrDefault(ch, 0);
            charCountMap.put(ch, count + 1);
        }

        int maxCount = 0;
        char maxChar = ' ';

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();
            if (count > maxCount) {
                maxCount = count;
                maxChar = ch;
            }
        }

        return maxChar;
    }
}
