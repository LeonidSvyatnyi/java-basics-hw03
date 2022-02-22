import java.util.ArrayList;
import java.util.List;

public class Student {
  private int rating;
  private String name;


  public Student(String name) {
    this.name = name;
  }

  public static double getAvgRating(List<Student> students) {
    double sum = 0;
    if (students.size() == 0) {
      return 0;
    }
    for (Student student : students) {
      sum += student.getRating();
    }
    return sum / students.size();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  public boolean betterStudent(Student student) {
    if (this.rating > student.rating) {
      return true;
    }
    return false;
  }

  public void changeRating(int rating) {
    this.rating = rating;
  }

  public static void removeStudent(Student student) {

  }

  @Override
  public String toString() {

    return this.name + " " + this.rating;
  }

  public static void main(String[] args){
    List<Student> studentList = new ArrayList<>();
    Student student1 = new Student("Petro");
    Student student2 = new Student("Volodymyr");
    Student student3 = new Student("Leonid");
    student1.setRating(5);
    student2.setRating(15);
    student3.setRating(20);
    studentList.add(student1);
    studentList.add(student2);
    studentList.add(student3);
    System.out.println(getAvgRating(studentList));
    student2.changeRating(50);
    System.out.println(getAvgRating(studentList));
  }
}
