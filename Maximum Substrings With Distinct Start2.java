class Solution {
    public int maxSubstrings(String s) {
        Set<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            set.add(c);
        }

        return set.size();
    }
}
