package JavaOOPCourse.Inheritance.RandomArrayList;

public class Main {
    public static void main(String[] args) {

        RandomArrayList arrayList = new RandomArrayList();

        arrayList.add(-1);
        arrayList.add(10);
        arrayList.add("dadad");
        arrayList.add(1.23);
        arrayList.add(10);
        arrayList.add(110000);

        System.out.println(arrayList.getRandomElement());
        System.out.println(arrayList.getRandomElement());
        System.out.println(arrayList.getRandomElement());
        System.out.println(arrayList.getRandomElement());
        System.out.println(arrayList.getRandomElement());
        System.out.println(arrayList.getRandomElement());

    }
}
