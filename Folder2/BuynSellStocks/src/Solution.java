public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int curProfit = 0;
        for(int i=0;i<prices.length;i++){
            for(int j=prices.length-1;j>i;j--){
                if(prices[j]>prices[i]) {
                    curProfit = prices[j] - prices[i];
                    maxProfit = Math.max(maxProfit, curProfit);
                }
            }
        }
        return maxProfit;
    }
}
