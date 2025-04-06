class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
       
       int sr=0;
        int sc=0;
        int er=n-1;
        int ec=n-1;
        int p=0;
        while(sr<=er && sc<=ec){
            for(int j=sc;j<=ec;j++){
                matrix[sr][j]=++p;
               
            }
             sr++;
            for(int i=sr;i<=er;i++){
                matrix[i][ec]=++p;
               
            }
             ec--;
            if(sr<=er){
                for(int j=ec;j>=sc;j--){
                matrix[er][j]=++p;
                
            }
            }
            er--;
            if(sc<=ec){
                for(int i=er;i>=sr;i--){
                matrix[i][sc]=++p;
                
            }
            }
            sc++;
        }
        return matrix;
    }
}