class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        int closest=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
             if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int start=i+1;
            int end=n-1;
              while(start<end){
                int sum=nums[i]+nums[start]+nums[end];
                if(sum==target){
                    return sum;
                }
                int value=Math.abs(target-sum);
              //  Math.abs(value);
                if(value<min){
                    min=value;
                    closest=sum;
                }
                if(sum>target){
                    end--;
                }else if(sum<target){
                    start++;
                }
              
                }
            }
            return closest;
        }
    }
