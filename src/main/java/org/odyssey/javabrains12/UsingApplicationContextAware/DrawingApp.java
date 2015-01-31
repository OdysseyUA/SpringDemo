package org.odyssey.javabrains12.UsingApplicationContextAware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
	    
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
		Triangle triangle = (Triangle)context.getBean("triangle");
        triangle.draw();
	}

}
