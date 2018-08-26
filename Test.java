package com.inapp.myproject.util;

public class Test extends Polygon{

	

	
public Test(double length, double breadth) {
		super(length, breadth);
		// TODO Auto-generated constructor stub
	}
static Polygon p=new Polygon(length, breadth);
	public static void main(String[] args) {
		
		System.out.println(p.CalculateArea());
		System.out.println(p.CalculatePerimeter());
	}
	}