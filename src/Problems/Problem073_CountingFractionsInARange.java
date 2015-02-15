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
public class Problem073_CountingFractionsInARange {
    public static void main (String[] args) {
        long total = 0;
        for (int i = 4; i <= 12000; i++) {
            for (int j = i / 3 + 1; j <= i / 2; j++) {
                if (gcd (i, j) == 1) {
                    total++;
                }
            }
        }
        System.out.println(total);
    }
    
    public static int gcd (int a, int b) {
        if (a == 1 || b == 1)
            return 1;
        if (a == b)
            return a;
        if (a > b)
            return gcd(a - b, b);
        if (b > a)
            return gcd(a, b - a);
        return -1;
    }
}
