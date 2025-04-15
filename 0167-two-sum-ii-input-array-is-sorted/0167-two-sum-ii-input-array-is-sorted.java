class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        for(int i=0;i<n-1;i++){
            int temp=target-numbers[i];
            int start=i+1;
            int end=n-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(temp==numbers[mid]){
                    return new int[]{i+1,mid+1};
                }
                if(temp>numbers[mid]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return new int[]{};
    }
}