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
public class Problem81_PathSumTwoWays {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("p081_matrix.txt"));
        ArrayList<String> matrix = new ArrayList<>();
        while (scan.hasNextLine()) {
            matrix.add(scan.nextLine());
        }
        
        String[] rows = new String[matrix.size()];
        rows = matrix.toArray(rows);
        String[][] grid = new String[rows.length][];
        
        for (int i = 0; i < rows.length; i++) {
            grid[i] = rows[i].split(",");
        }
        
        // convert string array to int array
        int[][] numbersGrid = new int[grid.length][];
        for (int i = 0; i < numbersGrid.length; i++) {
            numbersGrid[i] = new int[grid[i].length];
            for (int j = 0; j < numbersGrid[i].length; j++) {
                numbersGrid[i][j] = Integer.parseInt(grid[i][j]);
            }
        }
        
        for (int i = 0; i < 2 * (numbersGrid.length) - 1; i++) {
            // upper left half of grid
            if (i < numbersGrid.length) {
                if (i > 0) {
                    numbersGrid[0][i] += numbersGrid[0][i - 1];
                    numbersGrid[i][0] += numbersGrid[i - 1][0];
                }
                
                for (int j = 1; j < i; j++) {
                    numbersGrid[j][i - j] += Math.min(numbersGrid[j - 1][i - j], numbersGrid[j][i - j - 1]);
                }
            }
            
            // lower right half of grid
            if (i >= grid.length) {
                for (int j = i - grid.length + 1; j < grid.length; j++) {
                    numbersGrid[j][i - j] += Math.min(numbersGrid[j - 1][i - j], numbersGrid[j][i - j - 1]);
                }
            }
        }
        
        System.out.println(numbersGrid[numbersGrid.length - 1][numbersGrid[0].length - 1]);
    }
}
