package com.art.org;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhash {
	
		

	
	
	
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhashset1 =new LinkedHashSet<Integer>();
		lhashset1.add(90);
		lhashset1.add(30);
		lhashset1.add(10);
		lhashset1.add(26);
		lhashset1.add(8);
		lhashset1.add(45);
		lhashset1.add(null);
		 
		System.out.println(lhashset1);
		//hashset1.remove("1");
		//System.out.println(hashset1);
		
		Iterator<Integer> iterat = lhashset1.iterator();
			while(iterat.hasNext()) {
				System.out.println(iterat.next());
			}
			
			HashSet<Integer> hash1 = new HashSet<Integer>();
					hash1.add(70);
					System.out.println("hash code:" + hash1 );
					
				System.out.println(lhashset1.clone());
				System.out.println(lhashset1.contains(26));
				System.out.println(lhashset1.isEmpty());
				System.out.println(lhashset1.size());
				System.out.println(lhashset1.containsAll(hash1));
	
	
	
	
	
	
	
	
	
}
	
	
	
	

}

