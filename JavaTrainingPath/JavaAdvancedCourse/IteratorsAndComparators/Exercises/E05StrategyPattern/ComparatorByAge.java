package JavaAdvancedCourse.IteratorsAndComparators.Exercises.E05StrategyPattern;

import JavaAdvancedCourse.IteratorsAndComparators.Exercises.E04ComparingObjects.Person;

import java.util.Comparator;

public class ComparatorByAge implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {

        return o1.getAge().compareTo(o2.getAge());

        //2nd variant
       // return o1.getAge()-o2.getAge();
    }

}
