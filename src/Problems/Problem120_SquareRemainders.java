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
public class Problem120_SquareRemainders {
    public static void main (String[] args) {
        long sum = 0;
        for (int i = 3; i <= 1000; i++) {
            if (i % 2 == 1)
                sum += (i * (i - 1));
            else
                sum += (i * (i - 2));
        }
        
        System.out.println(sum);
    }
}
