package JavaOOPCourse.ReflectionAndAnnotations.Excercise.Skeletons.harvestingFields;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String command = scanner.nextLine();

		Class<RichSoilLand> clazz = RichSoilLand.class;

		while (!command.equals("HARVEST")){

			Field [] fields = clazz.getDeclaredFields();
			Field [] output ;
			switch (command){

				case "private":
					output = Arrays.stream(fields)
							.filter(field -> Modifier.isPrivate(field.getModifiers()))
							.toArray(Field[]::new);
					break;

				case "protected":
					output = Arrays.stream(fields)
							.filter(field -> Modifier.isProtected(field.getModifiers()))
							.toArray(Field[]::new);
					break;

				case "public":
					output = Arrays.stream(fields)
							.filter(field -> Modifier.isPublic(field.getModifiers()))
							.toArray(Field[]::new);
					break;

				default: output = fields;
			}

			for (Field field : output) {

				System.out.println(Modifier.toString(field.getModifiers()) + " "+ field.getType().getSimpleName() + " " + field.getName());
			}




			command= scanner.nextLine();
		}

	}
}
