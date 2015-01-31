package org.odyssey.javabrains05.ApplicationContextAndPropertyInitialization;

public class Triangle {

    private String type;

	public  void draw(){
        System.out.println("Draw " + this.getType() + " triangle.");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
