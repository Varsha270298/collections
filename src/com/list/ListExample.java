package com.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
       
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("banan");
		list.add("mango");
		list.add("Papaya");

for(String fruit:list) {
	System.out.println(fruit);
}

	
		
	}

}
