class Solution {
    public boolean isPerfectSquare(int num) {
        long start=1;
        long end=num;
        while(start<=end){
            long mid=start+(end-start)/2;
            long temp=mid*mid;
            if(num==temp){
                return true;
            }
            if(num<temp){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return false;
    }
}