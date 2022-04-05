package com.art.org;

import java.util.HashMap;

public class Hashmap {
	
	public static void main(String[] args) {
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(10, "ashok");
		hm.put(20, "dilip");
		hm.put(30, "rishi");
		hm.put(40, "banu");
		 System.out.println(hm);
		 
		 
		
 HashMap<Integer,String> copy = new HashMap<Integer,String>();
		
		 	copy.put(3, "hok");
			copy.put(2, "lipt");
			copy.put(5, "ishi");
			copy.put(4, "anu");
			
	 
	        copy.putAll(hm);
	        System.out.println(copy);
	        
	       // hm.clear();
	        //System.out.println(hm);
	        
	        
	        System.out.println(hm.containsKey(30));
	        System.out.println(copy.containsValue("anu"));
	        
	        System.out.println(hm.clone());
	        
	        System.out.println(hm.isEmpty());
	        
	        System.out.println(hm.keySet());
	        System.out.println(hm.values());
	        
	        System.out.println(hm.get(20));
	        
	        System.out.println(hm.entrySet());
	        
	        
	        
	        
	        
		
		
		
		
		
		
		
		
		
		
	}

}
