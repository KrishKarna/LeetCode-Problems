class Solution {
public:
    bool isPowerOfTwo(int n) {
        int p = 1;
        for(int i = 0; i<31; i++){
            if(p == n)
            return true;
            p = p<<1;
            cout << p << "\n";
        }
        return false;
    }
};