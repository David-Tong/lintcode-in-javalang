package factory.extension;

import factory.AbstractFactory;
import product.ifs.*;
import product.impl.Dress;
import product.impl.Skirt;

public class ClothesFactory extends AbstractFactory {
    public final static String _SKIRT = "skirt";
    public final static String _DRESS = "dress";
    
    // write your code here
	@Override
	public Clothes getClothes(String clothes) {
		if (clothes.equalsIgnoreCase(ClothesFactory._DRESS)) {
			return new Dress();
		} else if (clothes.equalsIgnoreCase(ClothesFactory._SKIRT)) {
			return new Skirt();
		}
		return null;
	}
	
	@Override
	public Food getFood(String food) {
		return null;
	}
	
	@Override
	public Vehicle getVehicle(String vehicle) {
		return null;
	}
}