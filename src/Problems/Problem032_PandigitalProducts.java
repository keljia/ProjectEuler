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
public class Problem032_PandigitalProducts {
    /* So the way this works is that there's a boolean array of all of the digits. If they're used 
       in the multiplier or the multiplicand (which can be 2 digits/3 digits or 1 digit/4 digits
       then that cell in the boolean array is marked as false. Then the digits in the product of the 
       multiplier and the multiplicand is compared to the digits that are still "true" in the boolean
       array. */
    public static void main (String[] args) {
        // d11 = first digit of first (2 digit) number
        ArrayList<Integer> pandigitalProducts = new ArrayList<>();
        int sumOfPandigitalProducts = 0;
        
        // pandigital products of 2 digit * 3 digit number
        for (int d11 = 1; d11 < 10; d11++) {
            boolean[] pandigits = new boolean[10];
            for (int i = 1; i < pandigits.length; i++) {
                pandigits[i] = true;
            }
            
            // false means that that digit has already been used.
            pandigits[d11] = false;
            pandigits[0] = false;
            
            // d12 = second digit of first (2 digit) number
            for (int d12 = 1; d12 < pandigits.length; d12++) {
                if (pandigits[d12]) {
                    int twoDigitNumber = 10 * d11 + d12;
                    pandigits[d12] = false;
                    
                    // d21 = first digit of second (3 digit) number
                    for (int d21 = 1; d21 < pandigits.length; d21++) {
                        if (pandigits[d21]) {
                            pandigits[d21] = false;
                            
                            // d22 = second digit of second (3 digit) number
                            for (int d22 = 1; d22 < pandigits.length; d22++) {
                                if (pandigits[d22]) {
                                    pandigits[d22] = false;
                                    
                                    // d23 = third digit of second (3 digit) number
                                    for (int d23 = 1; d23 < pandigits.length; d23++) {
                                        if (pandigits[d23]) {
                                            int threeDigitNumber = 100 * d21 + 10 * d22 + d23;
                                            pandigits[d23] = false;
                                            
                                            int product = twoDigitNumber * threeDigitNumber;
                                            if (product > 9876) {
                                                pandigits[d23] = true;
                                                break;
                                            }
                                            
                                            // create & sort arrayList of digits in the product
                                            ArrayList<Integer> productDigits = new ArrayList<>();
                                            
                                            for (int i = product; i > 0; i /= 10) {
                                                productDigits.add(i % 10);
                                            }
                                            
                                            Integer[] productDigitsArray = new Integer[4];
                                            productDigits.toArray(productDigitsArray);
                                            Arrays.sort(productDigitsArray);
                                            
                                            // create arrayList of digits we haven't used in the multiplier or multiplicand
                                            ArrayList<Integer> pandigitsLeft = new ArrayList<>();
                                            for (int i = 0; i < pandigits.length; i++) {
                                                if (pandigits[i])
                                                    pandigitsLeft.add(i);
                                            }
                                            
                                            Integer[] pandigitsArray = new Integer[4];
                                            pandigitsLeft.toArray(pandigitsArray);
                                            
                                            if (Arrays.equals(pandigitsArray, productDigitsArray)) {
                                                System.out.println(twoDigitNumber + " * " + threeDigitNumber + " = " + product);
                                                if (!pandigitalProducts.contains(product)) {
                                                    pandigitalProducts.add(product);
                                                    sumOfPandigitalProducts += product;
                                                }
                                            }
                                            pandigits[d23] = true;
                                        }
                                    }
                                    pandigits[d22] = true;
                                }
                            }
                            pandigits[d21] = true;
                        }
                    }
                    pandigits[d12] = true;
                }
            }
        }
        
        // pandigital product of 1 digit * 4 digit number
        for (int oneDigitNumber = 1; oneDigitNumber < 10; oneDigitNumber++) {
            boolean[] pandigits = new boolean[10];
            for (int i = 1; i < pandigits.length; i++) {
                pandigits[i] = true;
            }
            
            // false means that that digit has already been used.
            pandigits[oneDigitNumber] = false;
            pandigits[0] = false;
            
            // d1 = first digit of (four digit) number
            for (int d1 = 1; d1 < pandigits.length; d1++) {
                if (pandigits[d1]) {
                    pandigits[d1] = false;
                    
                    // d2 = second digit of (four digit) number
                    for (int d2 = 1; d2 < pandigits.length; d2++) {
                        if (pandigits[d2]) {
                            pandigits[d2] = false;
                            
                            // d3 = third digit of (four digit) number
                            for (int d3 = 1; d3 < pandigits.length; d3++) {
                                if (pandigits[d3]) {
                                    pandigits[d3] = false;
                                    
                                    // d4 = fourth digit of (four digit) number
                                    for (int d4 = 1; d4 < pandigits.length; d4++) {
                                        if(pandigits[d4]) {
                                            pandigits[d4] = false;
                                            int fourDigitNumber = 1000 * d1 + 100 * d2 + 10 * d3 + d4;
                                            
                                            int product = oneDigitNumber * fourDigitNumber;
                                            if (product > 9876) {
                                                pandigits[d4] = true;
                                                break;
                                            }
                                            
                                            // create & sort arrayList of digits in the product
                                            ArrayList<Integer> productDigits = new ArrayList<>();
                                            
                                            for (int i = product; i > 0; i /= 10) {
                                                productDigits.add(i % 10);
                                            }
                                            
                                            Integer[] productDigitsArray = new Integer[4];
                                            productDigits.toArray(productDigitsArray);
                                            Arrays.sort(productDigitsArray);
                                            
                                            // create arrayList of digits we haven't used in the multiplier or multiplicand
                                            ArrayList<Integer> pandigitsLeft = new ArrayList<>();
                                            for (int i = 0; i < pandigits.length; i++) {
                                                if (pandigits[i])
                                                    pandigitsLeft.add(i);
                                            }
                                            
                                            Integer[] pandigitsArray = new Integer[4];
                                            pandigitsLeft.toArray(pandigitsArray);
                                            
                                            if (Arrays.equals(pandigitsArray, productDigitsArray)) {
                                                System.out.println(oneDigitNumber + " * " + fourDigitNumber + " = " + product);
                                                if (!pandigitalProducts.contains(product)) {
                                                    pandigitalProducts.add(product);
                                                    sumOfPandigitalProducts += product;
                                                }
                                            }
                                            pandigits[d4] = true;
                                        }
                                    }
                                    pandigits[d3] = true;
                                }
                            }
                            pandigits[d2] = true;
                        }
                    }
                    pandigits[d1] = true;
                }
            }
        }
        System.out.println(sumOfPandigitalProducts);
    }
}
