class Solution {
    public int findNumbers(int[] nums) {
        int n=nums.length;
        int p=0;
        int count=0;
        
        for(int i=0;i<n;i++){
            
            while(nums[i]>0){
                
                nums[i]=nums[i]/10;
                p++;
            }
            if(p%2==0){
                count++;
            }
            p=0;
        }
        return count;
    }
}