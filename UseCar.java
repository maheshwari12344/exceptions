package com.onesoft.collections2;

import java.util.HashMap;
import java.util.Iterator;

public class UseCar {
	public static void main(String[] args) {
		Car c1=new Car(456,"maruti", 500000,"grey","hj44");
		Car c2=new Car(454,"nano",400000,"white","njk44");
		Car c3=new Car(56,"audi", 300000,"black","shun44");
		Car c4=new Car(46,"bmw", 600000,"grey","h513");
		Car c5=new Car(556,"maruti",560000,"red","hjvy");
		Car c6=new Car(46,"toyoto", 700000,"white","nji44");
		Car c7=new Car(4561,"benz", 400000,"blue","zs44");
		Car c8=new Car(7456,"swizz", 450000,"green","nh4");
		HashMap<Integer,Car> cars=new HashMap<>();
		cars.put(c1.getChasisNumber(), c1);
		cars.put(c2.getChasisNumber(), c2);
		cars.put(c3.getChasisNumber(), c3);
		cars.put(c4.getChasisNumber(), c4);
		cars.put(c5.getChasisNumber(), c5);
		cars.put(c6.getChasisNumber(), c6);
		cars.put(c7.getChasisNumber(), c7);
		cars.put(c8.getChasisNumber(), c8);
		//cars.remove(c8.getChasisNumber());	to remove whole object
		System.out.println("\n");
		for(Integer k:cars.keySet()) {
			if(cars.get(k).getBrand().equalsIgnoreCase("audi")) {
				
			
			//System.out.println(k);
			System.out.println(cars.get(k));
			}
		}
		int max=c1.getPrice();
		for(Integer k: cars.keySet()) {
			if(cars.get(k).getPrice()>max) {
				max=cars.get(k).getPrice();
			}
		}
				System.out.println("Highest price is "+max);
			//	for(Integer k: cars.keySet()) {
			//		if(cars.get(k).getColour().equalsIgnoreCase("white")) {                       concurrent error ------multithread 
			//			cars.remove(k);
			//		}
			//	}	
				
			
				
				
				Iterator<Car> itr=cars.values().iterator();
				while(itr.hasNext()) {
					if(itr.next().getColour().equalsIgnoreCase("white")){
						itr.remove();
					}
				
				}
				System.out.println(cars.values());
				
				
			
		
	}

}
