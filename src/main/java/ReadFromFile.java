import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        String text;
//        System.out.println(ToArrray());
        String s = ToArrray();

        List<String> myList = new ArrayList<>(Arrays.asList(s.split(":")));
        System.out.println(myList);

    }
    private static String ToArrray() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("C:\\IDEA\\V3\\src\\main\\java\\Data.txt"));
        String text = scanner.useDelimiter("\\A").next();
        scanner.close();
//        System.out.println(text);
        return (text);
    }
}


