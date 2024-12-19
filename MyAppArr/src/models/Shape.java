package models;

import java.util.ArrayList;
import java.util.List;

public class Shape {

    private List<Point> points = new ArrayList<>();

    public void addPoint(Point p) {
        points.add(p);
    }

    public double calculatePerimeter() {
        double perimeter = 0;

        for (int i = 0; i < points.size(); i++) {
            Point point = points.get(i);
            Point nextPoint = points.get((i + 1) % points.size());
            perimeter += point.distance(nextPoint);
        }

        return perimeter;
    }

    public double getAverageSide() {
        return calculatePerimeter() / points.size();
    }

    public double getLongestSide() {
        double longest = 0;

        for (int i = 0; i < points.size(); i++) {
            Point point = points.get(i);
            Point nextPoint = points.get((i + 1) % points.size());

            double distance = point.distance(nextPoint);
            if (distance > longest) {
                longest = distance;
            }
        }

        return longest;
    }

}

    // calculatePerimeter()

    // getAverageSide()

    // getLongestSide()

