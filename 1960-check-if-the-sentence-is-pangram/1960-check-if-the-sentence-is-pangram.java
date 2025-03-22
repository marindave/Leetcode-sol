class Solution {
    public boolean checkIfPangram(String sentence) {
        int n = sentence.length();
    
        for(int i=0;i<26;i++){
            if(!sentence.contains(String.valueOf((char)(97+i)))){
                return false;
            }
        }
        return true;
    }
}