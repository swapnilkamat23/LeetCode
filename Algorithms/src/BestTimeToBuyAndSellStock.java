/**
 * Author: Swapnil Kamat
 */

import java.util.*;

public class BestTimeToBuyAndSellStock {
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args){
		List<Integer> prices = new LinkedList<Integer>();
		prices.add(9);
		prices.add(1);
		prices.add(3);
		prices.add(10);
		prices.add(6);
		System.out.println("profit= "+maxProfit(prices));
	}
	
	/**
	 * Calculate Max Profit for the stock
	 * @param prices
	 * @return
	 */
	public static int maxProfit(List<Integer> prices) {
        if(prices.size()==0)
            return 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int[]  ans = new int[prices.size()];
        for(int i=0;i<prices.size();i++)
        {
            if(prices.get(i) < min)
                min = prices.get(i);
            ans[i] = prices.get(i) - min;
            if(ans[i]>max)
                max = ans[i];
        }
        return max;
    }
}
