class Solution {
    public String sortVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        List<Character> vowelList = new ArrayList<>();

        for(char c: s.toCharArray()){
            if(vowels.contains(c)){
                vowelList.add(c);
            }
        }

        Collections.sort(vowelList);

        int idx=0;
        StringBuilder result = new StringBuilder();
        for(char c: s.toCharArray()){
            if(vowels.contains(c)){
                result.append(vowelList.get(idx++));
            }
            else{
                result.append(c);
            }
        }

        return result.toString();
    }
}