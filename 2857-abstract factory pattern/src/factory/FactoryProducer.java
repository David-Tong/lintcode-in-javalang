package factory;

import factory.extension.ClothesFactory;
import factory.extension.FoodFactory;
import factory.extension.VehicleFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(String choice){
        // write your code here
        if (choice.equalsIgnoreCase(AbstractFactory._CLOTHESFACTORY)) {
        	return new ClothesFactory();
        } else if (choice.equalsIgnoreCase(AbstractFactory._FOODFACTORY)) {
        	return new FoodFactory();
        } else if (choice.equalsIgnoreCase(AbstractFactory._VEHICLEFACTORY)) {
        	return new VehicleFactory();
        }
        return null;
    }
}