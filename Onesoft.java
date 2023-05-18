package com.onesoft.collections2;

import java.util.HashMap;
import java.util.Iterator;

public class Onesoft {

	public static void main(String[] args) {
		HashMap <Integer,String>Onesoft=new HashMap<>();
		Onesoft.put(549,"mahes");
		Onesoft.put(328,"ravi");
		Onesoft.put(568,"anu");
		Onesoft.put(465,"banu");
		Onesoft.put(237,"nani");
	//	System.out.println(phoneBook.get(231));
	//	System.out.println(phoneBook.keySet());
	//	System.out.println(phoneBook.values());
		for(Integer k:Onesoft.keySet()) {                         //enhance for loop
			System.out.println(k);
			System.out.println(Onesoft.get(k));
		}
		for(String v:Onesoft.values()) {
			System.out.println(v);
		}
		System.out.println("**********forEach**************");
		Onesoft.forEach((k,v)->System.out.println(k+","+v));
		Onesoft.keySet().forEach(x->System.out.println(x));
		System.out.println(" \n &&&&&&&&&&&&&&Iterator&&&&&&&&&&&&&&&&&\n");
		Iterator itr=Onesoft.keySet().iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
		}
	}

		
		
		
		
		
		
		
	

}



