class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
         List<List<Integer>> result = new ArrayList<>(); 
          
         for(int i=0;i<n;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int start=i+1;
            int end=n-1;
            while(start<end){
                int sum=nums[i]+nums[start]+nums[end];
                if(sum>0){
                    end--;
                }else if(sum<0){
                    start++;
                }else{
                    
                      result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                      start++;
                    end--;
                    while (start < end && nums[start] == nums[start - 1]) 
                    start++;
                    while (start < end && nums[end] == nums[end + 1]) 
                    end--;
                }
              
                }
            }
            return result;
         } 
      
    }
