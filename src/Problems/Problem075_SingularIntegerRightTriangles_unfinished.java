/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problems;

import java.util.ArrayList;

/**
 *
 * @author Kelly
 */
public class Problem075_SingularIntegerRightTriangles_unfinished {
    public static void main (String[] args) {
        long startTime = System.currentTimeMillis();
        int count = 0;
        double sqrthalf = Math.sqrt(0.5);
        double minHypotenuse = Math.sqrt(2) / (Math.sqrt(2) + 2);
        
        // numbers with >1 integer right triangle
        ArrayList<Integer> moreSolutions = new ArrayList<>();
        ArrayList<Integer> singularIntegerRightTriangles = new ArrayList<>();
        
        outerloop: for (int i = 12; i <= 10000; i += 2) {
            if (i % 1000 == 0) {
                System.out.println(i);
                System.out.println(count);
            }
            
            for (int n : moreSolutions) {
                if (i % n == 0)
                    continue outerloop;
            }
            
            boolean hasSolution = false;
            
            // j = hypotenuse
            innerloop: for (int j = (int)(i * minHypotenuse); j < i / 2; j++) {
                for (int k = (int)(j * sqrthalf + 0.5); k < j; k++) {
                    if ((i - j - k) * (i - j - k) > (j * j - k * k))
                        break;
                    if ((i - j - k) * (i - j - k) == (j * j - k * k)) {
                        if (hasSolution) {
                            moreSolutions.add(i);
                            continue outerloop;
                        }
                        hasSolution = true;
                        continue innerloop;
                    }
                }
            }
            
            if (hasSolution) {
                count++;
                singularIntegerRightTriangles.add(i);
            }
        }
        
        System.out.println(count);
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
