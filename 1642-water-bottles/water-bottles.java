class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int result=numBottles;
        while(numBottles >=numExchange )
        {
           int temp=numBottles/numExchange;
           result+=temp;
           numBottles=temp + (numBottles % numExchange);

        }
        return result;
    }
}