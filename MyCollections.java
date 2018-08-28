package com.inapp.collections.util;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class MyCollections {
	private static final Object A = null;
	private static final Object C = null;
	private static final Object B = null;
	private static final Object D = null;
	private String FruitArr[]={"apple","orange","guava","pomgranate"};
	

	public static void main(String[] args) {
		MyCollections mc=new MyCollections();
		mc.testArrayList1();
		mc.testHashSet();
		mc.testTreeSet();
		mc.testHashMap();
}
	private void testHashMap() {
		Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(2,"orange");  
		  map.put(4,"apple");  
		  map.put(3,"guava");  
		  map.put(1,"pomgranate"); 
		  Set set=map.entrySet();
		  Iterator itr=set.iterator();
		  while(itr.hasNext()){  
		        Map.Entry entry=(Map.Entry)itr.next();  
		        System.out.println(entry.getKey()+" "+entry.getValue());  
		    }  
		
	}
	public void testArrayList1(){
		Collection<String> fruits =new ArrayList<String>();
		for (int i = 0; i < FruitArr.length; i++) {
			fruits.add(FruitArr[i]);}
			System.out.println("AFTER 1 : Size of the list is" +fruits.size());
			System.out.println("AFTER 1 : Fruits list is " +fruits);}
			
		
	
	public void testHashSet(){
		Collection<String> fruits =new HashSet();
		for (int i = 0; i < FruitArr.length; i++) {
			fruits.add(FruitArr[i]);
			System.out.println("AFTER 1 : Size of the list is" +fruits.size());
		    System.out.println("AFTER 1 : Fruits list is " +fruits);}
		}	
	public void testTreeSet(){
		Collection<String> fruits=new TreeSet();
		for (int i = 0; i<FruitArr.length; i++){
			fruits.add(FruitArr[i]);
			System.out.println("AFTER 1 : Size of the list is" +fruits.size());
		    System.out.println("AFTER 1 : Fruits list is " +fruits);};
		    

    	
    }
			
		}

		