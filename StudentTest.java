
import java.util.Scanner;

public class StudentTest {
  public static void main(String[] args) {

    Scanner input1 = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);

    // 1nd student
    System.out.print("Enter the student name: ");
    String name1 = input1.nextLine();
    
    System.out.printf("Enter %s's grade:%n", name1); // "%n"
    int grade1 = input2.nextInt();
    
    Student student1 = new Student(name1, grade1);

    // 2nd student
    System.out.print("Enter the student name: ");
    String name2 = input1.nextLine();
    
    System.out.printf("Enter %s's grade:%n", name2); // "%n"
    int grade2 = input2.nextInt();
    
    Student student2 = new Student(name2, grade2);

    // output for students
    System.out.printf("Welcome %s to the class!%n", student1.getName());
    System.out.printf("%s's grade is: %d%n", student1.getGrade());

    System.out.printf("Welcome %s to the class!%n", student2.getName());
    System.out.printf("%s's grade is: %d%n", student2.getGrade());

    input1.close();
    input2.close();
  } // main
} // class