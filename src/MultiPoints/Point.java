package MultiPoints;
import java.util.*;
public class Point {
    private double x;
    private double y;

    public Point(){

    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public static double distance(Point p1, Point p2){
       return Math.sqrt(Math.pow(p1.x - p2.x, 2) + (Math.pow(p2.y - p1.y, 2)));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
