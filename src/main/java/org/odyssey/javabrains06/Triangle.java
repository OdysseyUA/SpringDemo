package org.odyssey.javabrains06;

public class Triangle {

    private String type;
    private int height=0;


    public Triangle(String type) {
        this.type = type;
    }

    public Triangle(int height) {
        this.height = height;
    }

    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public  void draw(){
        System.out.println("Draw " + this.getType() + " triangle with the height of " + height + ".");
    }

    public String getType() {
        return type;
    }

//    public void setType(String type) {
//        this.type = type;
//    }


    public void setHeight(int height) {
        this.height = height;
    }
}
