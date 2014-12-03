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

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Problem022_NameScores {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("p022_names.txt"));
        String allNames = scan.nextLine();
        String[] nameArray = allNames.split("\",\"");
        nameArray[0] = nameArray[0].substring(1);
        nameArray[nameArray.length - 1] = nameArray[nameArray.length - 1].substring(0, nameArray[nameArray.length - 1].length() - 1);
        Arrays.sort(nameArray);

        int sumOfScores = 0;
        
        for (int i = 0; i < nameArray.length; i++) {
            String name = nameArray[i];
            int score = 0;
            for (int j = 0; j < name.length(); j++) {
                char letter = name.charAt(j);
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
                        letterValue = 1;
                        break;
                }
                
                // </editor-fold>
                
                score += letterValue;
            }
            score *= (i + 1);
            sumOfScores += score;
        }
        
        System.out.println(nameArray.length);
        System.out.println(sumOfScores);
    }
}
