package Arrays;

/*
Problem
Remove all occurrences of a given value from the array in-place.
*/
public class RemoveElement {

	public static void main(String[] args) {

		int[]arr = {3,1,2,2,3,4,5};
		
		int x=removeElement(arr, 3);
		for(int i=0;i<x;i++)
			System.out.print(arr[i]+" ");
	}
	
	
	public static int removeElement(int[] nums,int val)
	{
		int k=0;
		
		for(int num:nums)
		{
			if(num!=val)
			{
				nums[k] = num;
				k++;
			}
		}
		return k;
	}

}
