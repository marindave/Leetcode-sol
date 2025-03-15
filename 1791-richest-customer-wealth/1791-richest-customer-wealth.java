class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth=0;
        for(int i=0;i<accounts.length;i++){
            int rowSum=0;
            for(int j=0;j<accounts[i].length;j++){
                rowSum=rowSum+accounts[i][j];
                if(wealth<rowSum){
                    wealth=rowSum;
                }
            }
        }
        return wealth;
    }
}