package org.odyssey.javabrains13.BeanDefinitionInheritance;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements ApplicationContextAware, BeanNameAware {
	
	private List<Point> lpoints;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context = null;

	

	public Triangle() {
		// TODO Auto-generated constructor stub
	}
	
//	public Triangle(Point x, Point y, Point z) {
//		this.pointA = x;
//		this.pointB = y;
//		this.pointC = z;
//	}
//
	
	public List<Point> getLpoints() {
		return lpoints;
	}

	public void setLpoints(List<Point> lpoints) {
		this.lpoints = lpoints;
	}
	
		
//	public Point getPointA() {
//		return pointA;
//	}
//
//	public void setPointA(Point pointA) {
//		this.pointA = pointA;
//	}

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
		
//		System.out.println("Point A = (" + getPointA().getX() + ", " + getPointA().getY() + ")");
		for(Point p : lpoints)
			System.out.println("Point A = (" +p.getX() + ", " +p.getY() + ")");
		System.out.println("Point B = (" + getPointB().getX() + ", " + getPointB().getY() + ")");
		System.out.println("Point C = (" + getPointC().getX() + ", " + getPointC().getY() + ")");
		
    }

	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		this.context = context;		
	}

	public void setBeanName(String beanName) {
		System.out.println("Bean name is: " + beanName);
		
	}

	
}
