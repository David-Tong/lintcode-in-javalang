package product.impl;

import product.ifs.Food;

// write your code here
public class Apple implements Food {
    String s = "Eat Apple";

	public String eat() {
		return s;
	}
}