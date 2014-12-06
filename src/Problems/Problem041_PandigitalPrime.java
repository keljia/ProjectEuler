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
public class Problem041_PandigitalPrime {
    public static void main (String[] args) {
        // all possible primes with 7 or less digits; any number with the digits 1-8 or 1-9
        // will be divisible by 3
        ArrayList<Integer> primes = ReusableMethods.sieve(7654321);
        int largestPandigitalPrime = 0;
        
        for (int p : primes) {
            ArrayList<Integer> primeDigitsList = new ArrayList<>();
            for (int i = p; i > 0; i /= 10) {
                primeDigitsList.add(i % 10);
            }
            Integer[] primeDigits = new Integer[primeDigitsList.size()];
            primeDigits = primeDigitsList.toArray(primeDigits);
            Arrays.sort(primeDigits);
            
            Integer[] pandigits = new Integer[primeDigitsList.size()];
            for (int i = 0; i < primeDigitsList.size(); i++) {
                pandigits[i] = i + 1;
            }
            
            if (Arrays.equals(primeDigits, pandigits))
                largestPandigitalPrime = p;
        }
        
        System.out.println(largestPandigitalPrime);
    }
}
