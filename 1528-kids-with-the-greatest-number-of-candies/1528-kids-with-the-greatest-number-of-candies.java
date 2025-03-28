class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        ArrayList<Boolean>result=new ArrayList<>();
        int max=0;
        for(int i=0;i<n;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }
        for(int i=0;i<n;i++){
            if(candies[i]+extraCandies>=max){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}