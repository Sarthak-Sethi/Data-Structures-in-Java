/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture4recursion;

/**
 *
 * @author sarthak sethi
 */
public class test2 {
    public static void main(String[] args) {
       String[][] ans=new String[1][1];
       ans[0][0]= "a";
     System.out.print(ans[0]);
    }
    //   System.out.print();
    
}
public static void permutations(String input)
    {
		// Write your code here
          permutations(input,"");
	}
    public static void permutations(String input , String ans)
    {
      if (input.length() == 0) { 
            System.out.println(ans); 
            return; 
        } 
  
        for (int i = 0; i < input.length(); i++) { 
          char ch = input.charAt(i); 
   
            String temp = input.substring(0, i) +  
                         input.substring(i + 1); 
  
        permutations(temp, ans + ch); 
        } 

    }