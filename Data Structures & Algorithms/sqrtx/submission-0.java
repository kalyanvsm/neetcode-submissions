class Solution {
    public int BS(int l, int r, int x){
        if (l > r) return r;

        long mid = l + (r - l) / 2;
        long midSquared = mid * mid;
        if(midSquared  == x) return (int)mid;
        else if(midSquared  < x) return BS((int)(mid + 1), r, x);
        else return BS(l, (int)(mid - 1), x);
    }
    public int mySqrt(int x) {
        if(x == 0 || x == 1) return x;
        return BS(1, x, x);
    }
}