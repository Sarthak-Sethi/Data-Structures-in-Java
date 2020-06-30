/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

/**
 *
 * @author sarthak sethi
 */
public class Taumandbday {
    public static long taumBday(int b, int w, int bc, int wc, int z) {
        long ans = 0;
        if(bc+z<wc){
             System.out.println("here");
            ans = ((long)b*bc + (long)(bc+z)*w) ;
        }
        else if(wc+z<bc){

            long s = (long)w*wc ;
            long p = (long)(wc+z)*b;
            ans = (s+p)  ;
        }
        else {
            System.out.println("here");
            long s = (long)b*bc;
            System.out.println(s);
            long p = (long)w*wc;
            System.out.println(p);
            ans = s+p;
        }
    return ans;
    }
}
