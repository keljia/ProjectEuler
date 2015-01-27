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
public class Problem123_PrimeSquareRemainders {
    public static void main (String[] args) {
        ArrayList<Integer> primes = ReusableMethods.sieve(500000);
        
        for (int p: primes) {
            if (primes.indexOf(p) % 2 == 1)
                continue;
            long remainder = 2 * (long)p * (long)(primes.indexOf(p) + 1);
            if (remainder > Math.pow(10, 10)) {
                System.out.println(primes.indexOf(p) + 1);
                break;
            }
        }
    }
}
