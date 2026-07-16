/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int BS(int l, int r){
        int mid = l + (r - l) / 2;
        int g = guess(mid);

        if(g == 0) return mid;
        else if(g < 0) return BS(l, mid - 1);
        else return BS(mid + 1, r);
    }
    public int guessNumber(int n) {
        return BS(1, n);
    }
}