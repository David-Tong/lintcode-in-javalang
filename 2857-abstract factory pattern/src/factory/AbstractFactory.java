package factory;

import factory.extension.*;
import product.ifs.*;

// write your code here
public abstract class AbstractFactory {
    public final static String _FOODFACTORY = "FoodFactory";
    public final static String _CLOTHESFACTORY = "ClothesFactory";
    public final static String _VEHICLEFACTORY = "VehicleFactory";
    
    public abstract Clothes getClothes(String clothes);
    public abstract Food getFood(String food);
    public abstract Vehicle getVehicle(String vehicle);
}