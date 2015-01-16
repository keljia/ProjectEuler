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
public class Problem116_RGBTiles {
    public static void main (String[] args) {
        long startTime = System.currentTimeMillis();
        
        // each one has a -1 to remove the tiling of all black (1 unit) tiles
        long redWays = numberOfWays(2, 50) - 1;
        long greenWays = numberOfWays(3, 50) - 1;
        long blueWays = numberOfWays(4, 50) - 1;
        long totalWays = redWays + greenWays + blueWays;
        System.out.println(System.currentTimeMillis() - startTime);
        System.out.println(totalWays);
    }
    
    // c is the number of units in the colored tile; n is the length of the row
    public static long numberOfWays (int c, int n) {
        long[] ways = new long[n + 1];
        for (int i = 0; i < c; i++) {
            ways[i] = 1;
        }
        
        for (int i = c; i < ways.length; i++) {
            ways[i] = ways[i - 1] + ways[i - c];
        }
        
        return ways[n];
    }
}
