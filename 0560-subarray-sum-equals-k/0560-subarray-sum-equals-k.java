class Solution {
    public int subarraySum(int[] nums, int k) {
       int n=nums.length;
        HashMap<Integer, Integer> table = new HashMap<>();
       int sum=0;
       table.put(0,1);
    
       int count=0;
       for(int i=0;i<n;i++){
        sum=sum+nums[i];
       if(table.containsKey(sum-k)) count=count+table.get(sum-k);
       table.put(sum,table.getOrDefault(sum,0)+1);
       }
       return count;
    }
}