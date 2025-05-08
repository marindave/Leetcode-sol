class Solution {
    public int arrangeCoins(int n) {
        long start=1;
        long end=n;
        long mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            long temp=mid*(mid+1)/2;
            if(temp==n){
                return (int)mid;

            }else if(temp>n){
                end=mid-1;
            }else{
             start=mid+1;
            }
        }
        return (int)end;
    }
}