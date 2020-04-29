/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StringsHackerank;

/**
 *
 * @author sarthak sethi
 */
public class EncryptString {
    static String encrypt(String s, int k) {
        if(k==0)
        return s;
        String ans = "";
        char[] alph= new char[27];
        char start = 'a';
        for(int i=1;i<alph.length;i++){
            alph[i] = start++;
        }
    for(int i=0;i<s.length();i++){
        //if(Character.isUpperCase(charAt(i)))
        for(int j=0;j<alph.length;j++){
//            if(s.charAt(i)=='-'){
//            ans+="-";
//            }
          if(s.charAt(i)==alph[j]){
            if(j+k<=26)
            ans+=alph[j+k];
            else{
                int temp = j+k;
                int pos = temp-26;
            ans+=alph[pos];
            }
        }
        }
    }
    return ans;
// just make a main fn and pass a string it withh encrypt it by shifiting pos by k 
    //see ceasercipher at hackerrank
    }
    
}
