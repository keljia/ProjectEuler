/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Kelly
 */
public class Problem099_LargestExponential {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("p099_base_exp.txt"));
        int largestExponentialLine = 0;
        double largestExponential = 0.0;
        int i = 1;
        while(scan.hasNextLine()) {
            String numbers = scan.nextLine();
            String[] numbersArray = numbers.split(",");
            double exponential = Math.log(Integer.valueOf(numbersArray[0])) * Integer.valueOf(numbersArray[1]);
            if (exponential > largestExponential) {
                largestExponential = exponential;
                largestExponentialLine = i;
            }
            i++;
        }
        System.out.println(largestExponentialLine);
    }
}
