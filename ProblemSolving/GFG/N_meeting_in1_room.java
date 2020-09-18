/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving.GFG;

import java.util.*;
class mycomparator implements Comparator<meet>{
    @Override
    public int compare(meet o1, meet o2) {
       if(o1.et<o2.et){
           return -1;
       }
       else if(o1.et>o2.et)
           return 1;
       return 0;
    }
    
}
class meet{
    int st;
    int et;
    int pos;
    meet(int st,int et , int pos){
        this.st = st;
        this.et = et;
        this.pos = pos;
    }
}
public class N_meeting_in1_room {
	public static void main (String[] args) {
	    Scanner s = new Scanner(System.in);
    	int t = s.nextInt();
        for(int k=0;k<t;k++){
    	int size = s.nextInt();
    	int[] st = new int[size];
    	int[] et = new int[size];
        ArrayList<meet> meeting = new ArrayList<>();
    	for(int i=0;i<size;i++){
    	    st[i] = s.nextInt();
    	}
    	for(int i=0;i<size;i++){
    	    et[i]  = s.nextInt();
    	}
        for(int i=0;i<size;i++)
        meeting.add(new meet(st[i],et[i],i));
    printtheprderofmeeting(meeting,size);
        }
	}
        
	public static void printtheprderofmeeting(ArrayList<meet> al,int s){
	ArrayList<Integer> ans = new ArrayList<>();
        int limit = 0;
        mycomparator mc  = new mycomparator(); 
        Collections.sort(al, mc);
        ans.add(al.get(0).pos);
        limit = al.get(0).et;
        for(int i=1;i<al.size();i++){
            if(al.get(i).st>limit){
                ans.add(al.get(i).pos);
                limit = al.get(i).et;
            }
        }
         for(int i=0;i<ans.size();i++)
                System.out.print(ans.get(i)+1 +" ");
            System.out.println();
	}
        
}
/*
//java program to find maxium number of meetings 
import java.util.*;
//Comparator function which can compare 
// the ending time of the meeting ans sort the list
class mycomparator implements Comparator<meet>{
    @Override
    public int compare(meet o1, meet o2) {
       if(o1.et<o2.et){
         //return -1 if second object is
         //bigger then first
           return -1;
       }
       else if(o1.et>o2.et)
         //return 1 if second object is
         //smaller then first
           return 1;
       return 0;
    }
    
}
//custom class for storing starting time,  
// finishing time and position of meeting. 
class meet{
    int st;
    int et;
    int pos;
    meet(int st,int et , int pos){
        this.st = st;
        this.et = et;
        this.pos = pos;
    }
}
class GFG {
//Driver Code  
	public static void main (String[] args) {
	   // Starting time 
    int st[] = { 1, 3, 0, 5, 8, 5 };    
    // Finish time 
    int et[] = { 2, 4, 6, 7, 9, 9 };  
      //defining an arraylist of meet type
        ArrayList<meet> meeting = new ArrayList<>();
        for(int i=0;i<st.length;i++)
        //creating object of meeting and adding in the list
        meeting.add(new meet(st[i],et[i],i));
      // Function call 
    printtheprderofmeeting(meeting,meeting.size());
        }
	
        
	public static void printtheprderofmeeting(ArrayList<meet> al,int s){
      //initialising an arraylist for storing answer
	ArrayList<Integer> ans = new ArrayList<>();
        int limit = 0;
        mycomparator mc  = new mycomparator(); 
      // Sorting of meeting according to their finish time.
        Collections.sort(al, mc);
     // Select first meeting of sorted pair as the first Meeting 
     // and push it into ans list and set a variable limit with the 
      //second value(Finishing time) of the first selected meeting.
        ans.add(al.get(0).pos);
        limit = al.get(0).et;
        for(int i=1;i<al.size();i++){
          //iterate from the second pair to last pair of the list and 
           //if the value of the first element of the current pair is greater then 
          //previously selected pair finish time (limit)
          //then select the current pair and add the position in ans list
            if(al.get(i).st>limit){
                ans.add(al.get(i).pos);
                limit = al.get(i).et;
            }
        }
      //printing the final answer
         for(int i=0;i<ans.size();i++)
           //adding 1 as index starts from zero
                System.out.print(ans.get(i)+1 +" ");
	}       
}
// This code is contributed by Sarthak Sethi 

 * 
 */