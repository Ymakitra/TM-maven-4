import entity.Student;

import java.util.*;

public class Main {
  private static final String path = "src/main/resources/Data.txt";

  public static void main(String[] args) {

    List<String> lines = Utils.readLines(path);

    List<Student> workStudents = new ArrayList<Student>();
    LinkedList<Student> students = new LinkedList<Student>();

    System.out.println("Input list: ");


    for (String line : lines) {

      Student student = Utils.parseLine(line);
      students.add(student);

    }

    Utils.printList(students);


  }

}
