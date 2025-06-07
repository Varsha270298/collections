package com.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		//ctrating a string array
   String[] array = {"java","python","c++","PHP"};
   System.out.println("Printing Array:" +Arrays.toString(array));
   
   //converting array to list
   
   List<String> list = new ArrayList<String>();
   for(String lang:array) {
	   list.add(lang);
   }
   System.out.println("Printing List:"+list);
   
	}

}
