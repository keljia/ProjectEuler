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
public class Problem498_RemainderOfPolynomialDivision_unfinished {
    static int[] multiplicativeInverses = new int[999999937];
    
    public static void main (String[] args) {
        long startTime = System.currentTimeMillis();
        getMultiplicativeInverses(multiplicativeInverses);
        System.out.println(System.currentTimeMillis() - startTime);
        
        // System.out.println(remainder((long)Math.pow(10, 13), (long)Math.pow(10, 12), (long)Math.pow(10, 4)));
        // System.out.println(remainder(100, 10, 4));
    }
    
    public static void getMultiplicativeInverses(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] == 0) {
                for (int j = i; j < a.length; j++) {
                    if (((long) i * j) % a.length == 1) {
                        a[i] = j;
                        a[j] = i;
                        break;
                    }
                }
            }
        }
    }
    
    public static long remainder(long n, long m, long d) {
        long sum = 0;
        BigInteger partialSum = combo(n, d);
        BigInteger bigPrime = BigInteger.valueOf(999999937);
        
        for (long i = d; i < m; i++) {
            if (i % 10000000 == 0) {
                System.out.println(i);
            }
            
            long longPartialSum = partialSum.longValue();
            if (i % 2 == 0)
                sum += longPartialSum;
            else
                sum -= longPartialSum;
            sum %= 999999937;
            
            partialSum = partialSum.multiply(BigInteger.valueOf(n - i)).mod(bigPrime);
            
            BigInteger divider = BigInteger.valueOf(i - d + 1);
            BigInteger multiplier = BigInteger.ZERO;
            if (i - d + 1 < 999999937)
                multiplier = partialSum.mod(divider).multiply(bigPrime.mod(divider));
            else
                multiplier = divider.mod(bigPrime);
            partialSum = partialSum.add(multiplier.multiply(bigPrime));
        
            partialSum = partialSum.divide(divider);
            partialSum = partialSum.mod(bigPrime);
        }
        
        return sum;
    }
    
    public static BigInteger combo(long n, long r) {
        if (r > n / 2)
            r = (n - r);
        
        BigInteger combo = BigInteger.ONE;
        for (int i = 0; i < r; i++) {
            combo = combo.multiply(BigInteger.valueOf(n - i)).divide(BigInteger.valueOf(i + 1));
        }
        return combo;
        
        /*combo = combo.mod(BigInteger.valueOf(999999937));
        
        return combo.longValue();*/
    }
}
