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
public class Problem112_BouncyNumbers {
    public static void main (String[] args) {
        int numberOfBouncyNumbers = 0;
        for (int i = 100; i < 10000000; i++) {
            if (!isIncreasing(i) && !isDecreasing(i))
                numberOfBouncyNumbers++;
            if ((double)numberOfBouncyNumbers/(double)i == 0.99) {
                System.out.println(i);
                break;
            }
        }
    }
    
    public static boolean isIncreasing (int n) {
        int lastDigit = n % 10;
        for (int i = n; i > 0; i /= 10) {
            int nextDigit = i % 10;
            if (nextDigit > lastDigit)
                return false;
            lastDigit = nextDigit;
        }
        return true;
    }
    
    public static boolean isDecreasing (int n) {
        int lastDigit = n % 10;
        for (int i = n; i > 0; i /= 10) {
            int nextDigit = i % 10;
            if (nextDigit < lastDigit)
                return false;
            lastDigit = nextDigit;
        }
        return true;
    }
}
