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
public class Problem020_FactorialDigitSum {
    public static void main (String[] args) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= 100; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
        BigInteger digitSum = BigInteger.ZERO;
        
        while (factorial.compareTo(BigInteger.ZERO) == 1) {
            digitSum = digitSum.add(factorial.remainder(BigInteger.TEN));
            factorial = factorial.divide(BigInteger.TEN);
        }
        
        System.out.println(digitSum);
    }
}
