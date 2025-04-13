class Solution {
    public int findMin(int[] nums) {
      int n=nums.length;
        int start=0;
        int end=n-1;
       //this code actually find the minima and all the two pointers will point to minima
          
        while(start<end){
            
            int mid=start+(end-start)/2;
            if(nums[mid]==nums[start]&&nums[mid]==nums[end]){
                start++;
                end--;
                
            }
            
         else  if(nums[mid]>nums[end]){
            //which means minimum will lie on the right side of mid
            start=mid+1;
           }
          else{
            //which means minimum will lie on the left side of mid including mid also
            end=mid;
          }

    }
    return nums[start];
    }
   
}
