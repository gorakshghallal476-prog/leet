class Solution {
    public int passThePillow(int n, int time) {

        int round = time / (n - 1);
        int pos = time % (n - 1);

        if(round % 2 == 0)
            return pos + 1;

        return n - pos;
    }
}