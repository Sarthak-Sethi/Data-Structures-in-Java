/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture4recursion;

import java.util.Scanner;

/**
 *
 * @author sarthak sethi
 */
public class Code 
{
    public static  String[] getCode(String input){
		// Write your code here
       String[] ans = new String[10];
       
       if(input.length()<=1) {
           int baseans = Integer.parseInt(input);
          ans[0]=help(baseans);
          return ans;
       }
            //String ans1 ;
		String temp = input.substring(1);
       String[] smallans = getCode(temp);
       for(int i=0;i<ans.length;i++)
       {
           ans[i]=help(input.charAt(0))+smallans[i];
       }
           if(input.length()>=2)
           {
               int comp = Integer.parseInt(input.substring(2));
               if(comp>=10 && comp<=26)
               { for(int i=0;i<ans.length;i++)
                   ans[smallans.length+i]=help(Integer.parseInt(input.substring(0,2)))+getCode(input.substring(2));
               }
           }
  
return ans;
	}
    public static String help(int input)
        {
            String ans = "";
            switch(input)
            {
                case 1 :
                    ans =  "a";
                    break ;
                case 2 :
                    ans =  "b";
                    break;
                case 3 :
                    ans = "c";
                    break;
                case 4:
                    ans = "d";
                    break ; 
                case 5 :
                   ans = "e";
                    break ;
                case 6 :
                    ans = "f";
                    break ;
                case 7 :
                    ans = "g";
                    break;
                case 8 :
                    ans = "h";
                    break ;
                case 9 :
                    ans ="i";
                    break ;
                case 10 :
                    ans ="j";
                    break ;
                case 11 :
                    return "k";
                case 12 :
                   ans = "l";
                    break;
                case 13 :
                    ans =  "m";
                    break;
                case 14 :
                    ans = "n";
                    break;
                case 15 :
                    ans = "o";
                    break;
                case 16 :
                    ans = "p";
                    break;
                case 17 :
                    ans = "q";
                    break;
                case 18 :
                    ans = "r";
                    break;
                case 19 :
                    ans= "s";
                    break;
                case 20 :
                    ans = "t";
                    break;
                case 21 :
                    ans = "u";
                    break;
                case 22 :
                    ans = "v";
                    break;
                case 23 :
                    ans = "w";
                    break;
                case 24 :
                    ans = "x";
                    break;
                case 25 :
                    ans = "y";
                    break;
                case 26 :
                    ans = "z";
                    break;
            }
            return ans;
        }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		String input = s.next();
		String output[] = getCode(input);
		for(int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
    }
}
}
