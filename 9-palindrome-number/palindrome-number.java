class Solution {
    public boolean isPalindrome(int x) {
        // negative numbers and numbers ending with 0 (except 0) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int rev = 0;

        while (x > rev) {
            rev = rev * 10 + x % 10;
            x /= 10;
        }

        // works for both even and odd digit counts
        return x == rev || x == rev / 10;
    }
}
