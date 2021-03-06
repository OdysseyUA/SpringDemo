package org.odyssey.javabrains13.BeanDefinitionInheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
	    
		ApplicationContext context = new ClassPathXmlApplicationContext("javabrains/spring.xml");
        
		Triangle triangle = (Triangle)context.getBean("triangle1");
        triangle.draw();
	}

}
