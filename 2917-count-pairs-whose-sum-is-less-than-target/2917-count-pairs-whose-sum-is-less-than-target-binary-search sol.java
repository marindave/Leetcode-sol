class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n=nums.size();
        int count=0;
        Collections.sort(nums);
        for(int i=0;i<n;i++){
            int temp=target-nums.get(i);
          int  start=i+1;
          int end=n-1;
          while(start<=end){
            int mid=start+(end-start)/2;
            if(nums.get(mid)<temp){
                count=count+(mid-start+1);
                start=mid+1;
            }else{
                end=mid-1;
            }
            
          }
            
        }
        return count;
    }
}
