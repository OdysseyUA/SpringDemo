package org.odyssey.javabrains22.UsingMsgSrcToGetTxtFromPropFiles;

import org.odyssey.javabrains22.UsingMsgSrcToGetTxtFromPropFiles.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {


    /**
     * @param args
     */
	public static void main(String[] args) {
		
	    
		ApplicationContext context = new ClassPathXmlApplicationContext("javabrains/spring.xml");
       	Shape shape = (Shape)context.getBean("circle");
       	shape.draw();

//        System.out.println(context.getMessage("greeting", null, "Default Greeting", null));

	}

}
