/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problems;

import java.math.BigInteger;

/**
 *
 * @author Kelly
 */
public class Problem113_NonBouncyNumbers {
    /* Increasing numbers have some number of 1's, 2's, 3's, etc. up to the number of digits (i).
       We do stars and bars on i + 9, then subtract 1 from each set of stars to get the number of 
       each digit. Then we flip the numbers and put zeros at the end to get the number of decreasing
       numbers. We also subtract 9 from the number of decreasing numbers because we double count all
       of the numbers with all the same digits, like 111111.
    */
    public static void main (String[] args) {
        long total = 0;
        for (int i = 1; i <= 100; i++) {
            // (i + 8) choose i
            long increasingNumbers = 1;
            for (int j = 1; j <= 8; j++) {
                increasingNumbers *= (i + 9 - j);
                increasingNumbers /= j;
            }
            
            long decreasingNumbers = increasingNumbers * (101 - i) - 9;
            
            total += increasingNumbers + decreasingNumbers;
        }
        
        System.out.println(total);
    }
}
