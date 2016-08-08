import java.io.File;
import java.io.FileNotFoundException;
//import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class ReadFromFile {
    public static void main(String[] args){// throws IOException {
        //String text;
        String s = ToArrray();
        List<String> myList = new ArrayList<String>(Arrays.asList(s.split(":")));
        System.out.println(myList);

    }

    private static String ToArrray() {//throws FileNotFoundException {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("C:\\IDEA\\V3\\src\\main\\java\\Data.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String text = scanner.useDelimiter("\\A").next();
        scanner.close();
//        System.out.println(text);
        return (text);
    }
}


