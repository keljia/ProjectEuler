/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problems;

import java.math.BigInteger;

/**
 *
 * @author Kelly
 */
public class Problem026_ReciprocalCycles {
    public static void main (String[] args) {
        int longestRepeatingCycle = 0;
        for (int i = 3; i < 1001; i++) {
            int n = i;
            
            // divide out 5s and 2s
            while (n % 5 == 0) {
                n /= 5;
            }
            while (n % 2 == 0) {
                n /= 2;
            }
            
            BigInteger lotsOfNines = BigInteger.ZERO;
            int numberOfNines = 1;
            while(true) {
                lotsOfNines = lotsOfNines.multiply(BigInteger.TEN).add(BigInteger.valueOf(9));
                if (lotsOfNines.remainder(BigInteger.valueOf((long)n)).equals(BigInteger.ZERO)) {
                    if (numberOfNines > longestRepeatingCycle) {
                        longestRepeatingCycle = numberOfNines;  
                        System.out.println(numberOfNines + "\t" + n);
                    }
                    break;
                }
                numberOfNines++;
            }
        }
        
        System.out.println(longestRepeatingCycle);
    }
}
