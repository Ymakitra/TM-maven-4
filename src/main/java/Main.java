import entity.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by okurchyk on 8/9/2016.
 */
public class Main {
  private static final String path = "C:\\Users\\okurchyk\\Desktop\\TM-maven-4-master\\src\\main\\resources\\Data.txt";

  public static void main(String[] args) {

    List<String> lines = Utils.readLines(path);
    List<Student> students = new ArrayList<Student>();

    for (String line : lines) {
      Student student = Utils.parseLine(line);
      students.add(student);
    }

    System.out.println("Unsorted list");
    Utils.printList(students);
    System.out.println("-------");

    Collections.sort(students, new StudentComparator());

    System.out.println("Sorted list");
    Utils.printList(students);
    System.out.println("-------");

  }

}
