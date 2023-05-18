package com.onesoft.collections2;

import java.util.HashMap;
import java.util.Iterator;

public class Sample {
	public static void main(String[] args) {
		HashMap <String,Long>phoneBook=new HashMap<>();
		phoneBook.put("john", 69421358654l);
		phoneBook.put("hari",468623232l);
		phoneBook.put("prem", 8945313256l);
		phoneBook.put("mahes", 64542121246l);
		phoneBook.put("smith", 78876132323l);
	//	System.out.println(phoneBook.get("prem"));
	//	System.out.println(phoneBook.keySet());
	//	System.out.println(phoneBook.values());
		for(String k:phoneBook.keySet()) {                         //enhance for loop
			System.out.println(k);
			System.out.println(phoneBook.get(k));
		}
		for(Long v:phoneBook.values()) {
			System.out.println(v);
		}
		System.out.println("**********forEach**************");
		phoneBook.forEach((k,v)->System.out.println(k+","+v));
		phoneBook.keySet().forEach(x->System.out.println(x));
		phoneBook.values().forEach(x->System.out.println(x));
		
		System.out.println("&&&&&&&&&&&&&&Iterator&&&&&&&&&&&&&&&&&");
		Iterator itr=phoneBook.keySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		
		
		
		
		
		
	}

}
