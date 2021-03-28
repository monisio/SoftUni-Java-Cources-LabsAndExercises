package JavaFundamentalsCourse.ObjectAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E05Students {

    public static class Student{

        String firstName;
        String lastName;
        int age;
        String homeTown;

        public Student(){ }

        public Student(String firstName, String lastName, String age , String homeTown   ){
            this.firstName= firstName;
            this.lastName= lastName;
            this.age = Integer.parseInt(age);
            this.homeTown= homeTown;

        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setHomeTown(String homeTown) {
            this.homeTown = homeTown;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }



    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        List<Student> studentList= new ArrayList<>();

        while (!input.equals("end")){
            String [] studentInput = input.split(" ");

           int index = checkIfContainStudent(studentList,studentInput[0],studentInput[1]);

            // if could be made with boolean returning method in which you are returning true when student with same name is found.
           if(index==-1){
               Student newStudent = new Student();
               newStudent.setFirstName(studentInput[0]);
               newStudent.setLastName(studentInput[1]);
               newStudent.setAge(Integer.parseInt(studentInput[2]));
               newStudent.setHomeTown(studentInput[3]);

               studentList.add(newStudent);
           }else{
              Student studentOnIndex = studentList.get(index);
               studentOnIndex.setAge(Integer.parseInt(studentInput[2]));
               studentOnIndex.setHomeTown(studentInput[3]);

           }




            input= scanner.nextLine();

        }

        String town = scanner.nextLine();


        for (Student student :studentList) {

            if(student.homeTown.equals(town)){
                System.out.println(String.format("%s %s is %d years old.", student.firstName,student.lastName, student.age));
            }

        }




    }

    private static int checkIfContainStudent(List<Student> studentList, String firstName, String lastName) {

        int indexOfStudent = -1;


        for (int i = 0; i <studentList.size() ; i++) {
            Student student = studentList.get(i);


            if (student.firstName.equals(firstName) && student.lastName.equals(lastName)){
                indexOfStudent = i;
            }


        }

        return indexOfStudent;
    }
}
