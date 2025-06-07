package com.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorInterface {

	public static void main(String[] args) {
   List<String> al = new ArrayList<>();
    al.add("kumar");
    al.add("jivan");
    al.add("Prem");
    al.add(1,"Madhuri");
    
    ListIterator<String> itr =al.listIterator();
    System.out.println("Traversing element in forward direction");
    while(itr.hasNext()){
    	System.out.println("index:"+itr.nextIndex()+"value:"+itr.next());
    	
    }
    System.out.println("Traversing element in backword direction");
    while(itr.hasPrevious()){
    	System.out.println("index:"+itr.previousIndex()+"value:"+itr.previous());
    	
    }
    		
   
	}

}
