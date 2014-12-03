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
public class Problem087_PrimePowerTriples {
    static ArrayList<Integer> primePowerTriples = new ArrayList<>();
    public static void main (String[] args) {
        ArrayList<Integer> primes = ReusableMethods.sieve(7071);
        for (int i : primes) {
            for (int j : primes) {
                if (j < 368) {
                    for (int k : primes) {
                        if (k < 84) {
                            int number = (int)Math.pow(i, 2) + (int)Math.pow(j, 3) + (int)Math.pow(k, 4);
                            if (number < 50000000) {
                                if (primePowerTriples.size() <= 2)
                                    primePowerTriples.add(number);
                                else
                                    insertElement(number);
                            }
                        } else {
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
        }
        
        System.out.println(primePowerTriples.size());
    }
    
    // if n is not already in the ArrayList, then put it in (in order)
    public static void insertElement( int n) {
        int lo = 0;
        int hi = primePowerTriples.size() - 1;
        int mid;
        
        // if n is bigger than all of the other elements, put it at the end of the list
        if (n > primePowerTriples.get(hi)) {
            primePowerTriples.add(n);
            return;
        }
        
        while (hi > lo) {
            // if n is between hi and low, put it at the index hi
            if (hi - lo == 1 && primePowerTriples.get(hi) != n && primePowerTriples.get(lo) != n) {
                primePowerTriples.add(hi, n);
                return;
            }
            
            mid = (hi + lo) / 2;
            int middle = primePowerTriples.get(mid);
            if (n < middle) {
                hi = mid;
            } else if (n > middle) {
                lo = mid;
            } else {
                return;
            }   
        }
    }
}
