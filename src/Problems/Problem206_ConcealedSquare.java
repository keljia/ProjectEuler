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
public class Problem206_ConcealedSquare {
    static int theNumberWeWant;
    public static void main (String[] args) {
        for (int i = (int)Math.pow(10, 7); i < Math.sqrt(2) * Math.pow(10, 7); i++) {
            if(check(10 * i + 3))
                break;
            if(check(10 * i + 7))
                break;
        }
        
        System.out.println(theNumberWeWant);
    }
    
    public static boolean check (int a) {
        long square = (long)a * a;
        if ((int)((square / Math.pow(10, 14)) % 10) != 2)
            return false;
        if ((int)((square / Math.pow(10, 12)) % 10) != 3) 
            return false;
        if ((int)((square / Math.pow(10, 10)) % 10) != 4) 
            return false;
        if ((int)((square / Math.pow(10, 8)) % 10) != 5)
            return false;
        if ((int)((square / Math.pow(10, 6)) % 10) != 6)
            return false;
        if ((int)((square / 10000) % 10) != 7)
            return false;
        if ((int)((square / 100) % 10) != 8)
            return false;
        theNumberWeWant = a;
        return true;
    }
}
