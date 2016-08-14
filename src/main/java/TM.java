import java.io.File;
import java.io.FileNotFoundException;
//import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TM {
    public List<String> File(String s) {
        List<String> ln = new ArrayList<String>();
       // Scanner scanner = null;
        try {
            File file = new File(s);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                ln.add(scanner.next());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
            System.out.println("Reading file error!");
        }
       // String text = scanner.
                //useDelimiter("\\A").next();
        return ln;
       // scanner.close();
        //System.out.println(text);
    }
}