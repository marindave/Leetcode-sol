class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n=nums.size();
        Collections.sort(nums);
        int count=0;
        int start=0;
        int end=n-1;
        while(start<end){
            if(nums.get(start)+nums.get(end)<target){
                count=count+(end-start);
                start++;
            }else{
                end--;
            }
        }
        return count;
    }
}