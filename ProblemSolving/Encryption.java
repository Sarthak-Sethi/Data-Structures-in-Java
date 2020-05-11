/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

/**
 *
 * @author sarthak sethi
 */
public class Encryption {
    
    public static void main(String[] args) {
        String s = "chillout";
        System.out.println(s.length());
        int row = (int)Math.floor(Math.sqrt(s.length()));
        int col =  (int)Math.ceil(Math.sqrt(s.length()));
        System.out.println(row);
        System.out.println(col);
        if(row*col<s.length())
        {
            if(row<col)
                row=col;
            else
                col=row;
        }
        Character storage[][] = new Character[row][col];
        int k=0;
        for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
               if(k<s.length()){
              storage[i][j]= s.charAt(k);
                   System.out.println("k is "+k);
              k++;
               }
               else {
                   System.out.println("in break");
                   break;
               }
           }
        }
         for(int i=0;i<row;i++){
           for(int j=0;j<col;j++){
               System.out.print(storage[i][j]);
           }
             System.out.println();
         }
         String ans ="";
         for(int i=0;i<col;i++){
             for(int j=0;j<row;j++){
                 if(storage[j][i]!=null)
                 ans+=storage[j][i];
             }
             ans+=" ";
         }
         System.out.println(ans);
    }
}
