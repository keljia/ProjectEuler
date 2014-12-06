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
public class Problem100_ArrangedProbability {
    public static void main(String[] args) {
        long previousTotalDiscs = 1;
        
        for (long totalDiscs = 1; totalDiscs < (long)Math.pow(10, 13); totalDiscs++) {
            long blueDiscs = (long)(totalDiscs * Math.sqrt(2) / 2) + 1;
            BigInteger numerator = BigInteger.valueOf(blueDiscs);
            numerator = numerator.multiply(numerator.subtract(BigInteger.ONE));
            
            BigInteger denominator = BigInteger.valueOf(totalDiscs);
            denominator = denominator.multiply(denominator.subtract(BigInteger.ONE));
            
            if (denominator.equals(numerator.multiply(BigInteger.valueOf(2)))) {
                System.out.println("blue discs = " + blueDiscs);
                System.out.println("red discs = " + (totalDiscs - blueDiscs));
                System.out.println("total discs = " + totalDiscs);
                
                double discsRatio = (double) totalDiscs / previousTotalDiscs;
                previousTotalDiscs = totalDiscs;
                System.out.println("discs ratio = " + discsRatio);
                System.out.println();
                
                if (totalDiscs > (long)Math.pow(10, 12))
                    break;
                
                /* the ratio between each two numbers of discs that works is at least the same as
                   the ratio between the last two numbers of discs that worked, so we can disregard
                   all numbers in between. */
                totalDiscs *= discsRatio;
            }
        }
    }
}
