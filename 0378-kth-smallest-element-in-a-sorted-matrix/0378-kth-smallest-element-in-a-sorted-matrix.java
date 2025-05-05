class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int start=matrix[0][0];
        int end=matrix[n-1][n-1];
        while(start<=end){
            int mid=start+(end-start)/2;
            //it is for checking how many numbers are smaller and equal to mid number in the matrix 
            int count=0;
            for(int i=0;i<n;i++){
                count=count+numberSmallerEqualThanMid(matrix[i],mid);
            }
            if(count<k){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return start;
    }
    public static int numberSmallerEqualThanMid(int[] rows,int target){
        int start=0;
        int end=rows.length-1;
        while(start<=end){
          int mid= start+(end-start)/2;
            if(rows[mid]<=target){
            start=mid+1;
            }else{
                end=mid-1;
            }
            }
            return start;
    }
}