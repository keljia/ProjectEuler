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
public class Problem038_PandigitalMultiples {
    public static void main (String[] args) {
        int maxConcatenation = 0;
        // we know that the number that's being multiplied is 9000 something, since that's the
        // only way that the concatenation will be bigger than 918273645. Also the number has 
        // to be less than 9500 so that 2 * n < 19000 which would cause 9 to be repeated.
        outerloop: for (int i = 9000; i < 9500; i++) {
            boolean[] digits = new boolean[10];
            for (int j = 1; j <= 9; j++) {
                digits[j] = true;
            }
            
            for (int j = i; j > 0; j /= 10) {
                if (digits[j % 10])
                    digits[j % 10] = false;
                else
                    continue outerloop;
            }
            
            ArrayList<Integer> digitsList = new ArrayList<>();
            
            for (int j = 0; j < digits.length; j++) {
                if (digits[j])
                    digitsList.add(j);
            }
            
            Integer[] digitsLeftArray = new Integer[5];
            digitsList.toArray(digitsLeftArray);
            
            int product = 2 * i;
            
            // create & sort arrayList of digits in the product
            ArrayList<Integer> productDigits = new ArrayList<>();

            for (int j = product; j > 0; j /= 10) {
                productDigits.add(j % 10);
            }

            Integer[] productDigitsArray = new Integer[5];
            productDigits.toArray(productDigitsArray);
            Arrays.sort(productDigitsArray);
            
            if (Arrays.equals(productDigitsArray, digitsLeftArray)) {
                int concatenation = i * 100000 + product;
                if (concatenation > maxConcatenation)
                    maxConcatenation = concatenation;
                System.out.println(concatenation);
            }
        }
        System.out.println("\n" + maxConcatenation);
    }
}
