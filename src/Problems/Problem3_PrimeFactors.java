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
public class Problem3_PrimeFactors {
    public static int largestPossiblePrime = 775146;
    public static long bigNumber = 600851475143L;
    // square root of 600851475143

    public static void main(String[] args) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        
        // get all of the primes (testing only odd numbers)
        for (int i = 3; i < largestPossiblePrime; i += 2) {
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
        
        //System.out.println(primes.toString());
        System.out.println(primes.size());
        
        // find prime factors of the long number
        int largestPrimeFactor = 1;
        for (int i = 0; i < primes.size(); i++) {
            if(divisible(bigNumber, primes.get(i))) {
                largestPrimeFactor = primes.get(i);
            }
        }
        
        System.out.println("The largest prime factor of " + bigNumber + " is " + largestPrimeFactor + ".");
    }
    
    public static boolean divisible(int a, int b) {
        return (a % b == 0);
    }
    
    public static boolean divisible(long a, int b) {
        return (a % b == 0);
    }
}
