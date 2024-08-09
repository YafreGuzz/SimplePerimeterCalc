package com.pluralsight;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInterface {

    public static void userScreen() {
        CreateShapes createdShapes = new CreateShapes();
        PerimeterRunner perimeterRunner = new PerimeterRunner();
        Scanner scanner = new Scanner(System.in);

        Map<Integer, List<Point>> shapeMap = new HashMap<>();
        shapeMap.put(1, createdShapes.trianglePoints);
        shapeMap.put(2, createdShapes.rectanglePoints);
        shapeMap.put(3, createdShapes.pentagonPoints);
        shapeMap.put(4, createdShapes.hexagonPoints);
        shapeMap.put(5, createdShapes.heptagonPoints);
        shapeMap.put(6, createdShapes.octagonPoints);
        shapeMap.put(7, createdShapes.starPoints);
        shapeMap.put(8, createdShapes.diamondPoints);

        try {
            boolean keepGoing = true;

            while (keepGoing) {
                System.out.println("""
                        
                        
                        For which shape would you 
                        like to know the perimeter: 
                        ____________________________
                                
                        [1] Triangle 
                        [2] Rectangle 
                        [3] Pentagon 
                        [4] Hexagon 
                        [5] Heptagon 
                        [6] Octagon 
                        [7] Star
                        [8] Diamond
                        [9] Create My Own shape
                        [0] Exit
                                
                        Choice: """);

                int choice = scanner.nextInt();

                if (choice == 0) {
                    keepGoing = false;
                }
                else if (choice == 9) {
                    List<Point> customPoints = getCustomPoints(scanner);
                    Shape customShape = new Shape(customPoints);
                    System.out.println("Perimeter of Custom Shape: " + perimeterRunner.getPerimeter(customShape));
                }else if (shapeMap.containsKey(choice)) {
                    Shape shape = new Shape(shapeMap.get(choice));
                    System.out.println("Perimeter of " + getShapeName(choice) + ": " + perimeterRunner.getPerimeter(shape));
                } else {
                    System.out.println("Invalid choice. Please select a valid option.");
                }
            }
        } finally {
            scanner.close();
        }
    }

    private static List<Point> getCustomPoints(Scanner scanner) {
        List<Point> points = new ArrayList<>();
        Pattern pattern = Pattern.compile("\\((-?\\d+),\\s*(-?\\d+)\\)"); // (x,y) or (-x,-y)

        System.out.println("Enter the number of points for the custom shape:");
        int numPoints = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numPoints; i++) {
            System.out.println("Enter coordinates for point " + (i + 1) + " (format: (x, y)):");
            String input = scanner.nextLine();

            Matcher matcher = pattern.matcher(input);
            System.out.println("Input: " + input);
            if (matcher.matches()) {
                int x = Integer.parseInt(matcher.group(1));
                int y = Integer.parseInt(matcher.group(2));
                points.add(new Point(x, y));
            } else {
                System.out.println("Invalid format. Please enter coordinates in the format (x, y).");
                i--;
            }
        }

        return points;
    }

    private static String getShapeName(int choice) {
        switch (choice) {
            case 1: return "Triangle";
            case 2: return "Rectangle";
            case 3: return "Pentagon";
            case 4: return "Hexagon";
            case 5: return "Heptagon";
            case 6: return "Octagon";
            case 7: return "Star";
            case 8: return "Diamond";
            default: return "Unknown Shape";
        }
    }
}
