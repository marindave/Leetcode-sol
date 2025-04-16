class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int area=0;
        int max=0;
        int i=0;
        int j=n-1;
        while(i<j){
             if(height[i]<=height[j]){
                   area=height[i]*(j-i);
                }else{
                    area=height[j]*(j-i);
                }
                if(area>max){
                    max=area;
                }
                if(height[i]<=height[j]){
                    i++;
                }else{
                    j--;
                }
                
        }
        return max;
    }
}