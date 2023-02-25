package factory.extension;

import factory.AbstractFactory;
import product.ifs.*;
import product.impl.Apple;
import product.impl.Meat;

public class FoodFactory extends AbstractFactory {
    public final static String _APPLE = "apple";
    public final static String _MEAT = "meat";
    
    // write your code here
	@Override
	public Clothes getClothes(String clothes) {
		return null;
	}
	
	@Override
	public Food getFood(String food) {
		if (food.equalsIgnoreCase(FoodFactory._APPLE)) {
			return new Apple();
		} else if (food.equalsIgnoreCase(FoodFactory._MEAT)) {
			return new Meat();
		}
		return null;
	}
	
	@Override
	public Vehicle getVehicle(String vehicle) {
		return null;
	}     
}