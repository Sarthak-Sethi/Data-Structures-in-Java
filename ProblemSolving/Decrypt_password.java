package ProblemSolving;


import java.util.Stack;


public class Decrypt_password {
    public static void main(String[] args) {
        System.out.println(decryptPassword("pTo*Ta*O"));
    }
  public static String decryptPassword(String s) {
       Stack<Character> stack = new Stack<>();
       int i=0;
       while(!Character.isAlphabetic(s.charAt(i)) &&
           Character.isDigit(s.charAt(i))){
            stack.push(s.charAt(i));
            i++;
       }
        String ans = "";
      //  String temp ="";
        //int i=0;
        while(i<s.length()){
            boolean flag=false;
            if(i<s.length()-2){
                System.out.println("i is "+i);
            if(!Character.isDigit(s.charAt(i)) && Character.isUpperCase(s.charAt(i)) && 
            Character.isLowerCase(s.charAt(i+1))){
                ans+=s.charAt(i+1);
                ans+=s.charAt(i);
             //   ans+="*";
                System.out.println("here "+ans);
             flag= true;
             i=i+2;   
            }
            
            //System.out.println(s.charAt(i));
            }
            if(s.charAt(i)=='*') {
                System.out.println("star ");
              i=i+1;
              flag = true;
            //    System.out.println(s.charAt(i)=='0');
                
            }
            if(s.charAt(i)=='0'){
                ans+=stack.pop();
                System.out.println("digit "+ans);
                i=i+1;
                flag = true;
            }
            else {
                System.out.println(" else ");
                ans+=s.charAt(i);
                i=i+1;
            }
        }
        return ans;
    // Write your code here

    }
}
