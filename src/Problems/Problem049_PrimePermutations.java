/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problems;

import ReusableStuff.ReusableMethods;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Kelly
 */
public class Problem049_PrimePermutations {
    public static void main (String[] args) {
        ArrayList<Integer> primes = ReusableMethods.sieve(9999);
        for (int p : primes) {
            if (p > 1000) {
                for (int p2 : primes) {
                    if (p2 > p) {
                        if (orderDigits(p2) == orderDigits(p)) {
                            int p3 = 2 * p2 - p;
                            if (orderDigits(p3) == orderDigits(p) && primes.contains(p3)) {
                                System.out.println(p + ", " + p2 + ", " + p3);
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static int orderDigits(int n) {
        ArrayList<Integer> digits = new ArrayList<>();
        for (int i = n; i > 0; i /= 10) {
            digits.add(i % 10);
        }
        Collections.sort(digits);
        
        int orderedDigits = 0;
        for (int i = 0; i < digits.size(); i++) {
            orderedDigits *= 10;
            orderedDigits += digits.get(i);
        }
        
        return orderedDigits;
    }
}
