import java.lang.reflect.*;
import java.util.*;


public class Main {
	public static void main(String[] args) throws Exception {
		Class<Person> perClass = Person.class;
		if (!perClass.isInterface()) {
			throw new Exception("Person must be an Interface. ");
		}
		Field namef = perClass.getField("ifs");
        Person stu = new Student();

		System.out.println(stu.speak());
	}

}