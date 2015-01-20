package org.odyssey.javabrains17.CodingToInterfaces;

public class Circle implements Shape {

	private Point center;	
	
	public void draw() {
		System.out.println("Drawing Circle");
		System.out.println("Circle: Point is (" + center.getX() + ", " + center.getY() + ")");
		
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

}
