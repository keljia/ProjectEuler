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
public class Problem065_ConvergentsOfE {
    public static void main (String[] args) {
        BigInteger[][] convergents = new BigInteger[101][2];
        convergents[0] = new BigInteger[] {BigInteger.ONE, BigInteger.ZERO};
        convergents[1] = new BigInteger[] {BigInteger.valueOf(2), BigInteger.ONE};
        
        for (int i = 2; i < convergents.length; i++) {
            if (i % 3 == 0) {
                convergents[i][0] = convergents[i - 1][0].multiply(BigInteger.valueOf(i / 3 * 2)).add(convergents[i - 2][0]);
                convergents[i][1] = convergents[i - 1][1].multiply(BigInteger.valueOf(i / 3 * 2)).add(convergents[i - 2][1]);
            } else {
                convergents[i][0] = convergents[i - 1][0].add(convergents[i - 2][0]);
                convergents[i][1] = convergents[i - 1][1].add(convergents[i - 2][1]);
            }
        }
        
        int digitSum = 0;
        for (BigInteger i = convergents[100][0]; i.compareTo(BigInteger.ZERO) > 0; i = i.divide(BigInteger.TEN)) {
            digitSum += i.mod(BigInteger.TEN).intValue();
        }
        
        System.out.println(digitSum);
    }
}
