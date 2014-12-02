/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problems;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Kelly
 */
public class Problem52_PermutedMultiples {
    public static void main (String[] args) {
        for (int i = 100000; i < 166667; i++) {
            Integer[] digits = orderedDigits(i);
            if (Arrays.equals(digits, orderedDigits(2 * i))) {
                if (Arrays.equals(digits, orderedDigits(3 * i))) {
                    if (Arrays.equals(digits, orderedDigits(4 * i))) {
                        if (Arrays.equals(digits, orderedDigits(5 * i))) {
                            if (Arrays.equals(digits, orderedDigits(6 * i))) {
                                System.out.println(i);
                                break;
                            }
                        }
                    }
                }
            }
        }
    }
    
    public static Integer[] orderedDigits(int n) {
        ArrayList<Integer> digits = new ArrayList<Integer>();
        for (int i = n; i > 0; i /= 10) {
            digits.add(i % 10);
        }
        Integer[] digitsArray = new Integer[digits.size()];
        digitsArray = digits.toArray(digitsArray);
        Arrays.sort(digitsArray);
        return digitsArray;
    }
}
