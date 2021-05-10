package JavaAdvancedCourse.IteratorsAndComparators.Exercises.E05StrategyPattern;

import JavaAdvancedCourse.IteratorsAndComparators.Exercises.E04ComparingObjects.Person;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int result = Integer.compare( o1.getName().length(), o2.getName().length());

        return result!=0 ? result : Integer.compare( o1.getName().toLowerCase().charAt(0), o2.getName().toLowerCase().charAt(0));
    }
}
