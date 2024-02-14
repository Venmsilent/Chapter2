package MultiPoints;
import java.sql.SQLOutput;
import java.util.*;

/**
 * class: SixPointTester
 * Author: Ian
 * Description: This code will gather 6 different points and determine the distance between them.
 */
public class SixPointTester {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        shortestDistance(enterPoints());
    }



    public static Point[] enterPoints() {
        Point[] points = new Point[6];
        System.out.print("Enter 6 points of X and Y coordinates: ");

        for (int i = 0; i < points.length; i++){
            points[i] = new Point(input.nextDouble(), input.nextDouble());
        }
        return points;
    }

    public static void  shortestDistance(Point[] points){
        double shortestDistance = Double.MAX_VALUE;
        Point p1 = null;
        Point p2 = null;
        for (int i = 0; i < points.length; i++){
            for(int j = i+1; j < points.length; j++ ){
             double dist =  Point.distance(points[i], points[j]);
             if (dist < shortestDistance){
                 shortestDistance = dist;
                 p1 = points[i];
                 p2 = points[j];
             }
            }
        }
        System.out.printf("The shortest distance of the two points are (%.1f, %.1f) and (%.1f, %.1f) and their distance is(%.2f)"
                ,p1.getX(),p1.getY(), p2.getX(), p2.getY(),shortestDistance);
    }
}
