package entity;

/**
 * Created by okurchyk on 8/9/2016.
 */
public class Student {
  private String lastName;
  private Integer year;
  private Integer age;

  public Student() {
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Student{" +
            "lastName='" + lastName + '\'' +
            ", year=" + year +
            ", age=" + age +
            '}';
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Integer getYear() {
    return year;
  }

  public void setYear(Integer year) {
    this.year = year;
  }
}
