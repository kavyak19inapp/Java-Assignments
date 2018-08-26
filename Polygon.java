package com.inapp.myproject.util;

public class Polygon implements MyInterface {
	 protected static double length=9;
	 protected static double breadth=8;
	 protected static double area;
	 protected static double perimeter;
	 public Polygon( double[] sides) {
		super();
		this.sides = sides;
	}
	 public Polygon(double length, double breadth){
		 super();
			this.length = length;
			this.breadth = breadth; 
	 }

	protected double[] sides={1,2,3,4,5,6};

	@Override
	public  double CalculateArea() {
		area=length*breadth;
		return area;
		
	}

	@Override
	public double CalculatePerimeter() {
			double perimeter = 0;
			if(sides != null && sides.length >0){
				for (int i = 0; i < sides.length; i++) {
					perimeter = perimeter + sides[i];
				}
			}
			return perimeter;
		}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	public double getArea() {
		return area;
	}


	public double getCalculateArea() {
		return CalculateArea();
	}

	public double[] getSides() {
		return sides;
	}

	public void setSides(double[] sides) {
		this.sides = sides;
	}

	public double getCalculatePerimeter() {
		return CalculatePerimeter();
	}

		
		
	}

