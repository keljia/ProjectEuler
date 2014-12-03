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
public class Problem053_CombinatoricSelections {
    public static void main (String[] args) {
        int numbersOverOneMillion = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                if (combo(i, j) > 1000000) {
                    numbersOverOneMillion += i + 1 - (2 * j);
                    break;
                }
            }
        }
        
        System.out.println(numbersOverOneMillion);
    }
    
    public static long combo(int n, int r) {
        long combo = 1;
        
        for (int i = n; i > (n - r); i--) {
            combo *= i;
        }
        
        for (int i = 1; i <= r; i++) {
            combo /= i;
        }
        
        return combo;
    }
}
