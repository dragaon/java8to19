package com.ashpratech.java.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ashpratech.java.model.Apple;

public class LamdaExpressionDemo {

	interface ApplePredicate{
		public boolean test(Apple apple) ;
	}
	
	public List<Apple> getAppleInventory(){
		return Arrays.asList(
				new Apple(102,109, "green"),
				new Apple(90,120,"red"),
				new Apple(145,130,"brown"),
				new Apple(150,134,"red"),
				new Apple(110,99,"green"),
				new Apple(172,178,"green"));
	}
	
	public List<Apple> filterApples (List<Apple> inventory, ApplePredicate ap){
		List<Apple> result = new ArrayList<Apple>();
		for(Apple apple : inventory) {
			if (ap.test(apple)) {
				result.add(apple);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		LamdaExpressionDemo demo = new LamdaExpressionDemo();
		List<Apple> inventory = demo.getAppleInventory();
		List<Apple> greenApples = demo.filterApples(inventory, a -> "green".equals(a.getColor()));
		List<Apple> overWeightApples = demo.filterApples(inventory, a -> a.getWeight() > 140);
		List<Apple> overWeightGreenApples = demo.filterApples(inventory, a -> a.getWeight() > 140 && "green".equals(a.getColor()));
		System.out.println("Green Apples " + greenApples);
		System.out.println("overWeight Apples " + overWeightApples);
		System.out.println("overWeightGreen Apples " + overWeightGreenApples);
	}
}
