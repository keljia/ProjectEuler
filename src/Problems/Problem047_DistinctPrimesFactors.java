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
public class Problem047_DistinctPrimesFactors {
    public static void main (String[] args) {
        ArrayList<Integer> primes = ReusableMethods.sieve(1000000);
        int[] numbers = new int[1000001];
        for (int p : primes) {
            for (int i = p; i < numbers.length; i += p) {
                numbers[i]++;
            }
        }
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == 4) {
                if (numbers[i + 1] == 4) {
                    if (numbers[i + 2] == 4) {
                        if (numbers[i + 3] == 4) {
                            System.out.println(i);
                            break;
                        }
                    }
                }
            }
        }
    }
}
