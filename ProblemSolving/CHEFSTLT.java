package codeshef;
import java.util.*;
public class CHEFSTLT {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 int t = sc.nextInt();
     for(int i=0;i<t;i++){
	String s1 = sc.nextLine();
	String s2 = sc.nextLine();
	compare(s1,s2);
     }
}

private static void compare(String s1, String s2) {
	int max = 0;
	int min = 0;
	
	for(int i=0;i<s1.length();i++) {
		if(s1.charAt(i)=='?' && s2.charAt(i)=='?') { 
			//System.out.println("first if");
			max+=1;
		}
		else if(s1.charAt(i)=='?' || s2.charAt(i)=='?') {
			System.out.println("sec if");
			max+=1;
		}
		else if(s1.charAt(i)!=s2.charAt(i)) {
			System.out.println("thu if");
			min+=1; max+=1;
		}
		else if(s1.charAt(i)==s2.charAt(i)) {
			System.out.println("4 if");
			max+=1;
			}
		else
			System.out.println("fuck off");
	System.out.println(min+" "+max);
	}
}
}

