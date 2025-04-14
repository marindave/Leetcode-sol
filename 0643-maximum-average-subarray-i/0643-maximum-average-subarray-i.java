class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        double sum=0;
        double max=Double.NEGATIVE_INFINITY;
        int i=0;
        int j=0;
        while(j<n){
            
            sum=sum+nums[j];
            if(j-i+1<k){
                j++;
            }else if(j-i+1==k){
                if(sum>max){
                    max=sum;
                }
                 sum=sum-nums[i];
                i++;
                j++;
             
            }
        }
        return max/k;
    }
}