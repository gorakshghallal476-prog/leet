class Solution {
    public boolean isBalanced(String num) {
        int Esum=0;
        int Osum=0;
        for(int i=0;i<num.length();i++)
        {
            char c=num.charAt(i);
            if(i%2==0)
            {
                Esum+=c-'0';
            }
            else
            {
                 Osum+=c-'0';
            }
        }
        return Esum==Osum;
    }
}