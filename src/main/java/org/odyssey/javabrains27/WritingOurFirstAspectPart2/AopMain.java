package org.odyssey.javabrains27.WritingOurFirstAspectPart2;

import org.odyssey.javabrains27.WritingOurFirstAspectPart2.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("javabrains/spring.xml");

        ShapeService shapeService = ctx.getBean("shapeService", ShapeService.class);
        System.out.println(shapeService.getCircle().getName());
        System.out.println(shapeService.getTriangle().getName());

    }
}
