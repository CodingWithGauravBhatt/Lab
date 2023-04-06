package Today6Apr;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice: 1 for store data, 2 for print data");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Enter data to store in file:");
            scanner.nextLine(); // consume newline left-over

            String data = scanner.nextLine();
            try {
                File file = new File("data.txt");
                FileWriter writer = new FileWriter(file);
                writer.write(data);
                writer.close();
                System.out.println("Data successfully stored in file!");
            } catch (IOException e) {
                System.out.println("Error storing data in file: " + e.getMessage());
            }
        } else if (choice == 2) {
            try {
                File file = new File("data.txt");
                Scanner fileScanner = new Scanner(file);
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    System.out.println(line);
                }
                fileScanner.close();
            } catch (IOException e) {
                System.out.println("Error reading data from file: " + e.getMessage());
            }
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
