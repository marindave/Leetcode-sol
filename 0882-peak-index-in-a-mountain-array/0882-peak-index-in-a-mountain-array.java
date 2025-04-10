class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>=arr[mid+1]&&arr[mid]>=arr[mid-1]){
                return mid;
            }
            if(arr[mid]<arr[mid-1]){
                end=mid-1;
                 if(arr[end]>=arr[end+1]&&arr[end]>=arr[end-1]){
                return end;
            }
            }else if(arr[mid]<arr[mid+1]){
                start=mid+1;
                 if(arr[start]>=arr[start+1]&&arr[start]>=arr[start-1]){
                return start;
            }
            }
        }
        return 0;
    }
}