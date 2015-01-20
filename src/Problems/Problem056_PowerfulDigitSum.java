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
public class Problem056_PowerfulDigitSum {
    public static void main (String[] args) {
        int maxDigitSum = 0;
        // i ^ j
        for (BigInteger i = BigInteger.ONE; i.compareTo(BigInteger.valueOf(100)) < 0; i = i.add(BigInteger.ONE)) {
            BigInteger power = BigInteger.ONE;
            for (int j = 1; j < 100; j++) {
                power = power.multiply(i);
                int digitSum = 0;
                for (BigInteger k = power; k.compareTo(BigInteger.ZERO) > 0; k = k.divide(BigInteger.TEN)) {
                    digitSum += k.mod(BigInteger.TEN).intValue();
                }
                if (digitSum > maxDigitSum) {
                    maxDigitSum = digitSum;
                }
            }
        }
        
        System.out.println(maxDigitSum);
    }
}
