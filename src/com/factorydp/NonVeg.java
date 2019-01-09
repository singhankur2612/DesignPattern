package com.factorydp;

public class NonVeg implements Meal {

	@Override
	public long cost() {
		return 200;
	}

	@Override
	public String type() {
		return "NonVeg";
	}

}
