import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TM {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("C:\\IDEA\\V3\\src\\main\\javaData.txt"));
        String text = scanner.useDelimiter("\\A").next();
        scanner.close();
        System.out.println(text);
    }
}