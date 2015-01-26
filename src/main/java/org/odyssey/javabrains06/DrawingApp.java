package org.odyssey.javabrains06;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * CONSTRUCTOR DI
 */
public class DrawingApp {

	public static void main(String[] args) {

        //BeanFactory context = new XmlBeanFactory(new FileSystemResource("src\\main\\resources\\javabrains\\spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("org/odyssey/javabrains06/spring.xml");
        Triangle triangle = (Triangle)context.getBean("triangle");
        triangle.draw();
	}

}
