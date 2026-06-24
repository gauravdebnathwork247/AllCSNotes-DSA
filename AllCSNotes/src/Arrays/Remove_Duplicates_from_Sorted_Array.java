package Arrays;

//Given a sorted array, remove duplicates in-place.

public class Remove_Duplicates_from_Sorted_Array {

	public static void main(String[] args) {
		int[] arr = { 1,2,2,2,2,3,3,3,4,4,5 };

		int x = removeElement(arr);
		for (int i = 0; i < x; i++)
			System.out.print(arr[i] + " ");
	}

	public static int removeElement(int[] nums) {
		if(nums.length==0) return 0;

		int k=1;
		for(int i=1;i<nums.length;i++) {
			
			if(nums[i]!=nums[k-1]) {
				nums[k]=nums[i];
				k++;
			}
		}
		
		return k;
	}

}
