class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        long n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        int i=0;
        int j=0;
        long temp=0;
        long t=0;
        while(j<n){
            if(max==nums[j]){
                t++;
            }
            while(i<=j&&t>=k){
                if(nums[i]==max){
                    t--;
                }
                i++;
               
            }
            temp=temp+(j-i+1);
            j++;
        }
        long counter=n*(n+1)/2;
        return counter-temp;
    }
}