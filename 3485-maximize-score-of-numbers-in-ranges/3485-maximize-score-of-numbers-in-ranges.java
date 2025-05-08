class Solution {
    public int maxPossibleScore(int[] start, int d) {
       int l=0;
       int r=Integer.MAX_VALUE;
       Arrays.sort(start);
       int ans=0;
       while(l<=r){
        int mid=l+(r-l)/2;
     
        if(checker(start,d,mid)){
            ans=mid;
            l=mid+1;
        }else{
            r=mid-1;
        }
       } 
       return ans;
    }
  public static boolean checker(int[] start,int d,int mid ){
     int[] copy = Arrays.copyOf(start, start.length);
    for(int i=1;i<copy.length;i++){
        if(copy[i]-copy[i-1]>=mid){
            continue;
        }else{
            if(copy[i]+d-copy[i-1]<mid) return false;
            copy[i]=copy[i-1]+mid;
        }
    }
    return true;
  }
}