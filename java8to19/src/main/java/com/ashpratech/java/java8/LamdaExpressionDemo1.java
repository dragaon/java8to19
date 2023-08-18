package com.ashpratech.java.java8;

import java.util.Arrays;
import java.util.List;

import com.ashpratech.java.model.Car;
import com.ashpratech.java.model.consts.BRAND;

public class LamdaExpressionDemo1 {

	interface CarPrinter{
		public void print(Car car) ;
	}
	
	public List<Car> getCarInventory(){
		return Arrays.asList(
				new Car(11202,BRAND.MAHINDRA),
				new Car(13402,BRAND.MARUTHI),
				new Car(19082,BRAND.TATA),
				new Car(10209,BRAND.TATA),
				new Car(192102,BRAND.BMW));
	}
	 
	public void printCars (List<Car> inventory, CarPrinter cp){
		for(Car c : inventory) {
			cp.print(c);
 		}
	}
	
	public static void main(String[] args) {
		LamdaExpressionDemo1 demo = new LamdaExpressionDemo1();
		List<Car> inventory = demo.getCarInventory();
		demo.printCars(inventory, c -> System.out.println(c.getBrand()));
		
		demo.printCars(inventory, c -> {
				if (BRAND.MARUTHI.equals(c.getBrand())) {
					System.out.println(c.getBrand());
				}
			}
		);
	}
}
