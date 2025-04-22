class Solution {
    public int maxSubArray(int[] nums) {
       int n=nums.length;
       int sum=0;
       int max=Integer.MIN_VALUE;
       int start=0;
       while(start<n){
        sum=sum+nums[start];
        if(sum>max){
            max=sum;
        }
        if(sum<0){
            sum=0;
        }
        start++;

       }
       return max;
    }
}