package Arrays;

//Problem
//Count how many subarrays contain only zeroes.

public class Number_of_Zero_Filled_Subarrays {

	public static void main(String[] args) {

		int[] arr = {1, 0,1,0,0, 1};
		
		int res = zeroFilledSubarray(arr);
		System.out.println(res); 
	}
	
	public static int zeroFilledSubarray(int[] arr) {
		
		int count=0;
		int streak=0;
		
		for(int n:arr)
		{
			if(n==0)
			{
				streak++;
				count+=streak;
			}
			else
				streak=0;
		}
		
		return count;
		
		
	}

}
