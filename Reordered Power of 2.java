class Solution {
    public boolean reorderedPowerOf2(int n) {
        String countN = digitCount(n);

        for(int i=0; i<31; i++){
            int power = 1<<i;

            if(countN.equals(digitCount(power))){
                return true;
            }

        }
        return false;
    }

    private String digitCount(int num){
        char[] digits = String.valueOf(num).toCharArray();
        Arrays.sort(digits);
        return new String(digits);
    }
}