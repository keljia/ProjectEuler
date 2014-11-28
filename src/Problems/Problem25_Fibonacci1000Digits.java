/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problems;

import java.math.BigInteger;
import java.util.ArrayList;

/**
 *
 * @author Kelly
 */
public class Problem25_Fibonacci1000Digits {
    public static void main(String[] args) {
        ArrayList<BigInteger> numbers = new ArrayList<BigInteger>();        
        numbers.add(BigInteger.ONE);
        numbers.add(BigInteger.ONE);
        
        // While the largest fibonnaci number has less than 1000 digits
        while (numbers.get(numbers.size() - 1).compareTo(BigInteger.TEN.pow(999)) == -1) {
            numbers.add(numbers.get(numbers.size() - 1).add(numbers.get(numbers.size() - 2)));
        }
        
        System.out.println(numbers.size());
    }
}
