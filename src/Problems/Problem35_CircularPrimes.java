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

public class Problem35_CircularPrimes {
    public static void main (String[] args) {
        ArrayList<Integer> primes = ReusableMethods.sieve(1000000);
        int numberOfCircularPrimes = 0;
        loop1: for (int i : primes) {
            int numberOfDigits = 0;
            for (int j = i; j > 0; j /= 10) {
                numberOfDigits++;
            }
            
            int oldCycle = i;
            for (int j = 0; j < numberOfDigits - 1; j++) {
                int cycle = oldCycle / 10 + (int)Math.pow(10, numberOfDigits - 1) * (oldCycle % 10);
                oldCycle = cycle;
                if (!primes.contains(cycle))
                    continue loop1;
            }
            
            System.out.println(i);
            numberOfCircularPrimes++;
        }
        System.out.println(numberOfCircularPrimes);
    }
}
