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
public class Problem214_TotientChains {
    public static void main (String[] args) {
        ArrayList<Integer> primes = ReusableMethods.sieve(40000000);
        int[] arr = new int[40000000];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        
        for (int p : primes) {
            for (int i = p; i < arr.length; i += p) {
                arr[i] /= p;
                arr[i] *= (p - 1);
            }
        }
        
        long total = 0;
        
        for (int p : primes) {
            int chainLength = 2;
            int i = arr[p];
            while (i > 1) {
                i = arr[i];
                chainLength++;
                if (chainLength > 25) {
                    continue;
                }
            }
            if (chainLength == 25)
                total += p;
        }
        
        System.out.println(total);
    }
}
