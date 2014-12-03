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
public class Problem027_QuadraticPrimes {
    public static ArrayList<Integer> primes = ReusableMethods.sieve(1000000);
    public static void main (String[] args) {
        int maximumPrimes = 0;
        for (int i : primes) {
            if (i > 1000)
                break;
            for (int j : primes) {
                if (j > 2000)
                    break;
                int b = i;
                int a = i - 1 - j;
                int n = 0;
                while (isQuadraticPrime(a, b, n)) {
                    n++;
                }
                
                if (n > maximumPrimes) {
                    maximumPrimes = n;
                    System.out.println("n^2 + " + a + "n + " + b);
                    System.out.println(maximumPrimes);
                }
            }
        }
    }
    
    public static boolean isQuadraticPrime(int a, int b, int n) {
        int result = n * n + a * n + b;
        return (primes.contains(result));
    }
}
