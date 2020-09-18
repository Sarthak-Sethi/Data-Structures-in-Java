
package ProblemSolving;
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class GameOfStacks {

    /*
     * Complete the twoStacks function below.
     * not solved yet
     * 
     */
    static int twoStacks(int x, int[] a, int[] b) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        int count = 0;
    for(int i=a.length-1;i>=0;i--)
    s1.push(a[i]);
    for(int i=b.length-1;i>=0;i--)
    s2.push(b[i]);
    while(x>0){
    if(s1.peek()>s2.peek()){
         if(x-s2.peek()<0)
         break;
        x-=s2.pop();
        count+=1;
    }
    else{
        if(x-s1.peek()<0)
        break;
        x-=s1.pop();
        count+=1;
    }
    }
return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      //  System.out.println(twoStacks(x, a, b));
    }
}
