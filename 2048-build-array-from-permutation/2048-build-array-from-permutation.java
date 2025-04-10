class Solution {
    public int[] buildArray(int[] nums) {
        
        int n=nums.length;
    
        for(int i=0;i<n;i++){
            nums[i]=nums[i]+n*(nums[nums[i]]%n);//encoding new and current value
        }
        for(int i=0;i<n;i++){
            nums[i]=nums[i]/n;//extracting new value
        }
        return nums;
    }
}

    