package ProblemSolving.GFG;


import com.google.common.collect.Collections2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @author sarthak sethi
 */
public class Gcd {
    public static void main(String[] args) {
        System.out.println(gcd(10,14));
    }
    public static int gcd(int a , int b){
        if( b == 0)
            return a;
        return gcd(b,a%b);
    }
}
