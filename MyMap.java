package com.inapp.mapproject.util;

import java.security.KeyStore.Entry;
import java.util.HashMap;

import java.util.Map;

public class MyMap {

	public static void main(String[] args) {
	    HashMap<String, String> map = new HashMap<String, String>();
	    map.put("E", " eagle");
	    map.put("B", " ball");
	    map.put("C", " cat");
	    map.put("A", " apple");
	    map.put("G", " goat");
	    map.put("H", " horse");
	    map.put("D", " dog");
	    map.put("J", " jackal");
	    map.put("F", " fish");
	    map.put("I", " icecream");
	    for (String key : map.values()) {
	           System.out.println(key);
	    }
	   

	    
	}

}
