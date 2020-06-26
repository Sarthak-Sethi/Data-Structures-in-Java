package ProblemSolving;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
import java.util.Scanner;
/*
 * @author sarthak sethi
 * 
 * it gives a tle for some cases but i tried my logic on netbeans 
 * it takes time but is 100 percent accurate
 */
class Node1 {
    int data;
    Node1 next;
    
    Node1(int data) {
        this.data = data;
        next = null;
                    }
}
public class Array_simple_queries {
     static Node1 head = null;
     static Node1 tail = null;
    static int taildata = 0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); 
           int q = s.nextInt();   
      //  int[] a new int[n];
 
        for(int i=0;i<n;i++){
            int data = s.nextInt();
           Node1 newNode = new Node1(data);
            if(head == null){
                head = newNode;
                tail = newNode;
             
            }
            else {   
                tail.next = newNode; 
                tail = newNode; 
            }
        }
        for(int i=0;i<q;i++){
            int type = s.nextInt();
            int si = s.nextInt();
            int ei = s.nextInt();
            modify(type,si-1,ei-1);
            
        } 
        if(taildata==0)   {
            Node1 temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            taildata = temp.data;
        }    
        System.out.println(Math.abs(head.data - taildata));
        print(n);
    }
    public static void print(int n){
         Node1 temp = head;
        for(int i=0;i<n;i++){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void modify(int type, int si ,int ei){
        if(type == 1){
            if(si == 0){
               return ;
            }
            Node1 temp = head;
            Node1 prevhead = head; 
            Node1 connectthis = null;
             int count = 0;
            while(temp != null){
                if(count == si-1){
                    connectthis = temp;
                    head = temp.next;
                }
                else if(count == ei){
                 //   System.out.println(temp.next);
                    if(temp.next!=null) {
                    Node1 toconnect = temp.next;  
                    temp.next = prevhead;
                    connectthis.next = toconnect;
                    }
                    else {
                        temp.next = prevhead;
                        connectthis.data = taildata;
                        connectthis.next = null;
                    }
                }
                temp = temp.next;
                count++;
               // System.out.println(count);
            }
        }
        else {
        //    System.out.println("in type 2"); 20 1 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 1 1 3
            Node1 temp = head; 
            Node1 prevhead = head; 
            Node1 connectto = null;
            Node1 from = null;     
             int count = 0;
             while(temp.next!=null){
                 temp = temp.next;
             }
             Node1 tail = temp;
             temp = head;
             if(si == 0){
                  while(temp!=null) {
                      if(count == ei){ 
                          if(temp.next == null){
                              break;
                          }
                          head = temp.next;
                          taildata = temp.data;
                          temp.next = null;
                          tail.next = prevhead;
                         // System.out.println("new head is"+head.data);
                      }
                      temp = temp.next;
                         count++;
                  }
             }else {
            while(temp!=null) {
                if(count == si-1){
                    from = temp;
                    connectto = temp.next;
                }
                else if(count == ei){
                   from.next = temp.next;
                  tail.next = connectto;
                  taildata = temp.data;
                    temp.next = null;
                    
                    //tail.next = connectto;
                }
                temp = temp.next;
                count++;
            }
        }
        }
    }
}
