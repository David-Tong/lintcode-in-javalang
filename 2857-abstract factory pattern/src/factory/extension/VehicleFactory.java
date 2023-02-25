package factory.extension;

import factory.AbstractFactory;
import product.ifs.*;
import product.impl.*;
import product.impl.Bmw;

public class VehicleFactory extends AbstractFactory {
    public final static String _BENZ = "benz";
    public final static String _BMW = "bmw";
    
    // write your code here
	@Override
	public Clothes getClothes(String clothes) {
		return null;
	}
	
	@Override
	public Food getFood(String food) {
		return null;
	}
	
	@Override
	public Vehicle getVehicle(String vehicle) {
		if (vehicle.equalsIgnoreCase(VehicleFactory._BENZ)) {
			return new Benz();
		} else if (vehicle.equalsIgnoreCase(VehicleFactory._BMW)) {
			return new Bmw();
		}
		return null;
	}
}