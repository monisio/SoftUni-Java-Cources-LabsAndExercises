package JavaAdvancedCourse.Generics.E01JarClass;

public class Main {
    public static void main(String[] args) {

        Jar<String> jar = new Jar<>();


        jar.add("koakdo");
        jar.add("dada");
        jar.add("kogagaga");
        jar.add("koaqrqrqr");

        System.out.println(jar.remove());
        System.out.println(jar.remove());
        System.out.println(jar.remove());
        System.out.println(jar.remove());
        System.out.println(jar.remove());

    }

}
