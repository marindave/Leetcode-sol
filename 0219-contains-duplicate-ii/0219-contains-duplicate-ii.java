class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      int n=nums.length;
      HashSet<Integer> set=new HashSet<>();
      int i=0;
      while(i<n){
       if(!set.contains(nums[i])){
        set.add(nums[i]);
       }else{
        return true;
       }
       if(set.size()>k){
        set.remove(nums[i-k]);
       }
      
       i++;
      }
      return false;
    }
} 