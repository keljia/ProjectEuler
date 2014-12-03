/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problems;

import java.util.ArrayList;

/**
 *
 * @author Kelly
 */
public class Problem007_Prime10001 {
    public static void main(String[] args) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        
        // get all of the primes (testing only odd numbers)
        for (int i = 3; primes.size() < 10001; i += 2) {
            // try dividing i by all primes
            boolean isPrime = true;
            for (int j = 0; j < primes.size(); j++) {
                if(divisible(i, primes.get(j))) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime)
                primes.add(i);
        }
        
        System.out.println(primes.toString());
        System.out.println(primes.get(10000));
    }
    
    public static boolean divisible(int a, int b) {
        return (a % b == 0);
    }
    
    
}
