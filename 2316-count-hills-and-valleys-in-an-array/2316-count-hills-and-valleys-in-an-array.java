class Solution {
    public int countHillValley(int[] nums) {
        //Removing the adjacent dupicate elements from array
        //converting the given array nums into list
        List<Integer> ans=new ArrayList<>();
        ans.add(nums[0]);
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                ans.add(nums[i]);
            }
        }
        //converting the list ans into array
        int[] result=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            result[i]=ans.get(i);
        }
        //finding hills
        int p=0;
        for(int i=1;i<result.length-1;i++){
            if(result[i]>result[i-1]&&result[i]>result[i+1]){
              p++;
            }
        }
        int q=0;
        for(int i=1;i<result.length-1;i++){
            if(result[i]<result[i-1]&&result[i]<result[i+1]){
              q++;
            }
        }
        return p+q;
    }
}