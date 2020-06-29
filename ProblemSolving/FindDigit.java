/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

import java.util.ArrayList;

/**
 *
 * @author sarthak sethi
 */
public class FindDigit {
    public static void main(String[] args) {
        System.out.println(findDigits(121));
    }
        static int findDigits(int n) {
            int no = n;
        int ans =0;
        ArrayList<Integer> digit = new ArrayList<>();
        while(n>0) {
        digit.add(n%10);
        n= n/10;
    }
         //   System.out.println(digit);
            System.out.println(n);
    for(int i=0;i<digit.size();i++){
        try {
        if(no%digit.get(i)==0){
       //     System.out.println(digit.get(i));
            ans+=1;
        }
        }
        catch(Exception e){

        }
    }
    return ans;
    }
    
}
