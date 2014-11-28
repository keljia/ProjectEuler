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
public class Problem30_DigitFifthPowers {
    public static void main (String[] args) {
        int sumOfCoolNumbers = 0;
        
        for (int i = 10; i < 354294; i++) {
            int sumOfFifthPowers = 0;
            for (int n = i; n >= 1; n /= 10) {
                sumOfFifthPowers += Math.pow((n % 10), 5);
            }
            if (sumOfFifthPowers == i) {
                System.out.println(i);
                sumOfCoolNumbers += i;
            }
        }
        System.out.println(sumOfCoolNumbers);
    }
}
