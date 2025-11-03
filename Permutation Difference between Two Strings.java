class Solution {
    public int findPermutationDifference(String s, String t) {
        int[] indexT =new int[26];
        for(int i=0; i<t.length(); i++){
            indexT[t.charAt(i)-'a']=i;
        }
        int sum=0;
        for(int i=0; i<s.length(); i++){
            sum+=Math.abs(i-indexT[s.charAt(i)-'a']);
        }
        return sum;
    }
}