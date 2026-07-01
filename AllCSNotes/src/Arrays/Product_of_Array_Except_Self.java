package Arrays;

import java.util.Arrays;

public class Product_of_Array_Except_Self {

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4};

		int newArr[] = productExceptSelf(arr);
		
		for(int x: newArr)
		{
			System.out.print(x+" ");
		}
		
	}
	
	public static int[] productExceptSelf(int[] nums) {
		
		int n = nums.length;
		int[] arr = new int[n];
		Arrays.fill(arr,1);
		
		int leftProduct = 1;
		
		for(int i=0;i<n;i++)
		{
			arr[i] = leftProduct;
			leftProduct*=nums[i];
		}
		
		int rightProduct=1;
		for(int i=n-1;i>=0;i--) {
			arr[i] *= rightProduct;
			rightProduct *=nums[i];
		}
		
		return arr;
		
		
	}

}
