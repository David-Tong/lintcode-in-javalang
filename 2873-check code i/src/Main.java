import java.lang.reflect.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws Exception {
		Class<Student> stuClass = Student.class;
		Field[] fs = stuClass.getDeclaredFields();
		for (Field f : fs) {
			if (!Modifier.isFinal(f.getModifiers())) {
				throw new Exception("'name' and 'age' must be final.");
			}
		}

		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int age = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		Student stu = new Student(name, age);
		System.out.println(String.format("%.2f", stu.math(a, b)));
		System.out.println(stu);
		sc.close();
	}

}