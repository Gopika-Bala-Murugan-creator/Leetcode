class Solution {
    public int totalMoney(int n) {
        int total =0;
        int week =0;
        while(n>0){
            for(int day =1; day<=7 &&n>0; day++){
                total+=week+day;
                n--;
            }
            week++;
        }
        return total;
    }
}