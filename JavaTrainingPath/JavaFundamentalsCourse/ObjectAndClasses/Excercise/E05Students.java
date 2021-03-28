package JavaFundamentalsCourse.ObjectAndClasses.Excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E05Students {

   public static class Student {

       String firstName;
       String lastName;
       double grade;



       public Student(String firstName, String lastName, double grade){
           this.firstName = firstName;
           this.lastName = lastName;
           this.grade = grade;

       }


       public String getFirstName() {
           return firstName;
       }

       public String getLastName() {
           return lastName;
       }

       public double getGrade() {
           return grade;
       }

       public static Student parseStudent(String studentInfo){
          String [] s = studentInfo.split(" ");
          return new Student(s[0],s[1],Double.parseDouble(s[2]));
       }

       public String toString(){
           return String.format("%s %s: %.2f",getFirstName(),getLastName(), getGrade());
       }
   }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Student> studentList = new ArrayList<>();

        for (int i = 0; i <n ; i++) {

            Student student = Student.parseStudent(scanner.nextLine());

            studentList.add(student);

        }

        studentList.sort((s1,s2) -> Double.compare(s2.getGrade() , s1.getGrade()));

        for (Student student: studentList){
            System.out.println(student.toString());
        }


    }
}
