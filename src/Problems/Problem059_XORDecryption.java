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
public class Problem059_XORDecryption {
    public static void main (String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("p059_cipher.txt"));
        String s = scan.next();
        String[] encrypted = s.split(",");
        
        // Encryption keys figured out through earlier program
        char encrypt1 = 'g';
        char encrypt2 = 'o';
        char encrypt3 = 'd';
        
        int total = 0;
        
        for (int i = 0; i < encrypted.length; i++) {
            if (i % 3 == 0) {
                total += (encrypt1 ^ Integer.parseInt(encrypted[i]));
            } else if (i % 3 == 1) {
                total += (encrypt2 ^ Integer.parseInt(encrypted[i]));
            } else {
                total += (encrypt3 ^ Integer.parseInt(encrypted[i]));
            }
        }
        System.out.println(total);
    }
}
