package medium;

public class BestTimetoBuyandSellStock_121 {
	public int maxProfit(int[] prices) {
		if(prices.length==0)
            return 0;
        int minIn=Integer.MAX_VALUE;
        int maxProfit=-1;
        for(int i=0;i<prices.length;i++){
        	if(prices[i]<minIn){
        		minIn=prices[i];
        	}
        	int profit=prices[i]-minIn;
        	if(profit>maxProfit){
        		maxProfit=profit;
        	}
        }
        return maxProfit;
    }
}
