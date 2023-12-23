package models;
import java.lang.reflect.Array;


public class Point {
    private double x;
    private double y;

    public Point(double x, double y){
        this.x=x;
        this.y=y;

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    @Override public String toString(){
        return x + " : " + y;
    }
    public double getDistance(Point dest){
        double subX = dest.getX() - this.x;
        double subY= dest.getY() - this.y;
        return Math.sqrt(Math.pow(subX,2) + Math.pow(subY,2));

    }



}
