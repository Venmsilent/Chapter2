package MultiPoints;

import java.util.Scanner;

public class NamePointTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NamedPoint[] points = NamedPoint.enterNamedPoints(scan);

        System.out.println();
        NamedPoint.printPoints(points);

        System.out.println();
        SixPointTester.shortestDistance(points);
    }
}



