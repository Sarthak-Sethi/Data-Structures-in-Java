/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving.GFG;

/**
 *
 * @author sarthak sethi
 */
public class RotateMatrix {
    static void rotate(int arr[][]) 
    {
        int row = arr.length;
        int col = arr[0].length;
        //transpose
        // for(int i=0;i<row;i++){
        //     for(int j=i;j<col;j++){
        //         int temp = arr[i][j];
        //         arr[i][j] = arr[j][i];
        //         arr[j][i] = temp;
        //     }
        // }
        
        //now take reverse rowa
        for(int i=0;i<row;i++){
            int l = 0;
            int h = row-1;
            while(l<h){
            int temp = arr[i][l];
            arr[i][l] = arr[i][h];
            arr[i][h] = temp;
            l++;
            h--;
            }
         }
         // for transpose
          for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    
}
