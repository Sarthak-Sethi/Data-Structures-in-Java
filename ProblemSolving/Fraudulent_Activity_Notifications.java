/*
 * passes the sample test cases
 * gives tle for rest
 * 
 * 
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

import java.util.Arrays;

public class Fraudulent_Activity_Notifications {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,4};
    System.out.println (activityNotifications(a, 4));
    }
        static int activityNotifications(int[] exp, int d) {
        int ans = 0;
        int j=0;
            for(int i=d;i<exp.length;i++){
                    double median = findmedian(exp,j,d+j-1);
                    j++;
                    System.out.println("median is "+median);
                    if(exp[i]>=2*median){
                        System.out.println("added ans for "+exp[i]);
                    ans++;
                    }
                }
        return ans;
}

    private static double findmedian(int[] exp, int si, int ei) {
        int[] sort =  Arrays.copyOfRange(exp, si, ei);
            Arrays.sort(sort);
        if((ei-si)%2!=0){
            // even 
            System.out.println("even me");
             System.out.println("si is "+si+" ei is "+ei);
            int midindex = (sort.length)/2;
            System.out.println("avg of "+sort[midindex]+" and "+sort[midindex+1]);
          double avg = (1.0)*(sort[midindex]+sort[midindex+1])/2.0;
          return avg;
        }
        else{ 
             System.out.println("odd me");
             System.out.println("si is "+si+" ei is "+ei);
            int midindex = (sort.length)/2;
            return sort[midindex];
        }
    }
}
