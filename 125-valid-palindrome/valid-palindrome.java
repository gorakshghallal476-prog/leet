class Solution {
    public boolean isPalindrome(String s) {
        String s1=s.toLowerCase();
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s1.length();i++)
        {
            char c=s1.charAt(i);
            if((c>='0'&& c<='9') ||(c>='a'&& c<='z'))
            {
                res.append(c);
            }
        }
       if(res.length()==0)
        return  true;
        String s2=res.toString();
        boolean isPalindrome=true;
        int l=0;
        int r=s2.length()-1;
        while(l<r)
        {
            if(s2.charAt(l)!=s2.charAt(r))
            {
                isPalindrome=false;
                break;
            }
            l++;
            r--;
        }
        return isPalindrome;
    }
}