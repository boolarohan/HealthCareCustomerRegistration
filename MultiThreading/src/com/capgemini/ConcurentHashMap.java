package com.capgemini;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurentHashMap {

	public static void main(String[] args) {
		ConcurentHashMap obj = new ConcurentHashMap();
		ConcurrentHashMap<Integer,String> map = obj.getMap();
	     String str = map.search(1000, (key,value)->value.startsWith("A")?"Present":"Not Present");
      System.out.println(str);
	}
    
	public ConcurrentHashMap<Integer,String>getMap(){
		ConcurrentHashMap<Integer,String> cmap = new ConcurrentHashMap<Integer,String>();
		cmap.put(1, "Adam");
		cmap.put(2, "Smith");
		cmap.put(3, "Tom");
		cmap.put(4, "King");
		cmap.put(5, "Ravi");
		return cmap;
				
	}
}
