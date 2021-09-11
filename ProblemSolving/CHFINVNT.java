package codeshef;
import java.util.*;
public class CHFINVNT {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();int p = sc.nextInt();
	int k = sc.nextInt();
	
	bulbno(n,k,p);
}

private static void bulbno(int n, int k, int p) {
	ArrayList<Integer> al = new ArrayList<>();
	for(int i=0;i<n;i++) {
		al.add(i%k);
	}
	al.stream().forEach(System.out::println);
	long total = al.stream().filter(num -> num<=al.get(p) ).count();
	System.out.println(total);
	
}
}

