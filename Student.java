
public class Student {
  public String name;
  private int grade;

  // constructor
  public Student(String name, int grade) {
    this.name = name;
    this.grade = grade;
  }

  // getters
  public String getName() {
    return this.name;
  } // getName()
  public int getGrade() {
    return this.grade;
  } // getGrade()

  // setters
  public void setName(String name) {
    this.name = name;
  } // setName()
  public void setGrade(int grade) {
    this.grade = grade;
  } // setGrade()

} // class