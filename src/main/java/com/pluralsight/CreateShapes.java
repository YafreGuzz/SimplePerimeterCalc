package com.pluralsight;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class CreateShapes {
    List<Point> trianglePoints = Arrays.asList(
            new Point(0, 0),
            new Point(0, 10),
            new Point(10, 0)
    );

    List<Point> rectanglePoints = Arrays.asList(
            new Point(0, 0),
            new Point(0, 5),
            new Point(10, 5),
            new Point(10, 0)
    );

    List<Point> pentagonPoints = Arrays.asList(
            new Point(0, 10),
            new Point(9, 3),
            new Point(6, -8),
            new Point(-6, -8),
            new Point(-9, 3)
    );

    List<Point> hexagonPoints = Arrays.asList(
            new Point(10, 0),
            new Point(5, 9),
            new Point(-5, 9),
            new Point(-10, 0),
            new Point(-5, -9),
            new Point(5, -9)
    );

    List<Point> heptagonPoints = Arrays.asList(
            new Point(0, 10),
            new Point(9, 3),
            new Point(6, -8),
            new Point(-6, -8),
            new Point(-9, 3),
            new Point(-7, 8),
            new Point(7, 8)
    );

    List<Point> octagonPoints = Arrays.asList(
            new Point(10, 0),
            new Point(7, 7),
            new Point(0, 10),
            new Point(-7, 7),
            new Point(-10, 0),
            new Point(-7, -7),
            new Point(0, -10),
            new Point(7, -7)
    );

    List<Point> starPoints = Arrays.asList(
            new Point(0, 10),
            new Point(2, 3),
            new Point(9, 3),
            new Point(4, -1),
            new Point(5, -9),
            new Point(0, -4),
            new Point(-5, -9),
            new Point(-4, -1),
            new Point(-9, 3),
            new Point(-2, 3)
    );

    List<Point> diamondPoints = Arrays.asList(
            new Point(0, 10),
            new Point(10, 0),
            new Point(0, -10),
            new Point(-10, 0)
    );
}
