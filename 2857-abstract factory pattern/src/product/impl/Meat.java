package product.impl;

import product.ifs.Food;

// write your code here
public class Meat implements Food {
    String s = "Eat Meat";

	public String eat() {
		return s;
	}
}