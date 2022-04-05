package com.art.org;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {
		
		TreeSet<Integer> tse = new TreeSet<Integer>();
		tse.add(3);
		tse.add(9);
		tse.add(90);
		tse.add(45);
		tse.add(100);
		tse.add(0);
		
		
  
		System.out.println(tse);
		
		
		System.out.println("1st number:" + tse.first());
		System.out.println("Last number:"+ tse.last());
		
		System.out.println(tse.tailSet(90));
		
		System.out.println(tse.subSet(9,100));
		
		System.out.println(tse.comparator());
		
		System.out.println("higher value"+ tse.higher(9));
		System.out.println("lower value"+ tse.lower(3));
		
	    System.out.println("subset from 3 till 90:" + tse.subSet(3, 90));
		
		System.out.println("poll first" + tse.pollFirst());
		System.out.println("poll last" + tse.pollLast());
		
		System.out.println(tse);
		
		Iterator<Integer> itera = tse.iterator();
		while(itera.hasNext()) {
		System.out.println(itera.next());
		}
		
		
		
		
		
		
	}

	
}
