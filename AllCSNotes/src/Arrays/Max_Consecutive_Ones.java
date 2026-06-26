package Arrays;


//Problem
//Find the maximum number of consecutive 1s in a binary array.

public class Max_Consecutive_Ones {

	public static void main(String[] args) {

		
		int[] arr = {1,1,0,0,1,1,1};
		
		int res = findMaxConsecutiveOnes(arr);
		
		System.out.println("Max Consecutive Ones: "+res);
		
	}

	
	public static int findMaxConsecutiveOnes(int[] nums) {
		
		int maxCount=0;
		int currentCount=0;
		
		for(int num:nums) {
			
			if(num==1)
			{
				currentCount++;
				maxCount = Math.max(maxCount, currentCount);
			}else
				currentCount=0;
		}
		
		
		
		return maxCount;
	}
}
