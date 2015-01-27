/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problems;

import ReusableStuff.ReusableMethods;
import java.util.ArrayList;

/**
 *
 * @author Kelly
 */
public class Problem231_PrimeFactorisationOfBinomialCoefficients {
    public static ArrayList<Integer> primes = new ArrayList<Integer>();
    public static void main (String[] args) {
        long startTime = System.currentTimeMillis();
        primes = ReusableMethods.sieve(20000000);
        System.out.println(System.currentTimeMillis() - startTime);
        System.out.println(primeFactorSum(20000000, 15000000));
    }
    
    public static long primeFactorSum (int n, int r) {
        long primeFactorSum = 0;
        for (int p : primes) {
            if (p > n)
                break;
            int power = 1;
            while (Math.pow(p, power) < n) {
                primeFactorSum += p * (n / (int)Math.pow(p, power));
                primeFactorSum -= p * (r / (int)Math.pow(p, power));
                primeFactorSum -= p * ((n - r) / (int)Math.pow(p, power));
                power++;
            }
        }
        
        return primeFactorSum;
    }
}
