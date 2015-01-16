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
public class Problem071_OrderedFractions {
    public static void main (String[] args) {
        // we only need to consider the fraction (for each denominator) that's closest to 3/7
        double closestToThreeSevenths = 0.0;
        int closestNumerator = 0;
        for (int i = 1; i <= 1000000; i++) {
            if (i % 7 == 0)
                continue;
            int numerator = i * 3 / 7;
            double fraction = (double)numerator / i;
            if (fraction > closestToThreeSevenths) {
                closestToThreeSevenths = fraction;
                closestNumerator = numerator;
            }
        }
        
        System.out.println(closestNumerator);
    }
}
