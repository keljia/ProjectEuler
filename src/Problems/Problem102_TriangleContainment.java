/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problems;

import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Kelly
 */
public class Problem102_TriangleContainment {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("p102_triangles.txt"));
        
        int trianglesContainingOrigin = 0;
        
        while (scan.hasNextLine()) {
            String s = scan.nextLine();
            String[] strCoordinates = s.split(",");
            Point[] coordinates = new Point[3];
            for (int i = 0; i < coordinates.length; i++) {
                coordinates[i] = new Point(Integer.parseInt(strCoordinates[2 * i]), Integer.parseInt(strCoordinates[2 * i + 1]));
            }
            
            if ((coordinates[0].x >= 0 && coordinates[1].x >= 0 && coordinates[2].x >= 0) 
                    || (coordinates[0].y >= 0 && coordinates[1].y >= 0 && coordinates[2].y >= 0)
                    || (coordinates[0].x <= 0 && coordinates[1].x <= 0 && coordinates[2].x <= 0) 
                    || (coordinates[0].y <= 0 && coordinates[1].y <= 0 && coordinates[2].y <= 0))
                continue;
            
            if (containsOrigin(coordinates[0], coordinates[1], coordinates[2]) 
                    && containsOrigin(coordinates[1], coordinates[2], coordinates[0])
                    && containsOrigin(coordinates[0], coordinates[2], coordinates[1])) 
                trianglesContainingOrigin++;
        }
        
        System.out.println(trianglesContainingOrigin);
    }
    
    public static boolean containsOrigin (Point p1, Point p2, Point a) {
        double slope = (double)(p1.y - p2.y) / (p1.x - p2.x);
        double intercept = p1.y - slope * p1.x;
        
        if (intercept > 0) {
            if (a.y < slope * a.x + intercept)
                return true;
        }
        
        if (intercept < 0) {
            if (a.y > slope * a.x + intercept)
                return true;
        }
        
        return false;
    }
}
