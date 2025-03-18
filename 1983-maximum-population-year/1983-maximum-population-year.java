class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] years=new int[101];

        for(int i=0;i<logs.length;i++){
            int birth=logs[i][0];
            int death=logs[i][1];
            for(int j=birth;j<death;j++){
                years[j-1950]++;
            }
        }
        int max=0;
        int earliestYear=1950;
        for(int i=0;i<101;i++){
            if(years[i]>max){
                max=years[i];
                earliestYear=1950+i;
            }
        }
        return earliestYear;
    }
}