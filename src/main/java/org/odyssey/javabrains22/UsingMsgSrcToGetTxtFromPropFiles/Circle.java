package org.odyssey.javabrains22.UsingMsgSrcToGetTxtFromPropFiles;

import org.odyssey.javabrains22.UsingMsgSrcToGetTxtFromPropFiles.Point;
import org.odyssey.javabrains22.UsingMsgSrcToGetTxtFromPropFiles.Shape;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

//@Service / @Repository / @Controller
@Component
public class Circle implements Shape {

	private Point center;

    @Autowired
    private MessageSource messageSource;


	public void draw() {
		System.out.println(this.messageSource.getMessage("drawing.circle", null, "Default Drawing Message", null));
        System.out.println(this.messageSource.getMessage("drawing.point", new Object[] {center.getX(), center.getY()}, "Default Drawing Message", null));
//		System.out.println("Circle: Point is (" + center.getX() + ", " + center.getY() + ")");

//        System.out.println(messageSource.getMessage("greeting", null, "Default Greeting", null));

	}

	public Point getCenter() {
		return center;
	}


    @Resource
	public void setCenter(Point center) {
		this.center = center;
	}


    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @PostConstruct
    public void initializeCircle() {
        System.out.println("Init of Circle.");
    }

    @PreDestroy
    public void destroyCircle() {
        System.out.println("Destroy of Circle.");
    }
}
