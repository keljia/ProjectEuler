/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problems;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Kelly
 */
public class Problem089_RomanNumerals {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("p089_roman.txt"));
        int savedLetters = 0;
        while (scan.hasNext()) {
            String numeral = scan.next();
            int oldLength  = numeral.length();
            numeral = numeral.replace("IIII", "IV");
            numeral = numeral.replace("VIV", "IX");
            numeral = numeral.replace("XXXX", "XL");
            numeral = numeral.replace("LXL", "XC");
            numeral = numeral.replace("CCCC", "CD");
            numeral = numeral.replace("DCD", "CM");
            int newLength = numeral.length();
            savedLetters += (oldLength - newLength);
        }
        
        System.out.println(savedLetters);
    }
}
