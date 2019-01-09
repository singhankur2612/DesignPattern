package com.factorydp;

public class MealFactorySystem {
	public Meal getMeal(String mealType) {
		if(mealType.equals("veg")) {
			return new VegMeal();
		}else {
			return new NonVeg();
		}
	}
	

}
