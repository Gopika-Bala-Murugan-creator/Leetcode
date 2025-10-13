class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = new ArrayList<>();
        res.add(words[0]);

        for(int i=1; i<words.length; i++){
            String prev = res.get(res.size()-1);
            if(!isAnagram(prev,words[i])){
                res.add(words[i]);
            }
        }

        return res;
    }

    private boolean isAnagram(String str1, String str2){
        if(str1.length()!= str2.length()) return false;
        char[] word1 = str1.toCharArray();
        char[] word2 = str2.toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }
}