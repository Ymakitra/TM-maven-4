import entity.Student;

import java.util.Comparator;

/**
 * Created by okurchyk on 8/9/2016.
 */
public class StudentComparator implements Comparator<Student> {
  public int compare(Student student1, Student student2) {
    String lastName1 = student1.getLastName();
    String lastName2 = student2.getLastName();
    Integer year1 = student1.getYear();
    Integer year2 = student2.getYear();
    Integer age1 = student1.getAge();
    Integer age2 = student2.getAge();
    if (!lastName1.equals(lastName2)) {
      return lastName1.compareTo(lastName2);
    } else if (!year1.equals(year2)) {
      return year1.compareTo(year2);
    } else {
      return age1.compareTo(age2);
    }
  }
}
