package com.pluralsight;

import java.awt.*;
import java.util.List;

public class Shape {
    private double length;
    private double width;
    private double area;
    private double perimeter;
    private List<Point> points;
    private Point lastPoint;

    public Shape(List<Point> points) {
        this.points = points;
    }

    public Point getLastPoint() {
        return this.points.get(points.size() - 1);
    }

    public List<Point> getPoints() {
        return points;
    }
}
