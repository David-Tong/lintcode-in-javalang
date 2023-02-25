package product.impl;

import product.ifs.Vehicle;

// write your code here
public class Benz implements Vehicle {
    String s = "Drive Benz";

	public String drive() {
		return s;
	}   
}