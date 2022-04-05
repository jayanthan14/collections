package com.art.org;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Arraylisteg {
	
	private void arraylist1() {
		List<String> arrayList = new ArrayList<String>();
	    arrayList.add("chennai");
	    arrayList.add("madurai"); 
		arrayList.add("coimbatore");
		arrayList.add("trichy");
		arrayList.add("chennai");
		
		System.out.println(arrayList);
		
		//arrayList.clear();
	//System.out.println(arrayList);

		arrayList.remove(3);
	System.out.println(arrayList);
		
		
	    arrayList.set(2, "salem");
		System.out.println(arrayList);
		
		 
			System.out.println(arrayList.indexOf("chennai"));
			
			System.out.println(arrayList.lastIndexOf("trichy"));
			
			List<String> anotherlist =new ArrayList<String>();
			
			anotherlist.add("delhi");
		    anotherlist.add("madurai"); 
			anotherlist.add("coimbatore");
			anotherlist.add("trichy");
			anotherlist.add("erode");
			 
			anotherlist.addAll(arrayList);
			System.out.println(anotherlist);
			
			
			//Iterator<String> iter = arrayList.iterator();
				//while (iter.hasNext()) {
					//System.out.println(iter.next());
					
				//}
				System.out.println("*******************************");
				
				ListIterator<String> lit = arrayList.listIterator();
				
				while(lit.hasNext()) {
					System.out.println(lit.next());
				}
				System.out.println("*********************************");
				while(lit.hasPrevious()) {
					System.out.println(lit.previous());
				}
				
				
}
	public static void main(String[] args) {
	Arraylisteg arrayList =new Arraylisteg();
	arrayList.arraylist1();
	
	
}
}
