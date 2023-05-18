package com.onesoft.collections2;

import java.util.HashMap;
import java.util.Iterator;

public class UseStaff {
	public static void main(String[] args) {
		Staff s1=new Staff(1,"anu","female",25000);
		Staff s2=new Staff(2,"bala","male",30000);
		
		Staff s3=new Staff(3,"kavi","female",21000);
		
		Staff s4=new Staff(4,"ravi","male",24000);
		
		Staff s5=new Staff(5,"rani","female",29000);
		
		Staff s6=new Staff(6,"banu","female",30000);
		Staff s7=new Staff(7,"mala","female",30000);
		Staff s8=new Staff(8,"shiva","male",18000);
		Staff s9=new Staff(9,"hari","male",20000);
		Staff s10=new Staff(10,"chandru","male",34000);
		
		
		HashMap<Integer,Staff> Staffs=new HashMap<>();
		Staffs.put(s1.getId(),s1);
		Staffs.put(s2.getId(),s2);
		Staffs.put(s3.getId(),s3);
		Staffs.put(s4.getId(),s4);
		Staffs.put(s5.getId(),s5);
		Staffs.put(s6.getId(),s6);
		Staffs.put(s7.getId(),s7);
		Staffs.put(s8.getId(),s8);
		Staffs.put(s9.getId(),s9);
		Staffs.put(s10.getId(),s10);
		
		
	System.out.println("*****************enhance for**************\n");
	for(Integer x:Staffs.keySet()) {
		System.out.println(x);
		System.out.println(Staffs.get(x));
		
	}
	System.out.println("\n");
	Staffs.forEach((k,v)->System.out.println(k+","+v));
	System.out.println("\n");
	Iterator itr=Staffs.keySet().iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		
	}
	Iterator<Staff> itr1=Staffs.values().iterator();
	while(itr1.hasNext()) {
		System.out.println(itr1.next()+"\n");
		
	}
	for(Integer x:Staffs.keySet()) {
		if(Staffs.get(x).getGender().equalsIgnoreCase("female")) {
			System.out.println("female staffs are: "+Staffs.get(x).getName());
		}
	}
	for(Integer x:Staffs.keySet()) {
		if(Staffs.get(x).getSalary()>25000) {
			System.out.println("staffs having salary more than 25000: "+Staffs.get(x).getName());
		}
	}
	
	}
	
	
	}


