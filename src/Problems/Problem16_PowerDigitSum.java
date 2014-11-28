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
public class Problem16_PowerDigitSum {
    public static void main (String[] args) {
        BigInteger hugeNumber = new BigInteger("2").pow(1000);
        System.out.println(hugeNumber);
        BigInteger digitSum = BigInteger.ZERO;
        
        while (hugeNumber.compareTo(BigInteger.ZERO) == 1) {
            digitSum = digitSum.add(hugeNumber.remainder(BigInteger.TEN));
            hugeNumber = hugeNumber.divide(BigInteger.TEN);
        }
        
        System.out.println(digitSum);
    }
}
