import entity.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import java.io.IOException;

public class Utils {
  public static List<String> readLines(String fileName) {
    List<String> lines = new ArrayList<String>();
    try {
      File file = new File(fileName);
      Scanner scanner = new Scanner(file);
      while (scanner.hasNext()) {
        lines.add(scanner.next());
      }
      scanner.close();
    } catch (FileNotFoundException e) {
      //e.printStackTrace();
        System.out.println("Reading Data.txt error!");
    }
    return lines;
  }

  public static Student parseLine(String line) {
    String[] parts = line.split(":");
    Student student = new Student();
    student.setLastName(parts[0]);
    student.setYear(Integer.valueOf(parts[1]));
    student.setAge(Integer.valueOf(parts[2]));

    return student;
  }

  public static void printList(List<Student> list) {
    System.out.printf("%12s %5s %5s\n", "LastName", "Year", "Age");
    for (Student student : list) {
      System.out.printf("%12s %5d %5d\n", student.getLastName(), student.getYear(), student.getAge());
    }
  }

}


