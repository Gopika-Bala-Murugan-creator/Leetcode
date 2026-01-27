class Solution {
    public int maxDistinct(String s) {
        boolean[] result = new boolean[26];
        int count =0;

        for(char c : s.toCharArray()){
            int index = c-'a';
            if(!result[index]){
                result[index] = true;
                count++;
            }
        }

        return count;
    }
}