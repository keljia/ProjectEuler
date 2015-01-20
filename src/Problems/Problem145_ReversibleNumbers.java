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
public class Problem145_ReversibleNumbers {
    public static void main (String[] args) {
        int numberOfReversibleNumbers = 0;
        for (int i = 1; i < 1000000000; i++) {
            if (i % 10000000 == 0) {
                System.out.println(i);
                System.out.println(numberOfReversibleNumbers);
            }
            if (i % 10 == 0)
                continue;
            if (isReversible(i))
                numberOfReversibleNumbers++;
        }
        
        System.out.println(numberOfReversibleNumbers);
    }
    
    public static int reverse (int n) {
        int reverse = 0;
        for (int i = n; i > 0; i /= 10) {
            reverse *= 10;
            reverse += i % 10;
        }
        
        return reverse;
    }
    
    public static boolean isReversible (int n) {
        int sum = n + reverse(n);
        while (sum > 0) {
            if (sum % 2 == 0)
                return false;
            sum /= 10;
        }
        return true;
    }
}
