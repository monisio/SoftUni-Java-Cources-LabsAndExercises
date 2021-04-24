package JavaAdvancedCourse.WorkshopCustomDataStructure;

public class testDataStructure {


    public static void main(String[] args) {


        SmartArray testCase = new SmartArray();

        for (int i = 0; i <= 16; i++) {
            testCase.add(i);
        }

        testCase.add(1000 , 0);
        testCase.add(1000, 19);
        System.out.println(testCase.contains(16));
    }
}
