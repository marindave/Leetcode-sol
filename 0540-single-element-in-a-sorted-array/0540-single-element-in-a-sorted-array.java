class Solution {
    public int singleNonDuplicate(int[] nums) {
       int n=nums.length;
       int start=0;
       int end=n-1;
       if(n==1){
        return nums[0];
       }
       if(nums[0]!=nums[1]){
        return nums[0];
       }
       if(nums[n-1]!=nums[n-2]){
        return nums[n-1];
       }
       while(start<=end){
        int mid=start+(end-start)/2;
        if(nums[mid]!=nums[mid-1]&&nums[mid]!=nums[mid+1]){
            return nums[mid];
        }
        if(mid > 0 &&nums[mid]==nums[mid-1]){
            if((mid-start)%2==0){
                end=mid-2;
            }else{
                start=mid+1;
            }
        }else   if(mid < n - 1&&nums[mid]==nums[mid+1]){
            if((end-mid)%2==0){
                start=mid+2;
            }else{
                end=mid-1;
            }
       }
    }
    return 0;
}
}