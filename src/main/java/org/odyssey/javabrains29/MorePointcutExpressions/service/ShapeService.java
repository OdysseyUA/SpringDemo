package org.odyssey.javabrains29.MorePointcutExpressions.service;

import org.odyssey.javabrains29.MorePointcutExpressions.model.Circle;
import org.odyssey.javabrains29.MorePointcutExpressions.model.Triangle;

public class ShapeService {

    private Circle circle;
    private Triangle triangle;


    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Triangle getTriangle() {
        return triangle;
    }

    public void setTriangle(Triangle triangle) {
        this.triangle = triangle;
    }
}
