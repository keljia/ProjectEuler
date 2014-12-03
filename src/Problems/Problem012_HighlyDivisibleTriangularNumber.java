/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problems;

/**
 *
 * @author Kelly
 */
public class Problem012_HighlyDivisibleTriangularNumber {
    public static void main (String[] args) {
        int triangleNumber = 0;
        int mostDivisors = 0;
        int i = 1;
        
        while (mostDivisors < 500) {
            triangleNumber += i;
            i++;
            int divisors = countDivisors(triangleNumber);
            if (divisors > mostDivisors) {
                mostDivisors = divisors;
            }
        }
        
        System.out.println ("i = " + i + ", triangleNumber = " + triangleNumber + ", # of divisors = " + mostDivisors);
    }
    
    // this only works because they're not square numbers; we don't have to consider sqrt n being a factor
    public static int countDivisors(int n) {
        int numberOfDivisors = 0;
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                numberOfDivisors++;
            }
        }
        
        return numberOfDivisors * 2;
    }
}
