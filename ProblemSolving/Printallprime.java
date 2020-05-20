/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Univ;

import java.util.Scanner;

/**
 *
 * @author sarthak sethi
 */
public class Printallprime {
    public static void main(String[] args) {
        int n,p;
        Scanner s = new Scanner(System.in);
        n= s.nextInt();
        p = s.nextInt();
        printall(n,p);
    }
    static void printall(int a,int b){
        if(a==1 || a==2) 
            System.out.println("1");
        if(a%2==0)
            a++;
        for(int i=a;i<=b;i=i+=2){
            boolean flag = true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    flag = false;
                    break; 
                }
            }
            if(flag)
                System.out.println(i);
        }
    }
}
