class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        int i=0;
        int j=0;
        long product=1;
        while(j<n){
          product=product*nums[j];
          while(i<=j&&product>=k){
            product=product/nums[i];
            i++;
          }
          count = count + (j-i+1);
          j++;
        }
        return count;
    }
}