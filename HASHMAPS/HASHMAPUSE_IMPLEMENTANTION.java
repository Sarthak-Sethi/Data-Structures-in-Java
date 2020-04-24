/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package HASHMAPS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author sarthak sethi
 */
public class HASHMAPUSE_IMPLEMENTANTION<K, V> {
    // we need a bucket array which stores the head of LL

    ArrayList<MapNode<K, V>> bucketarray;
    int size; //size is no of entries in the map
    int numbuckets; // ki kitni entires bucketarray me h ........
    //mtlb kitne head h LL ke bucket array me

    public HASHMAPUSE_IMPLEMENTANTION() {
        numbuckets = 20;
        bucketarray = new ArrayList<>();
        for(int i=0;i<numbuckets;i++)
        {
            // 20 spaces bnaa ke null daal diya
            bucketarray.add(null);
        }
        
    }
    private int getBucketIndex(K key)
    {
        int hashcode=key.hashCode();
        //every data type may it be student  ,int ,string has a parent class as object and 
        //that has a hashcode function which 
        // operates on addresses to get hashcode .....now string integer also has their own 
        //hash functions
        return hashcode%numbuckets;
        //compression is done
    }
    public void put(K key ,V value)
    {
        int bucketindex = getBucketIndex(key); // konsi index pe kaam krna
        // har index me ek LL h ......uska head nikaal lete hain
        MapNode<K,V> head = bucketarray.get(bucketindex);
        while(head!=null)
        {//traverse till head
            if(head.key.equals(key))
                head.value = value;
            head = head.next;
        }
        head = bucketarray.get(bucketindex);
        size++;
        MapNode<K,V> newNode = new MapNode<>(key,value);
        newNode.next=head;
        bucketarray.set(bucketindex, newNode); //now head should ne newnode so usko set krdiya  
        double loadfactor = (1.0*size)/numbuckets;    
        if(loadfactor>0.7)
        {
            rehash();
        }
    }
    public V removekey(K key)
    {
     int bucketindex = getBucketIndex(key);
        MapNode<K,V> head = bucketarray.get(bucketindex);
        MapNode<K,V> prev = null;
        while(head!=null)
        {//traverse till head
            if(head.key.equals(key))
            {       size--;
                if(prev==null)
                {
                  bucketarray.set(bucketindex, head.next);
                }
                else
                {
                     prev.next = head.next;
                     
                }
               return head.value;
            }
            prev=head;
            head = head.next; 
        }
        return null;
    }
    public V getValue(K key)
    {
        int bucketindex = getBucketIndex(key);
        MapNode<K,V> head = bucketarray.get(bucketindex);
        while(head!=null)
        {//traverse till head
            if(head.key.equals(key))
                return head.value;
            head = head.next;
        }
        return null;
    }

    private void rehash() {
        ArrayList<MapNode<K,V>> temp = bucketarray;
        bucketarray = new ArrayList<>();
        for(int i=0;i<2*numbuckets;i++)
        {
           bucketarray.add(null); 
        }
        size=0;
        numbuckets = numbuckets*2;
        for(int i=0;i<temp.size();i++)
        {
            MapNode<K,V> head = temp.get(i);
            while(head!=null){
                K key = head.key;
                V value = head.value;
                put(key, value);
                head = head.next;    
            }
        }
    }
            
}
