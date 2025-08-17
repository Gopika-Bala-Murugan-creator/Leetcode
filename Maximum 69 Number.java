class Solution {
    public int maximum69Number (int num) {
        int result =0;
        int place =1;
        int maxAdd =0;
        int temp = num;

        while(temp>0){
            int digit = temp%10;
            if(digit == 6){
                maxAdd = 3*place;
            }
            temp = temp/10;
            place = place*10;
        }

        result = num + maxAdd;
        return result;
    }
}