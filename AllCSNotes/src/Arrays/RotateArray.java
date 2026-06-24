package Arrays;

public class RotateArray {

	public static void main(String[] args) {

		int[] nums = {1,2,3,4,5,6,7};
		int n=nums.length;
		int k=3;
		k=k%n;
		
		reverse(nums,0,n-1);
		reverse(nums,0,k-1);
		reverse(nums,k,n-1);
		
		for(int x:nums)
		{
			System.out.print(x+" ");
		}
		
	}
	
	
	
	public static void reverse(int[] nums, int left,int right) {
		
		while(left<right) {
			
			int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;
			left++;
			right--;
			
		}
		
	}

}
