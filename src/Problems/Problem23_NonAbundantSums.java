/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problems;

/**
 *
 * @author Kelly
 */
public class Problem23_NonAbundantSums {
    public static void main (String[] args) {
        boolean[] abundantNumbers = new boolean[28128];
        for (int i = 1; i < abundantNumbers.length; i++) {
            if (isAbundant(i)) {
                abundantNumbers[i] = true;
            }
        }
        
        int sumOfNonAbundantSums = 0;
        for (int i = 1; i < abundantNumbers.length; i++) {
            boolean nonAbundantSum = true;
            for (int j = 1; j < i; j++) {
                if (abundantNumbers[j] && abundantNumbers[i - j]) {
                    nonAbundantSum = false;
                    break;
                }
            }
            
            if (nonAbundantSum) {
                sumOfNonAbundantSums += i;
            }
        }
        
        System.out.println(sumOfNonAbundantSums);
    }
    
    public static boolean isAbundant (int a) {
        int sumOfFactors = 0;
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sumOfFactors += i;
            }
        }
        
        if (sumOfFactors > a) {
            return true;
        }
        return false;
    }
}
