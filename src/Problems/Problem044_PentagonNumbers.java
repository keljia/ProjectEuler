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
public class Problem044_PentagonNumbers {
    public static void main (String[] args) {
        ArrayList<Long> pentagonalNumbers = new ArrayList<Long>();
        for (int i = 1; i < 5000; i++) {
            pentagonalNumbers.add((long)i * (3 * i - 1) / 2);
        }
        
        System.out.println("Found all pentagonal numbers");
        long minimalDifference = pentagonalNumbers.get(pentagonalNumbers.size() - 1);
        
        for (int i = 0; i < pentagonalNumbers.size(); i++) {
            for (int j = 0; j < i; j++) {
                long penta1 = pentagonalNumbers.get(i);
                long penta2 = pentagonalNumbers.get(j);
                if (isPentagonal(penta1 - penta2)) {
                    if (isPentagonal(penta1 + penta2)) {
                        long diff = penta1 - penta2;
                        if (diff < minimalDifference) {
                            minimalDifference = diff;
                            System.out.println(penta1 + "\t" + penta2);
                        }
                    }
                }
            }
        }
        
        System.out.println(minimalDifference);
    }
    
    public static boolean isPentagonal (long a) {
        int n = (int)Math.sqrt((2 * a + 1) / 3) + 1;
        if ((n * (3 * n - 1) / 2) == a)
            return true;
        return false;
    }
}
