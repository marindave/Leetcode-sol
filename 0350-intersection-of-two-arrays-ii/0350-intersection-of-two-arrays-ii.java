class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         List<Integer> list=new ArrayList<>();
       Arrays.sort(nums1);
       Arrays.sort(nums2);
       int n=nums1.length;
       int m=nums2.length;
      int i=0;
      int j=0;
      while(i<n && j<m){
        if(nums1[i]==nums2[j]){
            list.add(nums1[i]);
            i++;
            j++;
        }
        if(i<n && j<m && nums1[i]<nums2[j]){
            i++;
        }else if(i<n && j<m && nums1[i]>nums2[j]){
            j++;
        }
      }
       int[] array=new int[list.size()];
        for (int p= 0; p < list.size(); p++) {
            array[p] = list.get(p);
        }
        return array;
       
    }
}