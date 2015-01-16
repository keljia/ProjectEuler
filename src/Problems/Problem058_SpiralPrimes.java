/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problems;

import ReusableStuff.ReusableMethods;
import gnu.trove.set.hash.TIntHashSet;

/**
 *
 * @author Kelly
 */
public class Problem058_SpiralPrimes {
    public static void main (String[] args) {
        long startTime = System.currentTimeMillis();
                
        double primeRatio = 1.0;
        int side = 1;
        int diagonalNumber = 1;
        int numberOfDiagonalNumbers = 1;
        int numberOfPrimes = 0;
                
        while (primeRatio > 0.1) {
            side += 2;
            for (int i = 1; i <= 3; i++) {
                diagonalNumber += side - 1;
                if (isPrime(diagonalNumber))
                    numberOfPrimes++;
            }
            diagonalNumber += side - 1;
            numberOfDiagonalNumbers += 4;
            
            primeRatio = (double)numberOfPrimes / numberOfDiagonalNumbers;
        }
        
        System.out.println(side);
    }
    
    public static boolean isPrime(int n) {
        if (n % 2 == 0)
            return false;
        for (int i = 3; i * i < n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
