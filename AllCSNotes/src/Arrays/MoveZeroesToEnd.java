package Arrays;

public class MoveZeroesToEnd {

	public static void main(String[] args) {

		
		int[] arr = {7,0,8,0,10,0,19,0, 1, 0, 3, 12};
		moveZeroes(arr);
		
		for(int x:arr) {
			System.out.print(x+" ");
		}
	}
	
	
	public static void moveZeroes(int[] nums) {
		
		int pos=0;
		
		for(int num:nums) {
			
			if(num!=0)
			{
				nums[pos]=num;
				pos++;
			}
		}
		
		
		while(pos<nums.length)
		{
			nums[pos++]=0;
		}
		
	}

}
