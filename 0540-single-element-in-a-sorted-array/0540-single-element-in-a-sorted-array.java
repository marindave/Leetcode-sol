class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        int start=0;
        int end=1;
        int p=0;
        if(nums.length==1){
             return nums[start];
        }
        while(start<end){
            
            if(nums[start]==nums[end]){
                start=start+2;
                if(end==n-2){
                end=end+1;
                return nums[start];
            }else{
                end=end+2;
            }
            }
            else{
                p=nums[start];
                break;
            }
        }
        return p;
    }
}