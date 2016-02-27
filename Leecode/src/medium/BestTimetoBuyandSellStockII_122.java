package medium;

public class BestTimetoBuyandSellStockII_122 {
	public int maxProfit(int[] prices) {
        int len=prices.length;
        int profit=0;
        for(int i=0;i<len-1;i++){
        	int minus=prices[i+1]-prices[i];
        	if(minus>0){
        		profit+=minus;
        	}
        }
        return profit;
    }
}
