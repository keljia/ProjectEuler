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
public class Problem069_TotientMaximum {
    public static void main (String[] args) {
        /* The main premise of this is that if the prime factors of the number are p1, p2, ..., pn,
           then φ(n) = n(1 - 1/p1) * (1 - 1/p2) * ... * (1 - 1/pn). So if we want to make the ratio 
           n/φ(n) as big as possible, then we need to make (1 - 1/p1) * (1 - 1/p2) * ... * (1 - 1/pn) 
           as small as possible. This happens when there are the most, smallest primes.
        */
        
        ArrayList<Integer> primes = ReusableMethods.sieve(200);
        
        int number = 1;
        for (int p : primes) {
            if (number * p < 1000000)
                number *= p;
            else 
                break;
        }
        
        System.out.println(number);
    }
}
