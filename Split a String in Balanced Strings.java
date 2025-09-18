class Solution {
    public int balancedStringSplit(String s) {
        int balanced =0;
        int count =0;
        for(char c: s.toCharArray()){
            if(c=='R'){
                balanced++;
            }
            else{
                balanced--;
            }

            if(balanced==0){
                count++;
            }
        }
        return count;
    }
}