/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

import java.util.ArrayList;
import java.util.Scanner;
import java.math.RoundingMode;  
//import com.google.common.math.IntMath;    

/**
 *
 * @author sarthak sethi
 */
public class PrimeSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(noofprimeno(n));
        //System.out.println(isPrime(n));
       
    }
    public static int noofprimeno(int n){
            ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> primenosList = new ArrayList<>();
        for(int i=0;i<=n;i++){
            if(isPrime(i)){
              primenosList.add(i);  
            }
        } int num = 0;
//        for(int i=0;i<primenosList.size();i++){
//            System.out.print(primenosList.get(i)+" ");
//            //System.out.print("ends");
//        }
        int dontgo = 0;
        for(int i=0;i<primenosList.size();i++){
            num = primenosList.get(i)+num;
            System.out.println(num);
            if(num>=n){
                num=0;
            }
//            if(num==primenosList.get(i)){
//             continue;   
//            } 
            else if(isPrime(num)){
                System.out.println("it is ans "+num);
               ans.add(num);
            }
        }
        
       // System.out.println("final ans "+ans.size());
        return ans.size();
    }
    static boolean isPrime(int n) 
    { 
        // Corner case 
        if (n <= 1) 
            return false; 
        for (int i = 2; i < n; i++) 
            if (n % i == 0) 
                return false; 
  
        return true; 
    } 
   
}
