
package ProblemSolving;
import java.math.BigDecimal;
import java.util.Scanner;
/**
 *
 * @author sarthak sethi
 */
public class MULTIPLEof3 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int size = s.nextInt();
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        int i=2;
        String number = String.valueOf(n1) + String.valueOf(n2);
        int prevsum = n1+n2;
        while(i<7){     
            if(prevsum <10)
            {  
                int nxtno = prevsum; 
                prevsum += nxtno; 
                number = number + String.valueOf(nxtno);
            }
            else {
                int nxtno = (prevsum)%10;
                  number = number + String.valueOf(nxtno);
                  prevsum += nxtno;
            }
            i++;
        }
        int sum = n1+n2;
        int psum = 0;
        System.out.println(number);
        String pattern = number.substring(3);
        for(int j=0;j<pattern.length();j++){
            psum+=Integer.parseInt(String.valueOf(pattern.charAt(j)));
        }
        psum= ((size-3)/4)*psum;
        int ei =(size-3)%4;
       String lastno =pattern.substring(0,ei);
       for(int k=0;k<lastno.length();k++){
           sum+=Integer.parseInt(String.valueOf(lastno.charAt(k)));
       }
       sum+=psum;
       String ssum = String.valueOf(sum);
        BigDecimal b1 = new BigDecimal(sum);
        BigDecimal ans = b1.remainder(new BigDecimal("3"));
           System.out.println(ans);
       }
    }
    
