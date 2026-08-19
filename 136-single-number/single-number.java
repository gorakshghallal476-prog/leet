class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int n:nums)
        {
            Integer count=map.get(n);
            if(count==null)
            {
                count=0;
            }
            ++count;
            map.put(n,count);
        }
       for(int n:nums)
       {
            if(map.get(n)==1)
             return n;
       }
       return 1;
    }
}