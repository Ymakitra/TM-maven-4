import entity.Student;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

//import java.io.IOException;

public class Utils {

  public static List<String> readLines(String fileName) {
    TM tm = new TM();
    //List<String> lines = new ArrayList<String>();
 // try {

    // File file = new File(fileName);
    return tm.File(fileName);
    // Scanner scanner = new Scanner(file);
      //while (scanner.hasNext()) {
        //lines.add(scanner.next());
      //}
     // scanner.close();
   // } catch (FileNotFoundException e) {
      //e.printStackTrace();
  // }
    //return lines;
  }

  public static Student parseLine(String line) {
    String[] parts = line.split(",");
    Student student = new Student();
    student.setLastName(parts[0]);
    student.setYear(Integer.valueOf(parts[1]));
    student.setAge(Integer.valueOf(parts[2]));

    return student;
  }

  public static void printList(List<Student> sortlist ) {
    System.out.printf("%12s %1s %1s   %12s %2s %2s\n", "LastName,", "Year,", "Age,","  => Output List:    LastName,", "Year,", "Age");

    TM tm = new TM();
    List<String> ll = new LinkedList<String>();

    ll = tm.File("src/main/resources/Data.txt");
    Iterator itn = sortlist.iterator();
    for (String e  : ll) {

      System.out.printf("%20s    ", e.toString());

if (itn.hasNext()) {
Collections.sort(sortlist, new StudentComparator());
  System.out.printf("%36s\n",ToStringBuilder.reflectionToString(itn.next(), ToStringStyle.SIMPLE_STYLE));

}

    }
  }

}


