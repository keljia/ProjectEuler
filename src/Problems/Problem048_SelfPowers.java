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
public class Problem048_SelfPowers {
    public static void main (String[] args) {
        long sumOfPowers = 0;
        for (int i = 1; i <= 1000; i++) {
            long power = 1;
            for (int j = 1; j <= i; j++) {
                power *= i;
                power %= Math.pow(10, 10);
            }
            sumOfPowers += power;
            sumOfPowers %= Math.pow(10, 10);
        }
        System.out.println(sumOfPowers);
    }
}
