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
public class Problem075_SingularIntegerRightTriangles_unfinished {
    public static void main (String[] args) {
        long startTime = System.currentTimeMillis();
        int count = 0;
        outerloop: for (int i = 12; i <= 10000; i += 2) {
            if (i % 1000 == 0) {
                System.out.println(i);
                System.out.println(count);
            }
            
            boolean hasSolution = false;
            // j = hypotenuse
            innerloop: for (int j = i / 3 + 1; j < i / 2; j++) {
                for (int k = (int)(j * Math.sqrt(0.5) + 0.5); k < j; k++) {
                    if ((i - j - k) == Math.sqrt(j * j - k * k)) {
                        if (hasSolution)
                            continue outerloop;
                        hasSolution = true;
                        continue innerloop;
                    }
                }
            }
            
            if (hasSolution)
                count++;
        }
        
        System.out.println(count);
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
