class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1 || n==2){
            return 1;
        }
        else{
            int f0=0;
            int f1=1;
            int f2=1;
            for(int i=1;i<=n;i++)
            {
                int f3=f2+f1+f0;
                f0=f1;
                f1=f2;
                f2=f3;
            }
            return f0;
        }
    }
}