import java.io.File;
import java.io.FileNotFoundException;
//import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



// draft file - source for read from file work

public class ReadFromFile {
   // public static void main(String[] args){
        //String text;
        //String s = ToArrray();
      //  List<String> myList = new ArrayList<String>(Arrays.asList(s.split(":")));
      //  System.out.println(myList);

  //  }

    private static String ToArrray() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("java/Data.txt"));
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("Reading file error!");

        }
        String text = scanner.useDelimiter("\\A").next();
        scanner.close();
//        System.out.println(text);
        return (text);
    }
}


