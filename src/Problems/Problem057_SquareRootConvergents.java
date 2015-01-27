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
public class Problem057_SquareRootConvergents {
    public static void main (String[] args) {
        BigInteger[][] convergents = new BigInteger[1001][2];
        convergents[0] = new BigInteger[] {BigInteger.ONE, BigInteger.ONE};
        
        int count = 0;
        
        for (int i = 1; i < convergents.length; i++) {
            convergents[i][1] = convergents[i - 1][0].add(convergents[i - 1][1]);
            convergents[i][0] = convergents[i][1].add(convergents[i - 1][1]);
            
            if (convergents[i][0].toString().length() > convergents[i][1].toString().length())
                count++;
        }
        
        System.out.println(count);
    }
}
