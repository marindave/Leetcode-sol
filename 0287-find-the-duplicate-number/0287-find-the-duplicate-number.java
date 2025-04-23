class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
       Arrays.sort(nums);
       int i=0;
       int j=1;
       while(i<n&&j<n){
        if(nums[i]==nums[j]){
            return nums[i];
        }else{
            i++;
            j++;
        }
       }
      return 0;
        }
        
    }
