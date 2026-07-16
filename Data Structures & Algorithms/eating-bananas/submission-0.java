class Solution {
    public boolean isValid(int[] piles, int h, int mid){
        int hrs = 0;
        for(int p : piles){
            hrs += (p + mid - 1) / mid;
        }

        return hrs <= h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;

        for(int p : piles){
            if(r < p) r = p;
        }

        while(l <= r){
            int mid = l + (r - l) / 2;

            if(isValid(piles, h, mid)) r = mid - 1;
            else l = mid + 1;

        }

        return l;
    }
}
