package JavaAdvancedCourse.WorkshopCustomDataStructure;

public class testDataStructure {


    public static void main(String[] args) {


        SmartStack testCase = new SmartStack();

        testCase.push(1);
        testCase.push(2);
        testCase.push(3);

        int[] ints = testCase.toArray();


        System.out.println();

    }
}
