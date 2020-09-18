/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving.GFG;

/**
 *
 * @author sarthak sethi
 */
public class Perumtation_of_string {
    public static void main(String[] args) {
        System.out.println(findperm("ABC"));
    }
    public static int findperm(String s){
        if(s.length()==0){
            return 0;
        }
        int ans =0;
        for(int i=0;i<s.length()-1;i++){
            ans += findperm(s.substring(i+1)); 
        }
        return ans;
    }
    
}
