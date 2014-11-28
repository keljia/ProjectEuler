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
public class Problem14_LongestCollatzSequence {
    public static void main (String[] args) {
        int mostSteps = 0;
        int numberWithMostSteps = 0;
        
        for (int i = 5; i <= 1000000; i++) {
            int steps = 0;
            long n = i;
            
            while (n > 1) {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n *= 3;
                    n += 1;
                }
                steps++;
            }
            
            if (steps > mostSteps) {
                mostSteps = steps;
                numberWithMostSteps = i;
            }
        }
        
        System.out.println(numberWithMostSteps);
    }
}
