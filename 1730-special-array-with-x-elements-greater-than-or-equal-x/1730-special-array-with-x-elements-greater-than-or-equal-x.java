class Solution {
    public int specialArray(int[] nums) {
        int n=nums.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
       
        for(int i=0;i<=max;i++){
         int p=0;
            for(int j=0;j<n;j++){
                if(nums[j]>=i){
                    p++;
                }
                
            }
            if(p==i){
                    return i;
                }
        }
        return -1;
    }
}