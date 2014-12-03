/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problems;

import java.util.ArrayList;

/**
 *
 * @author Kelly
 */
public class Problem058_DoubleBasePalindromes {
    public static void main (String[] args) {
        int sumOfDoubleBasePalindromes = 0;
        for (int i = 1; i < 1000000; i++) {
            if (isPalindrome(i)) {
                if (isPalindrome(Integer.toString(i, 2))) {
                    sumOfDoubleBasePalindromes += i;
                    System.out.println(i);
                }
            }
        }
        System.out.println(sumOfDoubleBasePalindromes);
    }
    
    public static boolean isPalindrome (int n) {
        int num = n;
        int backwardsNum = 0;
        while (num > 0) {
            backwardsNum *= 10;
            backwardsNum += num % 10;
            num /= 10;
        }
        
        if (n == backwardsNum) {
            return true;
        }
        return false;
    }
    
    public static boolean isPalindrome (String s) {
        StringBuffer backwardsString = new StringBuffer(s);
        backwardsString.reverse();
        if (s.equals(backwardsString.toString()))
            return true;
        return false;
    }
}
