package Fundamentals.ObjectAndClasses.Excercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E08CompanyRoster {
    public static class Department {
        String departmentName;

        // note that this class will contain listOfEmployees
        List<Employee> department = new ArrayList<>();

        // person to add is not needed for construction.
        public Department(String name, Employee newEmployee) {
            this.departmentName = name;
            department.add(newEmployee);
        }

        public List<Employee> getDepartment() {
            return department;
        }

        public void addEmployee(Employee newEmployee) {
            this.department.add(newEmployee);
        }

        public String getDepartmentName() {
            return this.departmentName;
        }

        public List<Employee> getEmployeeList(){
            return department;
        }

        public double getAverage() {

            double sum = 0.0;

            for (Employee e : department) {
                sum += e.getSalary();

            }

            return sum / this.department.size();
        }

    }


    public static class Employee {

        String name;
        double salary;
        String position;
        String department;
        String email = "n/a";
        String age = "-1";


        public Employee(String[] inputInfo) {


            this.name = inputInfo[0];
            this.salary = Double.parseDouble(inputInfo[1]);
            this.position = inputInfo[2];
            this.department = inputInfo[3];

            if (inputInfo.length == 5) {
                if (inputInfo[4].length() > 3) {
                    this.email = inputInfo[4];

                } else {
                    this.age = inputInfo[4];
                }
            } else if (inputInfo.length == 6) {
                this.email = inputInfo[4];
                this.age = inputInfo[5];

            }

        }


        public static Employee parseEmployee(String[] inputInfo) {

            return new Employee(inputInfo);


        }

        public String getDepartment() {
            return this.department;
        }

        public double getSalary() {
            return this.salary;
        }

//        name, salary, email and age

        public String toString() {
            return String.format("%s %.2f %s %s", this.name, this.salary, this.email, this.age);

        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Department> departmentList = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            String[] info = scanner.nextLine().split("\\s+");

            Employee newEmployee = Employee.parseEmployee(info);

            checkOfDepartment(departmentList, newEmployee);

        }


        Department highPayedDept = getHighestAverageDept(departmentList);
        List<Employee> listOfEmployees = highPayedDept.getEmployeeList();

        listOfEmployees.sort( (a ,b) -> Double.compare(b.getSalary(), a.getSalary()));

      for(Employee employee :listOfEmployees ){
          System.out.println(employee.toString());
      }

    }

    private static Department getHighestAverageDept(List<Department> departmentList) {
        Department top = departmentList.get(0);

        for (Department department:departmentList){

            if(department.getAverage()> top.getAverage()){
                top=department;

            }

        }

        System.out.println("Highest Average Salary: "+top.getDepartmentName() );
        return top;
    }

    private static void checkOfDepartment(List<Department> departmentList, Employee newEmployee) {
        String departmentOfCurrentEmployee = newEmployee.getDepartment();

        boolean isDepartmentExist = false;
        for (int i = 0; i < departmentList.size(); i++) {


            if (departmentList.get(i).getDepartmentName().equals(departmentOfCurrentEmployee)) {
                departmentList.get(i).addEmployee(newEmployee);
                isDepartmentExist = true;
                break;
            }

        }

        if(!isDepartmentExist){
            Department newDepartment = new Department(departmentOfCurrentEmployee, newEmployee);
            departmentList.add(newDepartment);

        }


    }
}
