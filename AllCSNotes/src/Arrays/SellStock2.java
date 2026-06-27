package Arrays;

//Best Time to Buy and Sell Stock II

//You can buy and sell multiple times.

//You cannot hold more than one stock at a time.

/*
  
Input:
[7, 1, 5, 3, 6, 4]

Output:
7

Buy at 1, sell at 5 → profit 4
Buy at 3, sell at 6 → profit 3

Total = 7
*/

public class SellStock2 {

	public static void main(String[] args) {
		int[] arr = { 7, 1, 5, 3, 6, 4 };

		int res = maxProfitMultiple(arr);

		System.out.println(res);

	}

	public static int maxProfitMultiple(int[] prices) {
		int profit=0;
		
		for(int i=1;i<prices.length;i++)
		{
			if(prices[i] > prices[i-1])
				profit += prices[i] - prices[i-1];
		}
		
		return profit;
	}
}
