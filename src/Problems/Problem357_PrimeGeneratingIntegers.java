/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problems;

import ReusableStuff.ReusableMethods;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Kelly
 */
public class Problem357_PrimeGeneratingIntegers {
    public static void main (String[] args) {
        ArrayList<Integer> primes = ReusableMethods.sieve(100000000);
        HashSet hashPrimes = new HashSet();
        for (int i : primes) {
            hashPrimes.add(i);
        }
        long total = 0;
        outerloop: for (int i : primes) {
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if ((i - 1) % j == 0) {
                    if (!hashPrimes.contains(j + (i - 1) / j))
                        continue outerloop;
                }
            }
            total += i - 1;
        }
        System.out.println(total);
    }
}
