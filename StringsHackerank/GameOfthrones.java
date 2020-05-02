/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StringsHackerank;

/**
 *
 * @author sarthak sethi
 */
public class GameOfthrones {
    static String gameOfThrones(String s) {
int[] a = new int[26];
for(int i=0;i<s.length();i++){
   int temp = a[s.charAt(i)-'a'];
    temp+=1;
     a[s.charAt(i)-'a'] = temp;
}
int ans=0;
for(int i=0;i<26;i++){
    if(a[i]>0 && a[i]%2!=0)
    ans++;
}
if(ans>=2)
return "NO";
else
return "YES";
}
}
