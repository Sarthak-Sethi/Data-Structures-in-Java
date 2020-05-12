/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;
// has some bugs
public class BiggerisGreater {
    public static void main(String[] args) {
        String s = "dkhc";
        System.out.println(biggerIsGreater(s));
    }
        static String biggerIsGreater(String s) {
          int i=s.length()-1;
          int j= i-1;
          int k=1;
        while(k!=s.length())
        {
            System.out.print(s.charAt(i)+" ");
            System.out.print(s.charAt(j));
            System.out.println();
            if(s.charAt(i)>s.charAt(j)){
                System.out.println("char to be swapped "+s.charAt(i));
                System.out.println("char to be swapped "+s.charAt(j));
                return swap(s,j,i);
            }
            else{
                j--;
                if(j==-1){
                   i=s.length()-k-1;
                     j= i-1;
                     k++;
                     System.out.println("changing i to "+s.charAt(i));
                      System.out.println("changing j to "+s.charAt(j));
                }
            }
            }
        return "no answer";
    }

        static String swap(String str, int i, int j) 
    { 
        if (j == str.length() - 1) 
            return str.substring(0, i) + str.charAt(j) 
                + str.substring(i + 1, j) + str.charAt(i); 
  
        return str.substring(0, i) + str.charAt(j) 
            + str.substring(i + 1, j) + str.charAt(i) 
            + str.substring(j + 1, str.length()); 
    }
       static String reverse(String s){
            StringBuilder sb=new StringBuilder(s);  
    sb.reverse();  
    return sb.toString();  
       }
    }

