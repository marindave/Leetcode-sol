class Solution {
    public int incremovableSubarrayCount(int[] nums) {
       //our goal is to extraxt subarray and after that extraction we will get remaining array and in that remaining array we will check whether every element in this array is is sorted manner or not 
       int count=0;
       for(int i=0;i<nums.length;i++){
        for(int j=i;j<nums.length;j++){
            int[] remaining=new int[nums.length-(j-i+1)];
            int index=0;
            for(int p=0;p<nums.length;p++){
                if(p<i||p>j){
                    remaining[index++]=nums[p];
                }
            }
            boolean flag=true;
            for(int k=0;k<remaining.length-1;k++){
            if(remaining[k]>=remaining[k+1]){
               flag=false;  
            }
        }
        if(flag){
            
            count=count+1;
       }
        }
        
       }
       return count; 
    }
}