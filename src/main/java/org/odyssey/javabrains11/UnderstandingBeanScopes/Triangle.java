package org.odyssey.javabrains11.UnderstandingBeanScopes;

public class Triangle {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;

	

	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	
	public Triangle(Point x, Point y, Point z) {
		this.pointA = x;
		this.pointB = y;
		this.pointC = z;
	}
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public  void draw(){
		
		System.out.println("Point A = (" + getPointA().getX() + ", " + getPointA().getY() + ")");
		System.out.println("Point B = (" + getPointB().getX() + ", " + getPointB().getY() + ")");
		System.out.println("Point C = (" + getPointC().getX() + ", " + getPointC().getY() + ")");
		
    }

	
}
