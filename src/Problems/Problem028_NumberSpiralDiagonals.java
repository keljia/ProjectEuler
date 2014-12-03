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
public class Problem028_NumberSpiralDiagonals {
    public static void main (String[] args) {
        int spiralDimension = 1001;
        int spiralSum = 1;
        int diagonalNumber = 1;
        for (int i = 1; i <= spiralDimension / 2; i++) {
            for (int j = 1; j <= 4; j++) {
                diagonalNumber += 2 * i;
                spiralSum += diagonalNumber;
            }
        }
        
        System.out.println(spiralSum);
    }
}
