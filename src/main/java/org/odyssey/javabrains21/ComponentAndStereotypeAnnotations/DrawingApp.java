package org.odyssey.javabrains21.ComponentAndStereotypeAnnotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		
	    
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("javabrains/spring.xml");
        context.registerShutdownHook();
       	Shape shape = (Shape)context.getBean("circle");
       	shape.draw();


        context.close();
	}

}
