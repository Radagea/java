 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radagea
 */
public class Fan {
    public static final int SLOW=1; //final - nevesített konstans
    public static final int MEDIUM=2;
    public static final int FAST=3;
    
    private int speed;
    private double radius;
    private String color;
    private boolean on;

    public Fan() {
        this.speed=Fan.SLOW;
        this.on = false;
        this.color = "blue";
        this.radius = 5;
    }

    public Fan(int speed, double radius, String color, boolean on) {
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.on = on;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    @Override
    public String toString() {
        return "Fan{" + "speed=" + speed + ", radius=" + radius + ", \ncolor=" + color + ", on=" + on + '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Fan)) { // instanceof : A baloldalon lévő objektumról megmondja, hogy a jobboldalon lévő osztályba tartozik- e vagy ammak a leszármazottja-e
           return false;
        }
        Fan tmp =(Fan)obj;
        return this.radius==tmp.getRadius() && this.color.equals(tmp.getColor());
    }
    
    
}
