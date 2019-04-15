package com.bear;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
	List<String> l = new ArrayList<>();
	l.add("hi");
	l.add("hello");
	l.add("what's up?");
	System.out.println(l);
	
	Set<Integer> s = new HashSet<>();
	s.add(406302262);
	s.add(406570043);
	s.add(406302389);
	s.add(406302262);
	System.out.println(s);
	
	
	Map<String,Integer> m = new HashMap<String, Integer>();
	m.put("milk",2 );
	m.put("cocoa",5);
	System.out.println(m);
	m.clear();
	System.out.println(m);
	
	List<Item> toBuyList = new ArrayList<>();
	
	while(true) {
		System.out.print("Enter 1 to add, enter 2 to print:");
		Scanner scan = new Scanner(System.in);	
		int c = scan.nextInt();
		
		if(c==1) {
			System.out.print("Please enter the product to buy:");
			String product = scan.next();
			System.out.print("Please enter the quantity to buy:");
			int quantity = scan.nextInt();
			toBuyList.add(new Item(product, quantity));
		}
		
		if(c==2) {
			for(Item i:toBuyList) {
				System.out.println(i.product + "\t" + i.quantity);
			}
		}
		
		else if(c!=1 && c!=2) {
			break;
		}
	}
}
}
