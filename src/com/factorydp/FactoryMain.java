package com.factorydp;

public class FactoryMain {

	public static void main(String[] args) {
		MealFactorySystem factorySystem=new MealFactorySystem();
		Meal meal=factorySystem.getMeal("veg");
		System.out.println(meal.type()+"----"+meal.cost());
		Meal anothermeal=factorySystem.getMeal("nonveg");
		System.out.println(anothermeal.type()+"----"+anothermeal.cost());

	}

}
