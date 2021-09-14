package codeshef;
import java.util.*;
public class josephus_problem {
	 public int findTheWinner(int n, int k) {
	        ArrayList<Integer> al = new ArrayList<>();
	        for(int i=1;i<=n;i++)
	            al.add(i);
	        int i=0;
	        while(true){
	            i= (i+k-1)%n;
	            //https://www.youtube.com/watch?v=dzYq5VEMZIg
	            if(al.size()==1) 
	                return al.get(0);
	            al.remove(i);
	            n--;
	        }
	    }
}

