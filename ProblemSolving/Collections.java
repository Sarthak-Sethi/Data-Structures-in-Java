/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ProblemSolving;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author sarthak sethi
 */
public class Collections {
    String Name,Contactno;
    Scanner s = new Scanner(System.in);
    public void setname(String name)
    {
        this.Name = name;
    }
    public void setconatct(String cno)
    {
        this.Contactno = cno;
    }
    public String ToString()
    { // it is a pre defined method  of lang.object so which is called when we used 
        return "Name :"+Name+" Conatct no"+Contactno;
    }
    public static void main(String[] args) {
        Collections c = new Collections();
        c.setname("sarthak");
        c.setconatct("123345");
        Collections a = new Collections();
        a.setname("sarthak");
        a.setconatct("123345");
        Collections b = new Collections();
        b.setname("sarthak");
        b.setconatct("123345");
        Collections d = new Collections();
        d.setname("sarthak");
        d.setconatct("123345");
        //System.out.println(c);
        ArrayList<Collections> al = new ArrayList<>();
        al.add(c);
        al.add(a);
        al.add(b);
        al.add(d);
//        Iterator i1 = al.iterator();
//        while(i1.hasNext())
//        {
//            System.out.println(i1.next());
//        }
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i).ToString());    
        }
    }
}
