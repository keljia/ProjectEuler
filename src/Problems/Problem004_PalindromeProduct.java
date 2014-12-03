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
public class Problem004_PalindromeProduct {
    public static void main (String[] args) {
        int largestPalindrome = 0;
        for (int i = 500; i < 1000; i++) {
            for (int j = i; j < 1000; j++) {
                if (isPalindrome(i * j) && i * j > largestPalindrome)
                    largestPalindrome = i * j;
            }
        }
        
        System.out.println(largestPalindrome);
    }
    
    public static boolean isPalindrome(int n) {
        // if 6 digits
        int lastDigit = n % 10;
        int secondLastDigit = n % 100 / 10;
        int thirdLastDigit = n % 1000 / 100;
        int thirdDigit = n % 10000 / 1000;
        int secondDigit = n % 100000 / 10000;
        int firstDigit = n / 100000;
        
        if (firstDigit == lastDigit && secondLastDigit == secondDigit && thirdLastDigit == thirdDigit) {
            return true;
        }
        
        return false;
    }
}
