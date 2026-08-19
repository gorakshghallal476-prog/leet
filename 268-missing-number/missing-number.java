class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int actualsum=(n*(n+1))/2;
        int sum=0;
        for(int num:nums)
        {
            sum+=num;
        }
        return actualsum-sum;
    }
}