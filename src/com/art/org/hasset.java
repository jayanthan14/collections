package com.art.org;

import java.util.HashSet;
import java.util.Iterator;

public class hasset {
	
	
	public static void main(String[] args) {
		HashSet<Integer> hashset1 =new HashSet<Integer>();
		hashset1.add(3);
		hashset1.add(1);
		hashset1.add(10);
		hashset1.add(6);
		hashset1.add(10);
		hashset1.add(70);
		hashset1.add(null);
		 
		System.out.println(hashset1);
		//hashset1.remove("1");
		//System.out.println(hashset1);
		
		Iterator<Integer> iterat = hashset1.iterator();
			while(iterat.hasNext()) {
				System.out.println(iterat.next());
			}
			
			HashSet<Integer> hash1 = new HashSet<Integer>();
					hash1.add(70);
					System.out.println("hash code:" + hash1 );
					
				System.out.println(hashset1.clone());
				System.out.println(hashset1.contains(10));
				System.out.println(hashset1.isEmpty());
				System.out.println(hashset1.size());
				System.out.println(hashset1.containsAll(hash1));
				
					
					
					
	}
	
	

}
