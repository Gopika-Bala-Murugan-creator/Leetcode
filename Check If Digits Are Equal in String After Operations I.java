class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length()>2){
            StringBuilder result = new StringBuilder();
            for(int i=0; i<s.length()-1; i++){
                int a = s.charAt(i)-'0';
                int b= s.charAt(i+1)-'0';
                result.append((a+b)%10);
            }
            s= result.toString();
        }
        return s.charAt(0)==s.charAt(1);
    }
}