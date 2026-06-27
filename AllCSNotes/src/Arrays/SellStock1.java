package Arrays;

// Best Time to Buy and Sell Stock

public class SellStock1 {

	public static void main(String[] args) {

		int[] arr = { 7, 1, 5, 3, 6, 4 };

		int res = maxProfit(arr);

		System.out.println(res);

	}

	public static int maxProfit(int[] prices) {

		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;

		for (int price : prices) {
			minPrice = Math.min(minPrice, price);
			int profit = price - minPrice;
			maxProfit = Math.max(maxProfit, profit);
		}

		return maxProfit;
	}

}
