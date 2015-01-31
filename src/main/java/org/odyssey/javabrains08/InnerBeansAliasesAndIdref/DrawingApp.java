package org.odyssey.javabrains08.InnerBeansAliasesAndIdref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Separated/inner bean injection
 * alias-tag using.
 * name-attribute using.
 */
public class DrawingApp {

	public static void main(String[] args) {

        //BeanFactory context = new XmlBeanFactory(new FileSystemResource("src\\main\\resources\\javabrains\\spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("javabrains/spring.xml");
        Triangle triangle = (Triangle)context.getBean("triangle-alias");
        //Triangle triangle = (Triangle)context.getBean("triangle-name");
        triangle.draw();
	}

}
