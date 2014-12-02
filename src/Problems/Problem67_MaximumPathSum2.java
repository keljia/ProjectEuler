/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problems;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kelly
 */


public class Problem67_MaximumPathSum2 {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("p067_triangle.txt"));
        ArrayList<String> triangle = new ArrayList<>();
        while (scan.hasNextLine()) {
            triangle.add(scan.nextLine());
        }
        
        String[] rows = new String[triangle.size()];
        rows = triangle.toArray(rows);
        String[][] numbersString = new String[rows.length][];
        
        for (int i = 0; i < rows.length; i++) {
            numbersString[i] = rows[i].split(" ");
        }
        
        int[][] numbersTriangle = new int[numbersString.length][];
        for (int i = 0; i < numbersTriangle.length; i++) {
            numbersTriangle[i] = new int[numbersString[i].length];
            for (int j = 0; j < numbersTriangle[i].length; j++) {
                numbersTriangle[i][j] = Integer.parseInt(numbersString[i][j]);
            }
        }
        
        // start from the second to last row of the triangle
        for (int i = numbersTriangle.length - 2; i >= 0; i--) {
            // find the biggest sum
            for (int j = 0; j < numbersTriangle[i].length; j++) {
                int leftSum = numbersTriangle[i][j] + numbersTriangle[i + 1][j];
                int rightSum = numbersTriangle[i][j] + numbersTriangle[i + 1][j + 1];
                
                // set each element to the maximum path sum below that digit.
                numbersTriangle[i][j] = Math.max(leftSum, rightSum);
            }
        }
        
        System.out.println(numbersTriangle[0][0]);
    }
}
