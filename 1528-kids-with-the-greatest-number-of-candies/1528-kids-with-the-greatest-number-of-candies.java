class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        int n=candies.length;
        for(int i=0;i<n;i++){
            int temp=candies[i]+extraCandies;
            int max=temp;
            for(int j=0;j<n;j++){
                if(candies[j]>max){
                    max=candies[j];
                }
            }
            if(max==temp){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        return list;
    }
}