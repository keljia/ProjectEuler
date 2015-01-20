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
public class Problem187_Semiprimes {
    public static void main(String[] args) {
        ArrayList<Integer> primes = ReusableMethods.sieve(5 * (int)Math.pow(10, 7));
        
        int numberOfSemiprimes  = 0;
        for (int p1 : primes) {
            if (p1 > 10000)
                break;
            for (int p2 : primes) {
                if (p2 < p1)
                    continue;
                if (p2 * p1 > 100000000)
                    break;
                numberOfSemiprimes++;
            }
        }
        
        System.out.println(numberOfSemiprimes);
    }
}
