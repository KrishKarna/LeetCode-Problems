class Solution {
    public boolean isPalindrome(int x) {

        //x= Math.abs(x);
        int rev = 0, rem;

        int copy = x;
        
        while(x > 0)
        {
            rem = x % 10;
            rev = rev * 10 + rem;
            x = x/10;
        }
        if(copy == rev)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}