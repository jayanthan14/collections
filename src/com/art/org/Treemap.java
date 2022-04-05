package com.art.org;

import java.util.HashMap;
import java.util.TreeMap;

public class Treemap {
	
	public static void main(String[] args) {
		
		TreeMap<Integer,String> num = new TreeMap<Integer,String>();
		num.put(70, "paru");
		num.put(10, "raj");
		num.put(50, "eniyan");
		num.put(30, "rahul");
		num.put(10, "mani");
		
		System.out.println(num);
		
		System.out.println("*********************************");
		
		
 TreeMap<Integer,String> num1 = new TreeMap<Integer,String>();
		
		 	num1.put(3, "hok");
			num1.put(2, "lipt");
			num1.put(5, "ishi");
			num1.put(4, "anu");
			
	 
	        num1.putAll(num);
	        System.out.println(num1);
	       
		
		  System.out.println(num.containsKey(10));
	        System.out.println(num.containsValue("paru"));
	        
	        System.out.println(num.clone());
	        
	        System.out.println(num.isEmpty());
	        
	        System.out.println(num.keySet());
	        System.out.println(num.values());
	        
	        System.out.println(num.get(50));
	        
	        System.out.println(num.entrySet());
	        
	        
		
		
		
	}

}
