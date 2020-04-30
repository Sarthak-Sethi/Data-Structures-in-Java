/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

import java.io.*;
import java.util.Scanner;

 class submatrix{
    public static void main(String[] args) throws IOException{
        Scanner s  = new Scanner(System.in);
        System.out.println("Enter the size of matrix ");
        int row = s.nextInt();   
        int col = s.nextInt();
        int mat[][] = new int[row][col];
        System.out.println("Enter the value of matrix ");
        for (int i=0 ; i<row;i++)
        {
            for (int j=0;j<col;j++)
            {  
               mat[i][j]  = s.nextInt();      
            } 
        }
        System.out.println("Enter the submatrix size");
        int subrow = s.nextInt();   
        int subcol = s.nextInt();
        System.out.println("The submatrix is ");
        for (int i=0;i<subrow;i++)
        {
            for (int j=0;j<subcol;j++)
            {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}