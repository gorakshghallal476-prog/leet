class Solution {
    public String removeDuplicates(String s) {
    Stack <Character>stack=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
           if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
           
        }
        String s1="";
       for(Character c:stack)
       {
            s1+=c;
       }
       return s1;
    }
}