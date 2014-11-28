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
public class Problem19_CountingSundays {
    public static void main (String[] args) {
        int[][] daysInMonths = new int[100][12];
        
        // put all of the number of days for each month in the correct cells
        for (int i = 0; i < daysInMonths.length; i++) {
            for (int j = 0; j < daysInMonths[i].length; j++) {
                switch (j) {
                    case 0:  daysInMonths[i][j] = 31;
                             break;
                    case 1:  daysInMonths[i][j] = 28;
                             break;
                    case 2:  daysInMonths[i][j] = 31;
                             break;
                    case 3:  daysInMonths[i][j] = 30;
                             break;
                    case 4:  daysInMonths[i][j] = 31;
                             break;
                    case 5:  daysInMonths[i][j] = 30;
                             break;
                    case 6:  daysInMonths[i][j] = 31;
                             break;
                    case 7:  daysInMonths[i][j] = 31;
                             break;
                    case 8:  daysInMonths[i][j] = 30;
                             break;
                    case 9:  daysInMonths[i][j] = 31;
                             break;
                    case 10: daysInMonths[i][j] = 30;
                             break;
                    case 11: daysInMonths[i][j] = 31;
                             break;
                }
            }
        }
        
        // leap years
        for (int i = 3; i < daysInMonths.length; i +=4) {
            daysInMonths[i][2] = 29;
        }
        
        int totalDays = -1;
        int numberOfSundays = 0;
        
        for (int i = 0; i < daysInMonths.length; i++) {
            for (int j = 0; j < daysInMonths[i].length; j++) {
                totalDays += daysInMonths[i][j];
                if (totalDays % 7 == 0) {
                    numberOfSundays++;
                }
            }
        }
        
        System.out.println(numberOfSundays);
    }
}
