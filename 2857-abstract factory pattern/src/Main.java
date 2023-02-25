import java.lang.reflect.*;
import java.util.*;

import factory.*;
import product.ifs.Clothes;
import product.ifs.Food;
import product.ifs.Vehicle;

public class Main {
	public static void main(String[] args) throws Exception{

		Class<AbstractFactory> s = AbstractFactory.class;
		if (!Modifier.isAbstract(s.getModifiers())) {
			throw new Exception("抽象工厂类不符合题意");
		}

		Method[] ms = s.getDeclaredMethods();
		for (Method m : ms) {
			if (!Modifier.isAbstract(m.getModifiers())) {
				throw new Exception("抽象工厂类中的方法不符合题意");
			}
		}

		AbstractFactory factory = FactoryProducer.getFactory("foodfactory");
		Food f1 = factory.getFood("apple");
		Food f2 = factory.getFood("meat");
		System.out.println(f1.eat());
		System.out.println(f2.eat());

		factory = FactoryProducer.getFactory("clothesfactory");
		Clothes c1 = factory.getClothes("skirt");
		Clothes c2 = factory.getClothes("dress");
		System.out.println(c1.wear());
		System.out.println(c2.wear());

		factory = FactoryProducer.getFactory("vehiclefactory");
		Vehicle v1 = factory.getVehicle("benz");
		Vehicle v2 = factory.getVehicle("bmw");
		System.out.println(v1.drive());
		System.out.println(v2.drive());

	}

}