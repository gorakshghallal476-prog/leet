class Solution {
    public int largestAltitude(int[] gain) {
        int ans=0;
        int curr=0;
        for(int i=0; i<gain.length; i++){
            
            int next=curr - (gain[i]*-1);
            ans=Math.max(ans, next);
            curr=next;
        }
        return ans;
    }
}