package com.list;

import java.util.ArrayList;
import java.util.List;

public class GetAndSetElement {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("banan");
		list.add("mango");
		list.add("Papaya");
		
		System.out.println("Returning element:"+list.get(1));
		list.set(1,"Dates");
		

for(String fruit:list) {
	System.out.println(fruit);
}

	}

}
