package JavaOOPCourse.Encapsulation.SortByNameAndAge;

import java.text.DecimalFormat;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);

    }

    public Person(String firstName, String lastName, int age, double salary) {
        this(firstName, lastName, age);
        setSalary(salary);

    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return salary;
    }

    private void setFirstName(String firstName) {
       checkName(firstName);
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        checkName(lastName);
        this.lastName = lastName;
    }

    private void setAge(int age) {
        if (age<=0){
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    private void setSalary(double salary) {
        if(salary<460){
            throw new IllegalArgumentException("Salary can't be less than 460.0");
        }

        this.salary = salary;
    }


    public void increaseSalary(double bonus) {
        double salary =this.getSalary();
        double newSalary;

        if (this.age < 30) {
            newSalary = salary + (salary * (bonus / 200));
        } else {
            newSalary =salary + (salary * (bonus / 100));
        }
        setSalary(newSalary);


    }


    private void checkName(String name){
        if(name.length() < 3){
            throw new IllegalArgumentException("Names must be at least 3 symbols");
        }
    }

    @Override
    public String toString() {

        DecimalFormat df = new DecimalFormat("#######.###");

        return String.format("%s %s gets %s leva.", this.firstName, this.lastName, df.format(this.salary));
    }
}
