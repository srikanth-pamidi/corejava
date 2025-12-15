package net.konic.corejava.LocalAndInstanceVariablesMethods;

public class AreaofRectangle {

	/*
	 * 9 AreaofRectangle
	 * 
	 * Instance variables: length, width
	 * 
	 * Method setDimensions(int l, int w)
	 * 
	 * Method getArea() → returns area
	 * 
	 * Print result from main.
	 */

	double length;
	double width;

	public void setDimensions(int l, int w) {
		length = l;
		width = w;

	}

	public double getArea() {
		return length * width;

	}

	public static void main(String[] args) {
		AreaofRectangle obj = new AreaofRectangle();
		obj.setDimensions(20, 30);
		obj.getArea();
		double area = obj.getArea();
		System.out.println("Area Length is " + area);
	}

}
