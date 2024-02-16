package MultiPoints;
import java.util.*;
/**
 * class: NamesPoint
 * date: 2/14/24
 * Author: Ian
 * Description: This code will gather 6 different points and determine the shortest distance
 * and neatly print them.
 */
    public class NamedPoint extends Point {
        private String name;

        public NamedPoint(String name, double x, double y) {
            super(x, y);
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return name + super.toString();
        }

        public static NamedPoint[] enterNamedPoints(Scanner scan) {
            NamedPoint[] points = new NamedPoint[6];
            char label = 'a';
            for (int i = 0; i < points.length; i++) {
                System.out.print("Enter coordinates for point " + (char)(label) + " (x y): ");
                double x = scan.nextDouble();
                double y = scan.nextDouble();
                points[i] = new NamedPoint("Point " + (char)(label), x, y);
                label++;
            }
            return points;
        }


        // Method to print points
        public static void printPoints(Point[] points) {
            for (int i = 0; i < points.length; i++) {
                System.out.println(points[i].toString());
            }
        }
    }

