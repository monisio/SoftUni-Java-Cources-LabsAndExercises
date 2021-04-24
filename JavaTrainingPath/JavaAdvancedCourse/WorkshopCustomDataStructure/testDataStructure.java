package JavaAdvancedCourse.WorkshopCustomDataStructure;

public class testDataStructure {


    public static void main(String[] args) {


        SmartArray testCase = new SmartArray();

        for (int i = 0; i <= 100; i++) {
            testCase.add(i);
        }

        testCase.remove(0);

        System.out.println(testCase.get(100));
    }
}
