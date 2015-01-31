package org.odyssey.javabrains09.InitializingCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Collection (List) initialization.
 * Collection (MAP) case implemented (and initialized in bean).
 */
public class DrawingApp {

	public static void main(String[] args) {

        //BeanFactory context = new XmlBeanFactory(new FileSystemResource("src\\main\\resources\\javabrains\\spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("javabrains/spring.xml");
        Triangle triangle = (Triangle)context.getBean("triangle");
        triangle.draw();
	}

}
