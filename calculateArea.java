package com.inapp.assignment1.util;

import java.lang.Math;

public class calculateArea {
	static final double pi = 3.14;

	public static double calculateAreaOfCirclebyRadius(double radius) {
		double area = pi * radius * radius;
		return area;

	}
	

	public static double calculateAreaOfCirclebyDiameter(double diameter) {
		double radius = diameter / 2;
		return calculateAreaOfCirclebyRadius(radius);
	}
	
	public static double calculateAreaOfRectangle(int breadth, int length) {
		double area = length * breadth;
		return area;

	}
	
	public static double calculateAreaOfSquare(int side) {
		return calculateAreaOfRectangle(side, side);
	}

	public static double calculateAreaOfTriangle(int s1, int s2, int s3) {
		double s = (s1 + s2 + s3) / 2;
		double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
		return area;
	}

	public static void main(String[] args) {
		Perimeter perimeter= new Perimeter();
		perimeter.calculatePerimeterOfCirclebyRadius(5);
		perimeter.calculatePerimeterOfCirclebyDiameter(5);
		perimeter.calculatePerimeterOfRectangle(5,10);
		System.out.println(calculateArea.calculateAreaOfCirclebyRadius(5));
		System.out.println(calculateArea.calculateAreaOfCirclebyDiameter(10));
		System.out.println(calculateArea.calculateAreaOfRectangle(3, 7));
		System.out.println(calculateArea.calculateAreaOfSquare(3));
		System.out.println(calculateArea.calculateAreaOfTriangle(1, 2, 3));
		System.out.println(perimeter.calculatePerimeterOfCirclebyRadius(5));
		System.out.println(perimeter.calculatePerimeterOfCirclebyDiameter(10));
		System.out.println(perimeter.calculatePerimeterOfRectangle(2,4));
		
	}}

class Perimeter{
	static final double pi = 3.14;
	public double calculatePerimeterOfCirclebyRadius(double radius){
    	double Perimeter=2*pi*radius;
    	return Perimeter;
}
	public double calculatePerimeterOfCirclebyDiameter(double diameter){
		double radius=diameter/2;
    	return calculatePerimeterOfCirclebyRadius(radius);  
}  
	public double calculatePerimeterOfRectangle(int length,int breadth){
    	double Perimeter=2*(length+breadth);
    	return Perimeter;
}
}
	
