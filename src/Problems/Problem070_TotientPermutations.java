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
public class Problem070_TotientPermutations {
    public static void main (String[] args) {
        int[] arr = new int[(int)Math.pow(10, 7)];
        
        ArrayList<Integer> primes = ReusableMethods.sieve((int)Math.pow(10, 7));
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        
        for (Integer p : primes) {
            for (int i = p; i < arr.length; i += p) {
                arr[i] /= p;
                arr[i] *= (p - 1);
            }
        }
        
        double maxRatio = 0.0;
        int n = 0;
        for (int i = 2; i < arr.length; i++) {
            if (Arrays.equals(orderedDigits(i), orderedDigits(arr[i]))) {
                double ratio = (double)arr[i] / i;
                if (ratio > maxRatio) {
                    maxRatio = ratio;
                    n = i;
                }
            }
        }
        
        System.out.println(n);
    }
    
    public static Integer[] orderedDigits(int n) {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        for (int i = n; i > 0; i /= 10) {
            digits.add(i % 10);
        }
        Integer[] digitsArray = new Integer[digits.size()];
        digitsArray = digits.toArray(digitsArray);
        Arrays.sort(digitsArray);
        return digitsArray;
    }
}
