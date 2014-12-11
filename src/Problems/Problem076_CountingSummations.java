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
public class Problem076_CountingSummations {
    public static void main (String[] args) {
        System.out.println(totalSummations(100));
    }
    
    public static int totalSummations(int n) {
        int total = 0;
        for (int i = 1; i < n; i++) {
            total += summations(n, i);
        }
        return total;
    }
    
    // number of summations up to a number, when the highest number in the summation is max
    public static int summations(int n, int max) {
        
        if (max == 1 || n == max) 
            return 1;
        
        if (max > n)
            return 0;
        
        int total = 0;
        
        for (int i = 1; i <= max; i++) {
            total += summations(n - max, i);
        }

        return total;
    }
}
