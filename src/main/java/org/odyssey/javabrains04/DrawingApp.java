package org.odyssey.javabrains04;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {

	    //Triangle triangle = new Triangle();
        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("src\\main\\resources\\javabrains\\spring.xml"));
		//ApplicationContext context = new ClassPathXmlApplicationContext("src\\main\\resources\\javabrains\\spring.xml");
        Triangle triangle = (Triangle)factory.getBean("triangle");
        triangle.draw();
	}

}
