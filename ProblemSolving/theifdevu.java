
package codeshef;
import java.util.*;

/**
 *
 * @author sarthak sethi
 */
public class theifdevu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int m = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[] arr = new int[m];
            for (int j = 0; j < m; j++) {
                arr[j] = sc.nextInt();
            }
            safehouse(m,x,y,arr);
        }
    }

    private static void safehouse(int m, int x, int y, int[] arr) {
       int dist = x*y;
       int[] safe = new int[100];
       Arrays.fill(safe, 1);
        for (int i = 0; i < m; i++) {
            int fromIndex = arr[i]-dist > 1 ? arr[i] - dist - 1 : 0;
            int toIndex = arr[i]+dist >= 100 ? 99 : arr[i] + dist -1;
            Arrays.fill(safe, fromIndex, toIndex+1, 0);
        }
       int total =  Arrays.stream(safe).sum();
        System.out.println(total);
    }
}
