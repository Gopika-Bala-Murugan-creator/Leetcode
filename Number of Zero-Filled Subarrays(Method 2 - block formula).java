class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count=0;
        int i=0, n=nums.length;

        while(i<n){
            if(nums[i]!=0){
                i++;
                continue;
            }
            int j=i;
            while(j<n && nums[j]==0) j++;
            long len = j-i;
            count +=(long)len*(len+1)/2;
            i=j;
        }

        return count;
    }
}