package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
       List<String> fruitList = new ArrayList<>();
       fruitList.add("Apple");
       
       fruitList.add("Banana");

       fruitList.add("Pineapple");
       fruitList.add("Papaya");
       
       //convert arrayList to array
       
       String[]array = fruitList.toArray(new String[fruitList.size()]);
       System.out.println("Printing Array:"+Arrays.toString(array));
       System.out.println("Printing List:"+fruitList);


       		

       
	}

}
