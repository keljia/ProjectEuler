/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Problems;

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Kelly
 */
public class Problem42_CodedTriangleNumbers {
    public static void main (String[] args) throws FileNotFoundException {
        ArrayList<Integer> triangleNumbers = new ArrayList<Integer>();
        int numberOfTriangleWords = 0;
        
        for (int i = 1; i < 20; i++) {
            triangleNumbers.add(i * (i + 1) / 2);
        }
        
        Scanner scan = new Scanner(new File("p042_words.txt"));
        String allWords = scan.nextLine();
        String[] wordArray = allWords.split("\",\"");
        for (String i : wordArray) {
            int score = 0;
            for (int j = 0; j < i.length(); j++) {
                char letter = i.charAt(j);
                int letterValue;
                
                // <editor-fold defaultstate="collapsed" desc="Switch from chars to numbers">
                switch (letter) {
                    case 'A': 
                        letterValue = 1;
                        break;
                    case 'B':
                        letterValue = 2;
                        break;
                    case 'C':
                        letterValue = 3;
                        break;
                    case 'D': 
                        letterValue = 4;
                        break;
                    case 'E':
                        letterValue = 5;
                        break;
                    case 'F':
                        letterValue = 6;
                        break;
                    case 'G':
                        letterValue = 7;
                        break;
                    case 'H':
                        letterValue = 8;
                        break;
                    case 'I':
                        letterValue = 9;
                        break;
                    case 'J': 
                        letterValue = 10;
                        break;
                    case 'K': 
                        letterValue = 11;
                        break;
                    case 'L': 
                        letterValue = 12;
                        break;
                    case 'M': 
                        letterValue = 13;
                        break;
                    case 'N': 
                        letterValue = 14;
                        break;
                    case 'O': 
                        letterValue = 15;
                        break;
                    case 'P': 
                        letterValue = 16;
                        break;
                    case 'Q': 
                        letterValue = 17;
                        break;
                    case 'R': 
                        letterValue = 18;
                        break;
                    case 'S': 
                        letterValue = 19;
                        break;
                    case 'T':
                        letterValue = 20;
                        break;
                    case 'U':
                        letterValue = 21;
                        break;
                    case 'V':
                        letterValue = 22;
                        break;
                    case 'W':
                        letterValue = 23;
                        break;
                    case 'X':
                        letterValue = 24;
                        break;
                    case 'Y':
                        letterValue = 25;
                        break;
                    case 'Z':
                        letterValue = 26;
                        break;
                    default:
                        letterValue = 0;
                        break;
                }
                
                // </editor-fold>
                
                score += letterValue;
            }
            if (triangleNumbers.contains(score)) {
                numberOfTriangleWords++;
            }
        }
        System.out.println(numberOfTriangleWords);
    }
}
