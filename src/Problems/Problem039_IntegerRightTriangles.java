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
public class Problem039_IntegerRightTriangles {
    public static void main (String[] args) {
        int maxSolutions = 0;
        int perimeter = 0;
        for (int i = 12; i <= 1000; i++) {
            int solutions = 0;
            // j = hypotenuse
            for (int j = i / 3 + 1; j < i / 2; j++) {
                for (int k = (i - j) / 2; k < j; k++) {
                    if ((i - j - k) == Math.sqrt(j * j - k * k)) {
                        solutions++;
                    }
                }
            }
            
            if (solutions > maxSolutions) {
                maxSolutions = solutions;
                perimeter = i;
            }
        }
        
        System.out.println(perimeter + ", " + maxSolutions);
    }
}
