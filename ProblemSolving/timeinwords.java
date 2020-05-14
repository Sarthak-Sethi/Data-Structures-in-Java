package ProblemSolving;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class timeinwords {
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int m = s.nextInt();
        System.out.println(timeInWords(h, m));
    }
    static String timeInWords(int h, int m) {
      String ans="";
      if(m==00){
          return getword(h)+ "o' clock";
      }if(m==15){
            return "quarter past "+getword(h);
        }
      if(m==20){
          return "twenty minutes past "+getword(h);
      }
        if(m==30){
            return "half past "+getword(h);
        }
        if(m<30){
            String minutes = String.valueOf(m);
        if(minutes.charAt(0)=='0'){
            ans+=getword(Integer.parseInt(String.valueOf(minutes.charAt(1))));
            ans+=" minutes past "+getword(h);
            return ans;   
        }
        if(minutes.charAt(0)=='1'){
            ans+=getword(m);
             ans+=" minutes past "+getword(h);
            return ans;   
        }
        else{
            return "twenty "+getword((Integer.parseInt(String.valueOf(minutes.charAt(1)))))+ " minutes past "+getword(h);
        }
        }
        if(m>30){
            if(m==40){
               return "twenty minutes to "+getword(h+1); 
            }
            if(m==50){
           return "ten minutes to "+getword(h+1); 
            }
            if(m==45){
                return "quarter to "+getword(h+1);
            }
            else{ // the 
                m=60-m;
                if(m==00){
          return getword(h+1)+ "o' clock";
      }if(m==15){
            return "quarter to "+getword(h+1);
        }
      if(m==20){
          return "twenty minutes to "+getword(h+1);
      }
        if(m<30){
            String minutes = 0+String.valueOf(m);
            System.out.println(m);
        if(minutes.charAt(0)=='0'){
            ans+=getword(Integer.parseInt(String.valueOf(minutes.charAt(1))));
            ans+=" minutes to "+getword(h+1);
            return ans;   
        }
        if(minutes.charAt(0)=='1'){
            ans+=getword(m);
             ans+=" minutes to "+getword(h+1);
            return ans;   
        }
        else{
            return "twenty "+getword((Integer.parseInt(String.valueOf(minutes.charAt(1)))))+ " minutes to "+getword(h+1);
        }
        }
            }
        }
        return ans;
    }
    static String getword(int n){
        HashMap<Integer,String> map = new HashMap<>();
         map.put(1,"one");
         map.put(2, "two");
         map.put(3, "three");
         map.put(4, "four");
         map.put(5, "five");
         map.put(6,"six");
         map.put(7,"seven");
         map.put(8,"eight");
         map.put(9,"nine");
         map.put(10, "ten");
         map.put(11, "eleven");
         map.put(12, "twelve");
         map.put(13, "thirteen");
         map.put(14, "fourteen");
         map.put(15, "fifteen");
         map.put(16, "sixteen");
         map.put(17, "seventeen");
         map.put(18, "eighteen");
         map.put(19, "nineteen");
         return map.get(n);
    }
}
