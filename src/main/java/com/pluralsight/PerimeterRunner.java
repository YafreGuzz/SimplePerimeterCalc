package com.pluralsight;
import java.awt.*;

public class PerimeterRunner {
    public double getPerimeter(Shape s){

        double totalPerim = 0;
        Point prevPt = s.getLastPoint();

        for(Point currPt : s.getPoints()){
            double currDist = prevPt.distance(currPt);
            totalPerim += currDist;
            prevPt = currPt;
        }
        String formatted = String.format("%.2f", totalPerim);
        return Double.parseDouble(formatted);
    }
}
