class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n=matrix.length;
        int[] arr=new int[n*n];
        int index=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               arr[index]=matrix[i][j];
               index++;
            }
        }
        Arrays.sort(arr);
        int temp=arr[k-1];
        return temp;
    }
}