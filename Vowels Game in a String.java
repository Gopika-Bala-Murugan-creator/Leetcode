class Solution {
    public boolean doesAliceWin(String s) {
        for(char c: s.toCharArray()){
            if(isVowel(c)){
                return true;
            }
        }
        return false;
    }

    public boolean isVowel(char c){
        return "aeiou".indexOf(c) != -1;
    }
}