package codeshef;
import java.util.*;
public class stream_on_char {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		char[] arr = new char[]{ 'g', 'e', 'e', 'k', 's',']',',' };
		 Arrays.toString(arr).chars().filter((c1) -> 
		{return Character.isLetter(c1);}).mapToObj(c -> (char) c).forEach((c) -> sb.append(c) );
		 
		 sb.reverse().toString().chars()
		 .mapToObj(c -> (char) c).
		 forEach(c -> System.out.print(c+" "));
	}
}
