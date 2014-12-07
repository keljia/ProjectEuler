/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problems;

import ReusableStuff.ReusableMethods;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Kelly
 */
public class Problem179_ConsecutivePositiveDivisors_bad {
    public static void main (String[] args) {
        int[] arr = new int[(int)Math.pow(10, 7)];
        Arrays.fill(arr, 1);
        int total = 0;
        
        for (int i = 2; i < arr.length; i++) {
            for (int k = i; k < arr.length; k += i) {
                arr[k] += 1;
            }
            if (arr[i] == arr[i - 1])
                total++;
        }
        
        System.out.println(total);
    }
}
