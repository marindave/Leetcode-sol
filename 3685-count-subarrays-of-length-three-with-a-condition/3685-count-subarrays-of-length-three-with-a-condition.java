class Solution {
    public int countSubarrays(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=0;
        int p=0;
        while(j<n){
            if(j-i+1<3){
                j++;
            }
            if(j-i+1==3){
                if(nums[i+1]==2*(nums[i]+nums[j])){
                    p++;
                    i++;
                    j++;
                }else{
                    i++;
                    j++;
                }
            }
        }
     return p;
    }
}