package org.odyssey.javabrains09.InitializingCollections;

import java.util.List;
import java.util.Map;

public class Triangle {

    private List<Point> lpoints;
    private Map<String, Point> mpoints;



    public  void draw(){

        System.out.println("List:");
        //Used in case of LIST (spring-xml need to be changed)
        for(Point point : lpoints) {
            System.out.println("Point (" + point.getX() + "," + point.getY() + ");");
        }


        System.out.println("\nMap:");
        //Used in case of MAP (spring-xml need to be changed)
        for (Map.Entry<String, Point> entry : mpoints.entrySet()) {
            System.out.println(entry.getKey() + ": (" + entry.getValue().getX() + "," + entry.getValue().getY() + ");");
        }
    }


    public List<Point> getLpoints() {
        return lpoints;
    }

    public void setLpoints(List<Point> lpoints) {
        this.lpoints = lpoints;
    }


    public Map<String, Point> getMpoints() {
        return mpoints;
    }

    public void setMpoints(Map<String, Point> mpoints) {
        this.mpoints = mpoints;
    }
}
