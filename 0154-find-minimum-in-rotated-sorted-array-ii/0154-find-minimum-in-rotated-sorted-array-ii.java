class Solution {
    public int findMin(int[] nums) {
        //Removing the adjacent dupicate elements from array
        //converting the given array nums into list
        List<Integer> ans=new ArrayList<>();
        ans.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                ans.add(nums[i]);
            }
        }
        //converting the list ans into array
        int[] result=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            result[i]=ans.get(i);
        }
        int pivot=findPivot(result);
         if(pivot==-1){
         return result[0];
     }
        return result[pivot+1];
     
    }
   public static int findPivot(int[] nums){
    int start=0;
    int end=nums.length-1;
    while(start<=end){
        int mid=start+(end-start)/2;
        if(mid<end&&nums[mid]>nums[mid+1]){
            return mid;
        }
        if(mid>start&&nums[mid]<nums[mid-1]){
            return mid-1;
        }
        if(nums[start]>=nums[mid]){
            end=mid-1;
        }else{
            start=mid+1;
        }
    }
    return -1;
}
}