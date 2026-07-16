class Solution {
    public int maxProfit(int[] prices) {
        int maxProf = 0;
        int min = Integer.MAX_VALUE;

        for(int p : prices){
            if(p < min) min = p;
            else{
                maxProf = Math.max(maxProf, p - min);
            }
        }

        return maxProf;
    }
}
