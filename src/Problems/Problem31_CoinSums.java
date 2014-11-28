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
public class Problem31_CoinSums {
    public static void main (String[] args) {
        // 200p, 100p, 50p, 20p, 10p, 5p, 2p, (1p)
        
        int numberOfWays = 0;
        for (int numberOf200p = 1; numberOf200p >= 0; numberOf200p--) {
            int munniLeft = 200 - (200 * numberOf200p);
            for (int numberOf100p = munniLeft / 100; numberOf100p >= 0; numberOf100p--) {
                int munniLeft2 = munniLeft - 100 * numberOf100p;
                for (int numberOf50p = munniLeft2 / 50; numberOf50p >= 0; numberOf50p--) {
                    int munniLeft3 = munniLeft2 - 50 * numberOf50p;
                    for (int numberOf20p = munniLeft3 / 20; numberOf20p >= 0; numberOf20p--) {
                        int munniLeft4 = munniLeft3 - 20 * numberOf20p;
                        for (int numberOf10p = munniLeft4 / 10; numberOf10p >= 0; numberOf10p--) {
                            int munniLeft5 = munniLeft4 - 10 * numberOf10p;
                            for (int numberOf5p = munniLeft5 / 5; numberOf5p >= 0; numberOf5p--) {
                                int munniLeft6 = munniLeft5 - 5 * numberOf5p;
                                for (int numberOf2p = munniLeft6 / 2; numberOf2p >= 0; numberOf2p--) {
                                    numberOfWays++;
                                }
                            }
                        }
                    }
                }
            }
        }
        
        System.out.println(numberOfWays);
    }
}
