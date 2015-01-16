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
public class Problem243_Resilience {
    public static void main (String[] args) {
        // The number of resilient fractions is equivalent to the totient function of the denominator.
        ArrayList<Integer> primes = ReusableMethods.sieve(200);
                
        double resilience = 1.0;
        long denominator = 1;
        long newDenominator = 0;
        
        for (int p : primes) {
            if (resilience < (double)15499 / 94744) {
                int i = 2;
                newDenominator = denominator;
                while (resilience * newDenominator / (newDenominator - 1) >= (double)15499 / 94744) {
                    newDenominator *= i;
                    newDenominator /= i - 1;
                    i++;
                }
                break;
            } else {
                denominator *= p;
                resilience *= (p - 1);
                resilience /= p;
            }    
        }
        
        System.out.println(newDenominator);
    }
}
