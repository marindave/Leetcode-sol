class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int n=nums.length; 
       int sum=0;
       int min= Integer.MAX_VALUE;
       int i=0;
       int j=0;
       int p=0;
       while(j<n){
        sum=sum+nums[j];
        while(sum>=target){
           p=j-i+1;
          if(p<min) min=p;
           sum=sum-nums[i];
           i++;
             
        
        }
        j++;
       }
       int temp=0;
       for(int k=0;k<n;k++){
        temp=temp+nums[k];
       }
       if(temp<target) return 0;
       return min;
    }
}