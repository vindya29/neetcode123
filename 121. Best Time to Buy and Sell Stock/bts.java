class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int first = prices[0];


        for(int i=0;i<prices.length;i++){
                if(prices[i]<first)
                {
                    first = prices[i];
                    
                }
                else if (prices[i]- first > profit){
                    profit= prices[i]-first;
                }
            
           
        }
        return profit;
    }
}


