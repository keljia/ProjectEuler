/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problems;

/**
 *
 * @author Kelly
 */
public class Problem85_CountingRectangles {
    public static void main (String[] args) {
        int closestValue = 0;
        int side1 = 0;
        int side2 = 0;
        for (int i = 1; i < 708000; i++) {
            for (int j = 1; j < 708000; j++) {
                long numberOfRectangles = pick2(i) * pick2(j);
                if (Math.abs(2000000 - numberOfRectangles) < Math.abs(2000000 - closestValue)) {
                    closestValue = (int)numberOfRectangles;
                    side1 = i;
                    side2 = j;
                    System.out.println("side1 = " + side1);
                    System.out.println("side2 = " + side2);
                    System.out.println("numberOfRectangles = " + numberOfRectangles);
                }
            }
        }
    }
    
    public static long pick2 (int n) {
        return n * (n - 1) / 2;
    }
}
