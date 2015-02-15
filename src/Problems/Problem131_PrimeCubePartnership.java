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
public class Problem131_PrimeCubePartnership {
    public static void main (String[] args) {
        long n = 1;
        long p = 0;
        int count = 0;
        while (p < 1000000) {
            p = ((n + 1) * (n + 1) * (n + 1)) - (n * n * n);
            if (isPrime(p)) {
                count++;
            }
            n++;
        }
        
        System.out.println(count);
    }
    
    public static boolean isPrime (long n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        
        return true;
    }
}
