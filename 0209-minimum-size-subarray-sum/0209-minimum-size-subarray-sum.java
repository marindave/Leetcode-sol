class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int n=nums.length; 
       int i=0;

       int sum=0;
       int min= Integer.MAX_VALUE;
       for(int j=0;j<n;j++){
        sum=sum+nums[j];
        
        while(sum>=target){
            int p=j-i+1;
             sum=sum-nums[i];
            i++;
       
           
            if(p<min) min=p;
        }
       }
       int temp=0;
       for(int k=0;k<n;k++){
         temp=temp+nums[k];
        
       }
       if(target>temp){
        return 0;
       }
       return min;
    }
}