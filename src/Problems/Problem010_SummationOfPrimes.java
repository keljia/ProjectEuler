/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problems;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Kelly
 */

public class Problem010_SummationOfPrimes {
    public static void main (String[] args) {
        ArrayList<Integer> primes = sieve(2000000);
        
        long sum = 0;
        for (int i = 0; i < primes.size(); i++) {
            sum += primes.get(i);
        }
        
        System.out.println(sum);
    }
    
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
