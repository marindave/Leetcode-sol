class Solution {
    public int mySqrt(int x) {
       int start=0;
       int end=x;
       int mid=0;
       int ans=0;
       
       while(start<=end){
        mid=start+(end-start)/2;
        long temp =(long)mid*mid;
        if(temp==x){
            return mid;
        }else if(temp>x){
            end=mid-1;
        }else{
            start=mid+1;
            ans=mid;
        }
       }
      return  ans;
    }
}