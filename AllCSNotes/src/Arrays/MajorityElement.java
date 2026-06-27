package Arrays;

import java.util.HashMap;
import java.util.Map;

//Problem
//Find the element that appears more than n / 2 times.


public class MajorityElement {

	public static void main(String[] args) {
		
		
		int[] nums = {1,2,3,4};
		
		int res = majorityElement(nums);
		
		System.out.println(res);
		
	}
	
	
	public static int majorityElement(int[] nums) {
		
		
		Map<Integer,Integer> hm = new HashMap<>();
		
		for(int n : nums)
		{
			hm.put(n, hm.getOrDefault(n,0)+1);
			
//			if(hm.get(n) > nums.length/2)
//				return n;
		}
		
		System.out.println(hm);
		for(int i=0;i<nums.length;i++)
		{
			if(hm.get(nums[i]) > nums.length/2)
				return nums[i];
		}
		
		return -1;
		
		
	}

}
