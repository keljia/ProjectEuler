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
public class Problem9_PythagoreanTriplet1000 {
    public static void main (String[] args) {
        outerloop: for (int c = 414; c < 500; c++) {
            for (int a = 1; a <= (1000 - c)/2; a++) {
                int b = 1000 - a - c;
                if (a * a + b * b == c * c) {
                    System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", abc = " + a * b * c);
                    break outerloop;
                }
            }
        }
    }
}
