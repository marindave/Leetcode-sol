class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
         int row=matrix.length;
       int col=matrix[0].length;
       if(row==1){
       return binarySearch(matrix,0,0,col-1,target);
       } 
       int rs=0;
       int re=row-1;
       int cmid=(col-1)/2;
       //run the loop till two rows are remaining
       while(rs<(re-1)){
        int mid=rs+(re-rs)/2;
        if(matrix[mid][cmid]==target){
            return true;
        }
        if(matrix[mid][cmid]<target){
            rs=mid;
        }else{
            re=mid;
        }
       }
       //now we have two rows check whether the target is present in the col of 2 rows
       if(matrix[rs][cmid]==target){
        return true;
       }
        if(matrix[rs+1][cmid]==target){
        return true;
       }
       //other wise search in all the remainig four parts
       //search in first half
       if(cmid - 1 >= 0 &&target<=matrix[rs][cmid-1]){
        if(binarySearch(matrix,rs,0,cmid-1,target)) return true;
       }
       //search in the 2nd part
         if(cmid + 1 < col&&target>=matrix[rs][cmid+1]&&target<=matrix[rs][col-1]){
        if( binarySearch(matrix,rs,cmid+1,col-1,target)) return true;
       }
       //search in the 3rd part
       if(cmid - 1 >= 0 &&target<=matrix[rs+1][cmid-1]){
        if( binarySearch(matrix,rs+1,0,cmid-1,target)) return true;
       }
       //search in the 4th part
        if(cmid + 1 < col&&target>=matrix[rs+1][cmid+1]&&target<=matrix[rs+1][col-1]){
          if( binarySearch(matrix,rs+1,cmid+1,col-1,target)) return true;
       }
       return false;
    }
   public static boolean binarySearch(int[][] matrix,int row,int cstart,int cend,int target){
        while(cstart<=cend){
            int mid=cstart+(cend-cstart)/2;
            if(matrix[row][mid]==target){
                return true;
            }
            if(matrix[row][mid]<target){
                cstart=mid+1;
            }else{
                cend=mid-1;
            }
        }
        return false; 
    }
}