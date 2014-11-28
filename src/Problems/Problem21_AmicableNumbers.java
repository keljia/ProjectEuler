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
public class Problem21_AmicableNumbers {
    public static void main (String[] args) {
        int sumOfAmicableNumbers = 0;
        for (int i = 2; i < 10000; i++) {
            int divisors = sumDivisors(i);
            if (divisors > i) {
                if (sumDivisors(divisors) == i) {
                    sumOfAmicableNumbers += (divisors + i);
                    System.out.println(i + "\t" + divisors);
                }
            }
        }
        
        System.out.println(sumOfAmicableNumbers);
    }
    
    public static int sumDivisors (int n)  {
        int sumOfDivisors = 0;
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                sumOfDivisors += (i + (n / i));
            }
        }
        
        if ((int)Math.sqrt(n) == Math.sqrt(n)) {
            sumOfDivisors += Math.sqrt(n);
        }
        
        return sumOfDivisors - n;
    }
}
