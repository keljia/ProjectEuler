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
public class Problem046_GoldbachsOtherConjecture {
    public static void main (String[] args) {
        ArrayList<Integer> primes = ReusableMethods.sieve(10000);
        
        int i = 1;
        outerloop: while (true) {
            i += 2;
            if (primes.contains(i))
                continue;
            for (int p : primes) {
                if (p > i)
                    break outerloop;
                if (Math.sqrt((i - p) / 2) == (int)Math.sqrt((i - p) / 2)) {
                    continue outerloop;
                }
            }
        }
        
        System.out.println(i);
    }
}
