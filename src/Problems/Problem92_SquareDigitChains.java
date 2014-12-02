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
public class Problem92_SquareDigitChains {
    public static void main (String[] args) {
        int numbersEndingIn89 = 0;
        for (int i = 2; i < 10000000; i++) {
            int n = i;
            while (n != 1 && n != 89) {
                n = digitSquare(n);
            }
            
            if (n == 89)
                numbersEndingIn89++;
        }
        
        System.out.println(numbersEndingIn89);
    }
    
    public static int digitSquare(int a) {
        int result = 0;
        for (int i = a; i > 0; i /= 10) {
            result += (i % 10) * (i % 10);
        }
        
        return result;
    }
}
