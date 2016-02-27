package hard;

public class BestTimetoBuyandSellStockIII_123 {
	public int maxProfit(int[] prices) {
        int in1,in2;
        in1=in2=Integer.MIN_VALUE;
        int release1,release2;
        release1=release2=0;
        int len=prices.length;
        for(int i=0;i<len;i++){
        	 release2 = Math.max(release2, in2+prices[i]);
             in2    = Math.max(in2,    release1-prices[i]);
             release1 = Math.max(release1, in1+prices[i]);
             in1    = Math.max(in1,    -prices[i]); 
        }
        return release2;
    }
}
