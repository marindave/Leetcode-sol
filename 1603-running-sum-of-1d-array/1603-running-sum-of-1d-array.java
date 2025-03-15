class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        ans[0]=nums[0];
        for(int i=0;i<n-1;i++){
            ans[i+1]=ans[i]+nums[i+1];
        }
        return ans;
    }
}