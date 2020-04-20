/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture4recursion;
import java.util.Scanner;

//public class runner {
//	
//	static Scanner s = new Scanner(System.in);
//	
//	public static int[] takeInput(){
//		int size = s.nextInt();
//		int[] input = new int[size];
//		for(int i = 0; i < size; i++){
//			input[i] = s.nextInt();
//		}
//		return input;
//	}
//	
//	public static void main(String[] args) {
//		int[] input = takeInput();
//		quicksort.quickSort(input);
//		for(int i = 0; i < input.length; i++) {
//			System.out.print(input[i] + " ");
//		}
//	}
//}



public class runner {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int output[][] = Retrun_subset_of_array.subsets(input);
		for(int i = 0; i < output.length; i++) {
			for(int j = 0; j < output[i].length; j++) {
				System.out.print(output[i][j] + " ");
			}
			System.out.println();
		}
	}
}
