class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ind = 0;
        int indj = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                   ind = i;
                   indj = j;
                }
            }
        }
        return new int[]{ind,indj};
    }
}