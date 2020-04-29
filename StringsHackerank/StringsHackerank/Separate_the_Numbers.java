/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StringsHackerank;

/**
 *
 * @author sarthak sethi
 */
public class Separate_the_Numbers {
    public static void main(String[] args) {
        separateNumbers("91011");
    }
     static void separateNumbers(String s) {
         String ans="",firstno="";
         boolean b = false;
         for(int i=1;i<=s.length()/2;i++){
              firstno = s.substring(0,i);
             long num = Long.parseLong(firstno);
              ans = firstno;
             while(ans.length()<s.length()){
                 ans+=Long.toString(++num);
             }
              if(ans.equals(s)){
                  b=true;
                 System.out.println("YES "+firstno);
              }
         }
         if(!b)
             System.out.println("NO");
        
    }

}
