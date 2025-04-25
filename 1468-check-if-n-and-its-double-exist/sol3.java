class Solution {
    public boolean checkIfExist(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
            boolean temp=false;
        for(int i=0;i<n;i++){
            int target=2*arr[i];
        
            if(arr[i]==0){
                if(i>0&&arr[i-1]==0||i<n-1&&arr[i+1]==0){
                    return true;
                }
                continue;
                }
            // if(target>arr[i]&&binarySearch(arr,i+1,n-1,target)) return true;
            // if(target<arr[i]&&i>0&&binarySearch(arr,0,i-1,target)) return true;
            if(target>arr[i]){
                 temp=binarySearch(arr,i+1,n-1,target);
                 if(temp){
                    return true;
                 }
            }else if(target<arr[i]&&i>0){
                  temp=binarySearch(arr,0,i-1,target);
                   if(temp){
                    return true;
                 }
            }
        }
        return temp;
    }
    public static boolean binarySearch(int[] arr,int start,int end,int target){
        while(start<=end){
                int mid=start+(end-start)/2;
                if(target==arr[mid]){

                    return true;
                }
                if(target>arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
            return false;
    }
    
}
