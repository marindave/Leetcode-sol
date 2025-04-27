class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int p=0;
        int last=Integer.MAX_VALUE;
        for(int i=1;i<=last;i++){
            int target=i;
           int start=0;
           int end=n-1;
           boolean found=false;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(target==arr[mid]){
                    found=true;
                }
                if(target>arr[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
           if(!found){
             p++;
             if(p==k) return target;
           }
            }
             return 0;
        }
        
    }
