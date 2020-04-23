/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Arraylist_linkedlist;

import java.util.Scanner;

public class Event {
   
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           String s = sc.nextLine(); 
                 int n = sc.nextInt();
 		
                 String[] str = new String[n];
                for(int i=0;i<str.length;i++)
                {
                    str[i] = sc.nextLine();  
                }
              char c1 = s.charAt(0);
               System.out.println(c1);
              char c2 = s.charAt(s.length()-1);
                System.out.println(c2);
              for (int i=0;i<str.length;i++)
              {  
                      if((str[i].charAt(0)==c1) && (str[i].charAt(str[i].length()-1)==c2)) {
                          System.out.println("yes"); }
                      else {
                          System.out.println("no");   }                                    
              }
       }           
    }
    

