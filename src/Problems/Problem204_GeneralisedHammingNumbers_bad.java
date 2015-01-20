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
public class Problem204_GeneralisedHammingNumbers_bad {
    static final int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59,
			61, 67, 71, 73, 79, 83, 89, 97 };
    static int count = 1;
    static final int MAX = 1000000000;

    public static void main(String[] args) {
        count(1, 0);
        System.out.println(count);
    }
    
    static void count(long v, int index) {
        for (int i = index; i < primes.length; i++) {
            long v1 = v * primes[i];
            if (v1 <= MAX) {
                count++;
                count(v1, i);
            } else
                break;
        }
    }
}
