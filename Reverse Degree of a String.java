class Solution {
    public int reverseDegree(String s) {
        int total = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int revVal = 26-(ch-'a');
            int pos = i+1;
            total += revVal*pos;
        }
        return total;
    }
}