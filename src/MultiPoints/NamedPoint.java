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
            String[] names = {"pA", "pB", "pC", "pD", "pE", "pF"};
            NamedPoint[] points = new NamedPoint[6];
            for (int i = 0; i < points.length; i++) {
                System.out.print("Enter coordinates for point " + (i + 1) + " (x y): ");
                double x = scan.nextDouble();
                double y = scan.nextDouble();
                points[i] = new NamedPoint(String.valueOf(names[i]), x, y);            }

            return points;
        }

        // Method to print points
        public static void printPoints(Point[] points) {
            for (int i = 0; i < points.length; i++) {
                System.out.println(points[i].toString());
            }
        }
    }

