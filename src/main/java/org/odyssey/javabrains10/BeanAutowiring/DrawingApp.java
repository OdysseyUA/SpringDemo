package org.odyssey.javabrains10.BeanAutowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/***
 * using aurowiring on bean level (without annotations)
 */
public class DrawingApp {

	public static void main(String[] args) {

	    //Triangle triangle = new Triangle();
        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("javabrains/spring.xml");
        Triangle triangle = (Triangle)context.getBean("triangle");
        triangle.draw();
	}

}
