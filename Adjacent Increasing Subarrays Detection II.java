class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        List<Integer> lengths = new ArrayList<>();

        int len =1;
        for(int i=1; i<n; i++){
            if(nums.get(i)>nums.get(i-1)){
                len++;
            }
            else{
                lengths.add(len);
                len =1;
            }
        }
        lengths.add(len);

        int maxK =0;
        for(int i=0; i<lengths.size()-1; i++){
            maxK = Math.max(maxK, Math.min(lengths.get(i), lengths.get(i+1)));
        }

        for(int l:lengths){
            maxK = Math.max(maxK,l/2);
        }
        return maxK;

    }
}