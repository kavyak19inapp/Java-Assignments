package com.inapp.firstjava.util;

import java.util.Scanner;

public class StringExample
{
    public static void main(String args[])
    {   String b="";
        System.out.println("Enter the string to be checked : ");
    	Scanner scanner = new Scanner(System.in);
    	String str = scanner.nextLine();
        int n=str.length();
        System.out.println(n);
        for(int i=n-1;i>=0;i--){
        b=b+str.charAt(i);
        System.out.println(b);}
        if(str.equals(b)){
        	System.out.println("its a palindrome");
        	
        }
        else{
        	System.out.println("its not a palindrome");
        }
    }
    }
