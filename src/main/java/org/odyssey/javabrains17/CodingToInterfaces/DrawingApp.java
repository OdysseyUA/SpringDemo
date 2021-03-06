package org.odyssey.javabrains17.CodingToInterfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
	    
		ApplicationContext context = new ClassPathXmlApplicationContext("javabrains/spring.xml");
       	Shape shape = (Shape)context.getBean("triangle");
       	shape.draw();

        System.out.println();
        shape = (Shape)context.getBean("circle");
        shape.draw();
        
	}

}
