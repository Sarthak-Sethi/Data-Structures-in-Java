class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        int plen = p.length();
        if(plen>s.length())
            return ans;
        HashMap<Character,Integer> pmap = new HashMap<>();
          HashMap<Character,Integer> smap = new HashMap<>();
        //making map for s and p
        for(int i=0;i<plen;i++) {
            char c = p.charAt(i);
            pmap.put(c,pmap.getOrDefault(c,0)+1);
             char c1 = s.charAt(i);
            smap.put(c1,smap.getOrDefault(c1,0)+1);
        }
        // check created map
        if(smap.equals(pmap))
            ans.add(0);
        // from next point, remove the last character and add the new character
        for(int i=plen;i<s.length();i++) {
            char c = s.charAt(i);
            char prevchar = s.charAt(i-plen);
            // if i=4. prevchar = 'c' at index 0
            //checking if 'c' is theree in smap, and remove if freq==1
            if(smap.containsKey(prevchar)) {
            if(smap.get(prevchar)==1) 
                smap.remove(prevchar);
            else 
            smap.put(prevchar,smap.get(prevchar)-1);
            }
            // adding the currect character 'e' to smap and checking 
            smap.put(c,smap.getOrDefault(c,0)+1);
            if(pmap.containsKey(c)) {
             if(smap.equals(pmap))
                 ans.add(i-plen+1);
            }
        }
        return ans;
    }
}
