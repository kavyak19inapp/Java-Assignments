package com.inapp.assignment2.util;


public class AccessModifiers {
    public double length;
    public double breadth;
    public double area;
    public double perimeter;
    						
	public  double calculateAreaOfRectangle(int breadth, int length) {
		double area = length * breadth;
		return area;
		}}
	
class Perimeter extends AccessModifiers{
		public double calculatePerimeterOfRectangle(int length,int breadth){
	    	double Perimeter=2*(length+breadth);
	    	return Perimeter;
	}
	
	
public static void main(String[] args) {
	Perimeter perimeter= new Perimeter();
	System.out.println(perimeter.calculateAreaOfRectangle(3, 7));
	System.out.println(perimeter.calculatePerimeterOfRectangle(3, 7));

}
}