/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problems;

import java.math.BigInteger;

/**
 *
 * @author Kelly
 */
public class Problem055_LychrelNumbers {
    public static void main (String[] args) {
        long startTime = System.currentTimeMillis();
        int count = 0;
        for (int i = 1; i < 10000; i++) {
            BigInteger n = BigInteger.valueOf(i);
            for (int j = 1; j <= 50; j++) {
                n = n.add(reverse(n));
                if (isPalindrome(n))
                    break;
                if (j == 50)
                    count++;
            }
        }
        System.out.println(count);
        System.out.println(System.currentTimeMillis() - startTime);
    }
    
    public static boolean isPalindrome (BigInteger n) {
        String s = n.toString();
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;
    }
    
    public static BigInteger reverse (BigInteger n) {
        BigInteger reverse = BigInteger.ZERO;
        for (BigInteger i = n; i.compareTo(BigInteger.ZERO) > 0; i = i.divide(BigInteger.TEN)) {
            reverse = reverse.multiply(BigInteger.TEN);
            reverse = reverse.add(i.mod(BigInteger.TEN));
        }
        return reverse;
    }
}
