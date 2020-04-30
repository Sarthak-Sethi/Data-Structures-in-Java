/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

/**
 *
 * @author sarthak sethi
 */

import java.io.*;


public class QueensAttack {

    // Complete the queensAttack function below.
    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obs) {
        int rq = r_q-1;
        int cq = c_q-1;   
        int lr = 0;
        int ud = 0; 
        int[][] board = new int[n][n];
        int count = 0;
        if(k==0){
             ud+=n-1;
             lr +=n-1;
        }else{
        int orow = obs.length;
        int ocol = obs[0].length;
        for(int i=0;i<orow;i++){
            for(int j=0;j<ocol;j++){
                obs[i][j]-=1;
            }
        }
       
        for(int i=0;i<orow;i++){
            if(obs[i][0]==rq){
                if(obs[i][1]<cq){
                    int temp = n-1-obs[i][1]-1;
                    lr+=temp;  
                }else{
                    int temp = n-1-(n-obs[i][1]);
                    lr+=temp;
                   
                }
                break;
            }
        }

       System.out.println("lr"+lr);
        // for up tp down
        for(int i=0;i<orow;i++){
            if(obs[i][1]==cq){
                if(obs[i][0]<rq){
                   int temp = n-1-(obs[i][0]+1);
                    ud+=temp; 
                    
                }else{
                    int temp = n-1-(n-obs[i][0]);
                    ud+=temp;
                }
            }         
        }
        }    
        // System.out.println("ud"+ud);
        // diagonals
        for(int i=0;i<obs.length;i++){
                int obsi = obs[i][0];
                int obsj = obs[i][1];
                board[obsi][obsj] = -1;
        }
            int lu=0;
            int ru = 0;
            int ld = 0;
            int rd= 0;
            int i = rq-1;
            int j= cq-1;
            while(i>=0 && j>=0){
                 if(board[i][j]==-1)
                    break;
                 else
                   lu+=1; 
                 i--;
                 j--;
            }
           // System.out.println("lu "+lu);
            i = rq-1;
            j=cq+1;
            while(i>=0 && j<n){
                 if(board[i][j]==-1)
                    break;
                 else
                   ru+=1; 
                 i--;
                 j++;
            }
            //System.out.println("ru"+ru);
            
         i=rq+1;
         j= cq-1;
            while(i<n && j>=0){
                 if(board[i][j]==-1)
                    break;
                 else
                   ld+=1; 
                 i++;
                 j--;
            }
            
            i = rq+1;
            j= cq+1;
            while(i<n && j<n){
                if(board[i][j]==-1)
                    break;
                 else
                   rd+=1; 
                 i++;
                 j++;
            }
            

            count = ld+rd+lu+ru+lr+ud;
    return count;
    }

    

    public static void main(String[] args) throws IOException {
        int[][] obs = new int[3][2];
        obs[0][0] = 0;
        obs[0][1] = 3;
        obs[1][0] = 1;
        obs[1][1] = 1;
        obs[2][0] = 2;
        obs[2][1] = 3;
       
        System.out.println(queensAttack(4, 3, 4, 4, obs)) ;
    }
}
