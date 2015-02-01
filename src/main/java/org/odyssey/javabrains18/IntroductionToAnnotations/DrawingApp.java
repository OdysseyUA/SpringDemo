package org.odyssey.javabrains18.IntroductionToAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
	    
		ApplicationContext context = new ClassPathXmlApplicationContext("javabrains/spring.xml");
       	Shape shape = (Shape)context.getBean("circle");
       	shape.draw();
        
	}

}
