/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problems;

import ReusableStuff.ReusableMethods;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Kelly
 */
public class Problem072_CountingFractions {
    public static void main (String[] args) {
        /* Use a sieve - for each number from 1 to 10^6 (representative of all the denominators), 
           for each prime factor p of those numbers, multiply the number by (p - 1) / p. This is 
           basically equivalent to finding the totient function of each denominator, since only the 
           numbers that are relatively prime to the denominator get counted in the list of reduced 
           fractions.*/
        int[] arr = new int[(int)Math.pow(10, 6) + 1];
        
        ArrayList<Integer> primes = ReusableMethods.sieve((int)Math.pow(10, 6));
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        
        for (Integer p : primes) {
            for (int i = p; i < arr.length; i += p) {
                arr[i] /= p;
                arr[i] *= (p - 1);
            }
        }
        
        long total = 0;
        for (int i = 2; i < arr.length; i++) {
            total += arr[i];
        }
        
        System.out.println(total);
    }
}
