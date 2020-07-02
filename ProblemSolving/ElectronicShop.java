/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

/**
 *
 * @author sarthak sethi
 */
public class ElectronicShop {
      static int getMoneySpent(int[] keyboards, int[] drives, int b) {
    int max = -1;

        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                if (keyboards[i] + drives[j] <= b && keyboards[i] + drives[j] > max)
                    max = keyboards[i] + drives[j];
            }
        }
        return max;
    }
    
}
