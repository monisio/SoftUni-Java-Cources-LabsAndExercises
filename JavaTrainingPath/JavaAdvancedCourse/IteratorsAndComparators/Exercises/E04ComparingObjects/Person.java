package JavaAdvancedCourse.IteratorsAndComparators.Exercises.E04ComparingObjects;

public class Person implements Comparable<Person> {

    private String name;
    private Integer age;
    private String town;

    public Person(String name, int age , String town){
        this.name= name;
        this.age= age;
        this.town = town;
    }

    @Override
    public int compareTo(Person other) {
         int result=0;

         if(this.name.compareTo(other.name)!=0||this.age.compareTo(other.age)!=0||this.town.compareTo(other.town)!=0){
             result=1;
         }

        return result;
    }
}
