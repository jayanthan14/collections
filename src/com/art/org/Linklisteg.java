package com.art.org;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linklisteg {


	
	private void linklists1() {
		
		LinkedList<String> link = new LinkedList<String>();
		link.add("raman");
		link.add("sekar");
		link.add("kishore");
		link.add("arun");
		link.add("jagdesh");
		
		System.out.println(link);
		
		
		//link.clear();
		//System.out.println(link);
		
		link.set(2,"sasi");
		System.out.println(link);
		
		System.out.println(link.size());
		
		System.out.println(link.get(2));
		
		System.out.println(link.indexOf("sekar"));
		System.out.println(link.lastIndexOf("jagdesh"));
		
		LinkedList<String> link1 = new LinkedList<String>();
		link1.add("ramya");
		link1.add("sethu");
		link1.add("keerthi");
		link1.add("anu");
		link1.add("reka"+" +");
		
		link1.addAll(link);
		System.out.println(link1);
		
		
		System.out.println("#########################");
		
		Iterator<String> itera = link.iterator();
		while(itera.hasNext()) {
		System.out.println(itera.next());
		
		}
		
		System.out.println("###############################");
		
		ListIterator<String> lit = link.listIterator();
		
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println("*********************************");
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}

	}
	
	
	public static void main(String[] args) {
		Linklisteg link = new Linklisteg();
		link.linklists1();
		
	}
	
	

}
