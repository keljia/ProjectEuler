/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ReusableStuff;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Kelly
 */
public class ReusableMethods {
    public static void main (String[] args) {
        
    }
    
    // sieve of Erastothenes 
    public static ArrayList<Integer> sieve(int n) {
        boolean[] a = new boolean[n + 1];
        Arrays.fill(a, true);
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (a[i]) {
                for (int j = i * i; j <= n; j += i) {
                    a[j] = false;
                }
            }
        }
        
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for (int i = 2; i < n; i++) {
            if (a[i]) {
                primes.add(i);
            }
        }
        
        return primes;
    }
}
