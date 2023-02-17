package com.Selinium1;

import java.util.ArrayList;
import java.util.List;

public class Calling_Url {
	public static void main(String[] args) {
		List<Object>l=new ArrayList<Object>();
		l.add(90);
		l.add("Java");
		
		l.add('i');
		
		System.out.println(l);
		
		 int s=l.size();
		 System.out.println(s);
		 
		  Object g= l.get(3);
		  System.out.println(g);
		  
		  l.set(1, 100);
		  System.out.println(l);
		  
		  l.remove(1);
		  System.out.println(l);
		  
		  
		  
		
		
	}

}
