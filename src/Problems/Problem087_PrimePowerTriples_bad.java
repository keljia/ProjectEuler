/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problems;

import ReusableStuff.ReusableMethods;
import java.util.ArrayList;
import java.util.HashMap;


/**
 *
 * @author Kelly
 */
public class Problem087_PrimePowerTriples_bad {
    public static void main (String[] args) {
        HashMap primePowerTriples = new HashMap();
        ArrayList<Integer> primes = ReusableMethods.sieve(7071);
        int n = 50000000;
        
        for (int i : primes) {
            int primeSquare = i * i;
            for (int j : primes) {
                int primeCube = j * j * j;
                if (primeSquare + primeCube > n)
                    break;
                for (int k : primes) {
                    int number = i * i + j * j * j + k * k * k * k;
                    if (number > n)
                        break;

                    if(!primePowerTriples.containsKey(number))
                        primePowerTriples.put(number, number);
                }
            }
        }
        
        System.out.println(primePowerTriples.size());
    }
}
