package com.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("Apple");
		list1.add("banan");
		list1.add("mango");
		list1.add("Papaya");
		Collections.sort(list1);

for(String fruit:list1) {
	System.out.println(fruit);
}

List<Integer> list2 = new ArrayList<Integer>();
list2.add(1);
list2.add(2);
list2.add(3);
list2.add(4);
Collections.sort(list2);

for(Integer element:list2) {
System.out.println(element);
}
	}

}
