import java.io.File;
import java.io.FileNotFoundException;
//import java.io.IOException;
import java.util.Scanner;

public class TM {
    public static void main(String[] args) {//throws IOException {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("C:\\IDEA\\V3\\src\\main\\javaData.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String text = scanner.useDelimiter("\\A").next();
        scanner.close();
        System.out.println(text);
    }
}