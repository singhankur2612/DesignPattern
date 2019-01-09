package com.factorydp;

public class VegMeal implements Meal {

	@Override
	public long cost() {
		return 100;
	}

	@Override
	public String type() {
		return "veg";
	}

}
