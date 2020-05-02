/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StringsHackerank;

/**
 *
 * @author sarthak sethi
 */
public class test {
    public static void main(String[] args) {
        System.out.println(7/2);
        String s = "quyjjyq";
          StringBuffer sb = new StringBuffer(s.substring(s.length()/2+1));
              StringBuffer r= sb.reverse();
              String rev = r.toString();
              System.out.println(rev);
    }
}
