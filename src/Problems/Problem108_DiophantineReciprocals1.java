/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problems;

import ReusableStuff.ReusableMethods;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author Kelly
 */
public class Problem108_DiophantineReciprocals1 {
    /* What we basically need is an array of points (x coordinate = the prime factor; y coordinate = the 
       exponent of that prime factor) so that we can store some prime factorization for some number. What
       we're looking for is the smallest (square) number that has at least 2000 prime factors; the square 
       root of that number, which is the number we're looking for, will have at least 1000 of those factors
       less than it. (See below for further explanation) */
    public static void main (String[] args) {
        int minFactors = 2000;
        ArrayList<Integer> primes = ReusableMethods.sieve(100);
        Point[] primeFactorization = new Point[(int)(Math.log((double)minFactors) / Math.log(3))];
        for (int i = 0; i < primeFactorization.length; i++) {
            primeFactorization[i].x = primes.get(i);
            primeFactorization[i].y = 1;
        }
    }
    
    /* For any factor of n^2 that's less than n, if you add that to n, then it will be the denominator
       of a unit fraction which, if you subtract from 1/n, will yield a unit fraction. E.g. the number 6:
       factors of 36 that are less than 6 are 1, 2, 3, 4, 6. If we add  to each of those numbers to 6 we get
       7, 8, 9, 10, and 12. So 1/6 = 1/7 + 1/42, 1/6 = 1/8 + 1/24, 1/6 = 1/9 + 1/18, 1/6 = 1/10 + 1/15, and
       1/6 = 1/12 + 1/12. */
    public static void findAllReciprocals() {
        int i = 2;
        while (true) {
            int reciprocals = 0;
            
            for (int j = 1; j <= i; j++) {
                if (((long)i * i) % j == 0)
                    reciprocals++;
            }
            System.out.println("i = " + i + ", reciprocals = " + reciprocals);
            
            if (reciprocals > 100) {
                System.out.println(i);
                System.out.println(reciprocals);
                break;
            }
            
            i++;
        }
    }
}
