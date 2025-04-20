class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       List<Integer> list=new ArrayList<>();
       Arrays.sort(nums1);
       Arrays.sort(nums2);
       int n=nums1.length;
       int m=nums2.length;
       for(int i=0;i<n;i++){
        if(i>0&&nums1[i]==nums1[i-1]){
            continue;
        }
       int target=nums1[i];
        int start=0;
       int end=m-1;
        while(start<=end){
           int mid=start+(end-start)/2;
            if(target==nums2[mid]){
                list.add(target);
                break;
            }
            if(target>nums2[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
       }
       int[] array=new int[list.size()];
        for (int p= 0; p < list.size(); p++) {
            array[p] = list.get(p);
        }
        return array;
       
    }
}