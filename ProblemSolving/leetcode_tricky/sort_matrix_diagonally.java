class Solution {
    public int[][] diagonalSort(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int[][] ans = new int[row][col];
      // if we know start point of diagonal, which will be either first row or first col. see copy notes
      // 
      // loop for first row
        for(int k=col-1;k>=0;k--) {
           int i=0;
            int j=k;
            List<Integer> li = new ArrayList<>();
            while(i<row && j<col){
                li.add(mat[i][j]);
                i++;
                j++;
            }
            Collections.sort(li);
            i=0;
            j=k;
              while(i<row && j<col){
              ans[i][j] = li.get(i);
                i++;
                j++;
            }
        }
      // loop for first col
        for(int k=1;k<row;k++) {
            int i=k;
            int j=0;
            List<Integer> li = new ArrayList<>();
            while(i<row && j<col){
                li.add(mat[i][j]);
                i++;
                j++;
            }
            Collections.sort(li);
            i=k;
            j=0;
              while(i<row && j<col){
              ans[i][j] = li.get(j);
                i++;
                j++;
            }   
        }
       return ans;
    }
}
