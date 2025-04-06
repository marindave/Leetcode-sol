class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       List <Integer> ans =new ArrayList<>();
       int n=matrix.length;
       int m=matrix[0].length;
       int sr=0;
        int sc=0;
        int er=n-1;
        int ec=m-1;
        while(sr<=er && sc<=ec){
            for(int j=sc;j<=ec;j++){
                ans.add(matrix[sr][j]);
               
            }
             sr++;
            for(int i=sr;i<=er;i++){
                ans.add(matrix[i][ec]);
               
            }
             ec--;
            if(sr<=er){
                for(int j=ec;j>=sc;j--){
                ans.add(matrix[er][j]);
                
            }
            }
            er--;
            if(sc<=ec){
                for(int i=er;i>=sr;i--){
                ans.add(matrix[i][sc]);
                
            }
            }
            sc++;
        }
        return ans;
    }
}