/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problems;

import java.util.ArrayList;

/**
 *
 * @author Kelly
 */
public class Problem45_TriangularPentagonalHexagonal {
    public static void main (String[] args) {
        ArrayList<Long> pentagonalNumbers = new ArrayList<Long>();
        for (int i = 1; i < 100000; i++) {
            pentagonalNumbers.add((long)i * (3 * i - 1) / 2);
        }
        
        System.out.println("Found all pentagonal numbers");
        
        ArrayList<Integer> hexagonalNumbersIndices = new ArrayList<Integer>();
        
        for (int i = 1; i < pentagonalNumbers.size(); i++) {
            long h = (long)i * (2 * i - 1);
            // if the pentagonal number is also a triangular number, make the boolean corresponding to that triangular # true
            if (pentagonalNumbers.contains(h)) {
                hexagonalNumbersIndices.add(pentagonalNumbers.indexOf(h));
                System.out.println(h);
            }
        }
        System.out.println("Found all hexagonal numbers");
    }
}
