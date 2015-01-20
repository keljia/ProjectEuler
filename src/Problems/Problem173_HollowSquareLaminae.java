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
public class Problem173_HollowSquareLaminae {
    public static void main (String[] args) {
        final int maxTiles = 1000000;
        int numberOfLaminae = 0;
        for (int i = 1 + maxTiles / 4; i >= 3; i--) {
            for (int j = i - 2; j > 0; j -= 2) {
                if (i * i - j * j <= maxTiles) 
                    numberOfLaminae++;
                else
                    break;
            }
        }
        
        System.out.println(numberOfLaminae);
    }
}
