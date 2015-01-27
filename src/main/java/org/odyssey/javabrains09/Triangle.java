package org.odyssey.javabrains09;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Triangle {

    private List<Point> points;
    private Map<String, Point> mpoints;



    public  void draw(){

        //Used in case of LIST (spring-xml need to be changed)
        //for(Point point : points) {
        //    System.out.println("Point (" + point.getX() + "," + point.getY() + ");");
        //}

        //Used in case of MAP (spring-xml need to be changed)
        for (Map.Entry<String, Point> entry : mpoints.entrySet()) {
            System.out.println(entry.getKey() + ": (" + entry.getValue().getX() + "," + entry.getValue().getY() + ");");
        }
    }


    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }


    public Map<String, Point> getMpoints() {
        return mpoints;
    }

    public void setMpoints(Map<String, Point> mpoints) {
        this.mpoints = mpoints;
    }
}
