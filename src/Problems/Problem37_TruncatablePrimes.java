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

public class Problem37_TruncatablePrimes {
    public static void main (String[] args) {
        ArrayList<Integer> primes = ReusableMethods.sieve(1000000);
        int sumOfTruncatablePrimes = 0;
        loop1: for (Integer i : primes) {
            if (i < 10) {
                continue;
            }
            int n = 6;
            for (int j = i; j > 0; j %= (Math.pow(10, n))) {
                if (!primes.contains(j))
                    continue loop1;
                n--;
            }
            for (int j = i; j > 0; j /= 10) {
                if (!primes.contains(j))
                    continue loop1;
            }
            System.out.println(i);
            sumOfTruncatablePrimes += i;
        }
        System.out.println(sumOfTruncatablePrimes);
    }
}
