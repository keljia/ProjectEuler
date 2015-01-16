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
public class Problem050_ConsecutivePrimeSum {
    public static void main (String[] args) {
        ArrayList<Integer> primes = ReusableMethods.sieve((int)Math.pow(10, 6));
        int sum = 0;
        int maxPrimes = 0;
        while (sum < Math.pow(10, 6)) {
            if (Math.pow(10, 6) - sum < primes.get(maxPrimes))
                break;
            sum += primes.get(maxPrimes);
            maxPrimes++;
        }
        
        int mostConsecutivePrimes = 0;
        int maxConsecutiveSum = 0;
        
        for (int i = 2; i < maxPrimes; i++) {
            int primeSum = 0;
            for (int j = 0; j < i; j++) {
                primeSum += primes.get(j);
            }
            
            int j = 0;
            while (primeSum < Math.pow(10, 6)) {
                if (primes.contains(primeSum)) {
                    mostConsecutivePrimes = i;
                    maxConsecutiveSum = primeSum;
                    break;
                }
                
                primeSum += primes.get(i + j) - primes.get(j);
                j++;
            }
        }
        
        System.out.println(mostConsecutivePrimes + ", " + maxConsecutiveSum);
    }
}
