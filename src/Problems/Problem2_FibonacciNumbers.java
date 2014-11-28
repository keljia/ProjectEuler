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
public class Problem2_FibonacciNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();        
        numbers.add(1);
        numbers.add(1);
        
        // put all of the fibonacci numbers in the arraylist
        for (int i = 1; numbers.get(i) < 4000000; i++) {
            numbers.add(numbers.get(i) + numbers.get(i - 1));
        }
        
        int sum = 0;
        // add together all of the even ones.
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) % 2 == 0) {
                sum += numbers.get(i);
            }
        }
        
        System.out.println(sum);
    }
}
