class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int[] indices=new int[2];
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum=nums[i]+nums[j];
                if(sum==target){
                    indices[0]=i;
                    indices[1]=j;
                    break;
                    }
                }
            }
            return indices;
        }
      
    }
