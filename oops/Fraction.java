/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package codingninja;

import javax.swing.text.html.HTML;

/**
 *
 * @author sarthak sethi
 */
public class Fraction {
    private int num;
    private int den;
    public Fraction(int num,int den){
        this.num = num; 
        if(den == 0){
            throw  new ExceptionInInitializerError();
        }
        this.den = den;
       
        simplify();
    }
    public static Fraction add(Fraction f1,Fraction f2){
       // Fraction ans = new Fraction();
       int num = f2.den*f1.num + f1.den*f2.num;
        int den = f1.den*f2.den;
        Fraction f = new Fraction(num, den);
        return f;
        
    }
    public void print(){
     if(den==1)
            System.out.println(num);
        System.out.println(num+"/"+den);
    }
    public void setden(int den){
        if(den==0){
            ExceptionInInitializerError("cant be zero");
        }
        this.den = den;
        simplify();
        
    }
    
    public int getden(){
        return den;
    }
    public void setnum(int num){
        this.num =num;
        simplify();
    }
    public int getnum(){
        return num;
    }
    public void add(Fraction f){
        
    }
    private void simplify(){
        int gcd=1;
        int smaller = Math.min(num, den);
        for(int i=1;i<smaller;i++){
            if(num%i==0 && den%i==0){
                gcd =i;
            }
        }
        num=num/gcd;
        den=den/gcd;
    }

    private void ExceptionInInitializerError(String cant_be_zero) {
        //throw new UnsupportedOperationException("Not yet implemented");
        System.out.println("den cant be zero");
    }
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(4, 5);
        Fraction ans = add(f1, f2);
        ans.print();
    }
}
