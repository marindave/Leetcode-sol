class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;
        int rs=0;
        int rc=m-1;
        while(rs<n && rc>=0){
            int e=matrix[rs][rc];
            if(target==matrix[rs][rc]){
                return true;
            }
            if(target>e){
                rs++;
            }else{
                rc--;
            }
        }
        return false;
    }
}