class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
      int n=nums.length;
      int sum1=0;
      int sum2=0;
      for(int i=0;i<=n;i++){
        sum1=sum1+i;
        int target=i;
        
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                sum2=sum2+target;
                break;
            }
           if(target>nums[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
            }
           
        }
        return sum1-sum2;
      }
     
    
}