package MultiPoints;
import java.util.*;
/**
 * class: NamesPoint
 * date: 2/14/24
 * Author: Ian
 * Description: This code will gather 6 different points and determine the shortest distance
 * and neatly print them.
 */
public class NamedPoint extends Point{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter p1 values: ");
        Point pA = new Point(scan.nextDouble(), scan.nextDouble());
        System.out.println("Enter p2 values: ");
        Point pB = new Point(scan.nextDouble(), scan.nextDouble());
        System.out.println("Enter p1 values: ");
        Point pC = new Point(scan.nextDouble(), scan.nextDouble());
        System.out.println("Enter p2 values: ");
        Point pD = new Point(scan.nextDouble(), scan.nextDouble());
        System.out.println("Enter p1 values: ");
        Point pE = new Point(scan.nextDouble(), scan.nextDouble());
        System.out.println("Enter p2 values: ");
        Point pF = new Point(scan.nextDouble(), scan.nextDouble());

        System.out.println("pA: " + pA.toString());
        System.out.println("pB: " + pB.toString());
        System.out.println("pC: " + pC.toString());
        System.out.println("pD: " + pD.toString());
        System.out.println("pE: " + pE.toString());
        System.out.println("pF: " + pF.toString());

        Point[] points = {pA, pB, pC, pD, pE, pF};


        SixPointTester sixPointTester = new SixPointTester();
            sixPointTester.shortestDistance(points);









    }
}
