import java.lang.reflect.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		
		Class<Vehicle> v = Vehicle.class;
		if(!Modifier.isAbstract(v.getModifiers())) {
			throw new Exception("类不符合题意");
		}
		
		Method m1 = v.getMethod("NoOfWheels");
		if(!Modifier.isAbstract(m1.getModifiers())) {
			throw new Exception("类中的方法不符合题意");
		}
		Vehicle c = new Car();
		System.out.println(c.NoOfWheels());
		Vehicle m = new Motorbike();
		System.out.println(m.NoOfWheels());
	}

}
