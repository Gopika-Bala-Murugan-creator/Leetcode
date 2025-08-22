class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];

        for(char c: s.toCharArray()){
            freq[c-'a']++;
        }

        String vowels ="aeiou";
        int maxVowel =0;
        int maxConsonant =0;

        for(int i=0; i<26; i++){
            char ch = (char)(i+'a');
            if(freq[i]>0){
                if(vowels.indexOf(ch)!=-1){
                    maxVowel = Math.max(maxVowel,freq[i]);
                }
                else{
                    maxConsonant = Math.max(maxConsonant, freq[i]);
                }
            }
        }
        return maxVowel+maxConsonant;
    }
}