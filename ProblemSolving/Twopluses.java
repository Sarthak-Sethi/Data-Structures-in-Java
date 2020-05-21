/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

import java.util.Scanner;

/**
 *
 * @author sarthak sethi
 * // it passes 10 test cases
 */
public class Twopluses {
    public static void main(String[] args) {
        String[] arr = new String[10];
        Scanner s = new Scanner(System.in);
        for(int i=0;i<10;i++){
            arr[i] = s.nextLine();
        }
//        for(int i=0;i<7;i++){
//            System.out.println(arr[i]);
//        }
        int ans = twoPluses(arr);
        System.out.println(ans);
    }
     static int twoPluses(String[] grid) {
        int row = grid.length;
        int col = grid[0].length();
       Character[][] board = new Character[row][col];
       for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
               board[i][j] = grid[i].charAt(j);
           }
       }
        // for(int i=0;i<row;i++){
        //    for(int j=0;j<col;j++){
        //        System.out.print(board[i][j]+" ");
        //    }
        //    System.out.println();
        // } '
                    int maxarea = 1;
                    int smaxarea = 1;
    for(int i=1;i<row;i++){
        for(int j=1;j<col;j++){
            if(board[i][j]=='G'){
                int a=1,b=1;
                while(i-a>=0 && i+a<row && j-a>=0 && j+a<col){
                   try{
                if(board[i-a][j]=='G' && 
                board[j-a][i] == 'G' 
                && board[i+a][j]=='G' &&
                board[j+a][i] == 'G'
                ){
            //        if(a%2!=0){
                        int temp =(a*4)+1;
                        if(temp>=maxarea){                            
                            smaxarea = maxarea; 
                            maxarea = temp;
                        }
                        else if(temp>=smaxarea){
                            smaxarea = temp;
                        }
              //      }
                    a++;
                }
                  
                else
                break;
                  }// try break
                  catch(Exception e){
                      break;
                  }
                }
            }
        }
    }
        
        return maxarea*smaxarea;
    }

    
}
