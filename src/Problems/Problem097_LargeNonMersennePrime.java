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
public class Problem097_LargeNonMersennePrime {
    public static void main (String[] args) {
        long num = 1;
        for (int i = 1; i <= 7830457; i++) {
            num *= 2;
            num %= Math.pow(10, 10);
        }
        
        num *= 28433;
        num += 1;
        num %= Math.pow(10, 10);
        System.out.println(num);
    }
}
