/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lecture4recursion;

public class quicksort {
   public static void quickSort(int[] input) {
		quickSort(input,0,input.length-1);
	}
    public static void quickSort(int[] input, int si, int ei)
    {
        if (si>=ei)
            return ;
        int pivotpos = partition(input,si,ei);
        quickSort(input,si,pivotpos-1);
        quickSort(input,pivotpos+1,ei);
        
    }
    private static int partition(int[] input , int si , int ei)
    { 
        int count= 0;
        int pivot = input[si];
        for ( int i = si;i<ei;i++)
        {
            if(pivot>input[i])
                count++;
        }
        int pivotpos = count+si;
        int temp = input[pivotpos];
     input[pivotpos]= pivot;
        pivot = temp;
        
        int i = si;
        int j = ei;
     while (i<si+count && j>si+count)
     {
       if(input[i]>pivot && input[j]<pivot ) 
       {
           int temp2=input[j];
           input[j] = input[i];
           input[i]=temp2;
           i++;
           j--;
       }   
         else if(input[i]< pivot)
         {
             i++;
         }
         else if(input[j]>pivot)
         {
             j--;
         }  
     }
        return pivotpos;
    }
	
}