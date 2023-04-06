package Today6Apr;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Question2 {

    public static void main(String[] args) {
        File file = new File("D:\\java12.txt");

        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            byte[] bytesArray = new byte[(int) file.length()];
            fileInputStream.read(bytesArray);
            String fileContent = new String(bytesArray);

            System.out.println("File content as byte array: " + bytesArray);
            System.out.println("File content as string: " + fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
