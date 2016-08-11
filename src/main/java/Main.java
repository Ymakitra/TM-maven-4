import entity.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  private static final String path = "src/main/resources/Data.txt";

  public static void main(String[] args) {

    List<String> lines = Utils.readLines(path);
    List<Student> students = new ArrayList<Student>();

    for (String line : lines) {
      Student student = Utils.parseLine(line);
      students.add(student);
    }

    Collections.sort(students, new StudentComparator());

   System.out.println(students);


  }

}
