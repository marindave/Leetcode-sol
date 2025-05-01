class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length;
        int i=0;
        int j=0;
        int sum1=0;
        int count1=0;
        //finding number <=goal
        while(j<n){
            sum1=sum1+nums[j];
            while(i<=j && sum1>goal){
                sum1=sum1-nums[i];
                i++;
            }
            count1=count1+(j-i+1);
            j++;
        }
        int count2=0;
        int sum2=0;
        int p=0;
        int q=0;
        //finding number less than goal
         while(q<n){
            sum2=sum2+nums[q];
            while(p<=q && sum2>=goal){
                sum2=sum2-nums[p];
                p++;
            }
            count2=count2+(q-p+1);
            q++;
        }
        return count1-count2;
    }
}