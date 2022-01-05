class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
       List<String> li = new ArrayList<>();
        patritionRecursive(0,s,li,ans);
        return ans;
    }
     private static void patritionRecursive(int index,String s,
                                            List<String> li,
                                            List<List<String>> ans) {
         if(index==s.length()){
             ans.add(new ArrayList<>(li));
             return ;
         }
         for(int i=index;i<s.length();i++){
             String prefix = s.substring(index,i+1);
             if(isPallindrome(prefix)){
                 li.add(prefix);
                 patritionRecursive(i+1,s,li,ans);
                 li.remove(li.size()-1);
             }
         }
        }

    private static boolean isPallindrome(String str){
        int li = 0;
        int ri = str.length() - 1;
        while(ri>li){
            if(str.charAt(li)!=str.charAt(ri))
                return false;
            li++; ri--;
        }
        return true;
    }
}
