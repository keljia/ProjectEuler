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
public class Problem117_RGBTiles {
    public static void main (String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println(numberOfWays(50));
        System.out.println(System.currentTimeMillis() - startTime);
    }
    
    public static long numberOfWays (int n) {
        long[] ways = new long[n + 1];
        ways[0] = 1;
        ways[1] = 1;
        ways[2] = 2;
        ways[3] = 4;
        
        for (int i = 4; i < ways.length; i++) {
            ways[i] = ways[i - 1] + ways[i - 2] + ways[i - 3] + ways[i - 4];
        }
        
        return ways[n];
    }
}
