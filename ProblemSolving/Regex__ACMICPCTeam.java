/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author sarthak sethi
 */
public class Regex__ACMICPCTeam {
     static int[] acmTeam(String[] topic ) {
        int[] ans = new int[2];
        BigInteger[] bi = new BigInteger[topic.length];
        for(int i=0;i<topic.length;i++)
        {
            bi[i] = new BigInteger(topic[i],2);
            }        
for(int i=0;i<topic.length-1;i++){
            for(int j=i+1;j<topic.length;j++){
            BigInteger no = bi[i].or(bi[j]);
            int currans = no.bitCount();
                if(ans[0]<currans){
                    ans[0] = currans; 
                    ans[1] = 1;
                }
                else if(ans[0] == currans){
                    ans[1]+=1;
                }
            }
            }
            return ans;
        }
}
