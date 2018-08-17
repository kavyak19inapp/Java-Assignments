package com.inapp.test.util;


public class CalculatePerimeter {
	public double length;
	public double breadth;
	public double perimeter;
	
	public void calculatePerimeterOfRectangle(double length,double breadth){
		
		/*for(int i=0;i<2;i++){
			perimeter=perimeter+length+breadth;
			System.out.println(perimeter);*/
		/*int i=0;
		while(i<2){
			perimeter=perimeter+length+breadth;
			i++;
			System.out.println(perimeter);*/
		int i=0;
		do{
			perimeter=perimeter+length+breadth;
			i++;}
			while(i<2);
		System.out.println(perimeter);
	}

	public static void main(String[] args) {
		CalculatePerimeter perimeter= new CalculatePerimeter();
		perimeter.calculatePerimeterOfRectangle(3,7);
		}
	}
