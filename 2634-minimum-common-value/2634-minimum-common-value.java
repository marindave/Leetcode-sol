class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        for(int i=0;i<nums1.length;i++){
            int target=nums1[i];
            int start=0;
            int end=nums2.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(target==nums2[mid]){
                    return target;
                }
                if(target>nums2[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}