/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

import java.util.Scanner;

/**
 *
 * @author sarthak sethi
 *  ans sahi aa rha bas number format exception aa rhi
 * ans iska 1 line k sol h vo samjh nhi aaya
 * static long flippingBits(long n) {
        long maxInt = (long)Math.pow(2, 32)-1;
        return maxInt - n;
    }
 */
public class BinaryToDecimal32bit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        flippingBits(n);
    }
    static long flippingBits(long n) {
        long Binary[] = converter(n);
        for(int i=0;i<Binary.length;i++){
            if(Binary[i]==1)
                Binary[i] =0;
            else
                Binary[i] =1;
        }
        String ans = "";
        for(int i=0;i<Binary.length;i++){
            ans+=Binary[i];
        }
       int fans = Integer.parseInt(ans);
       return (long)fans;
        

    }
    public static long[] converter(long no){
        long binary[] = new long[32];
        int i=0;
        while(no!=0){
            binary[i]=no%2;
            no=no/2;
            i++;
        }
        reverse(binary);
        return binary;
        
    }
    public static void reverse(long[] input) { 
        int last = input.length - 1;
     int middle = input.length / 2;
     for (int i = 0; i <= middle; i++) 
     { 
         long temp = input[i]; 
     input[i] = input[last - i]; 
     input[last - i] = temp; 
    } 
}
}
