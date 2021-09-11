package codeshef;
import java.util.*;
public class Diff_in_strings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		find_diff("abcd", "abcde");
	}
	static String find_diff(String s, String t) {
	
		return String.valueOf((char) t.chars().sum() - s.chars().sum()) ; 
	}
}
