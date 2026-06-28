package Arrays;

//Problem
//Find if there exists three indices i < j < k such that:
//	nums[i] < nums[j] < nums[k]
public class Increasing_Triplet_Subsequence {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5};
		boolean res = increasingTriplet(arr);
		System.out.println(res);
	}
	
	public static boolean increasingTriplet(int[] arr) {
		
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		
		for(int n : arr)
		{
			if(n<=first)
				first = n;
			else if(n<=second)
				 second = n;
			else
				return true;
		}
		
		return false;
	}

}
