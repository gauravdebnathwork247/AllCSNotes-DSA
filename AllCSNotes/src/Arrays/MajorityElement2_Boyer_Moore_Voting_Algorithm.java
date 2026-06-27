package Arrays;

//Boyer-Moore Voting Algorithm

public class MajorityElement2_Boyer_Moore_Voting_Algorithm {

	public static void main(String[] args) {

		int[] nums = { 2, 2, 1, 1, 1, 2, 2};

		int res = majorityElement(nums);

		System.out.println(res);
	}

	public static int majorityElement(int[] nums) {

		int count = 0;
		int candidate = 0;

		for (int n : nums) {

			if (count == 0) {
				candidate = n;
			}

			if (n == candidate)
				count++;
			else
				count--;
		}

		// Step 2: Verify candidate (for -1 return)

		int freq = 0;
		for (int num : nums) {
			if (num == candidate)
				freq++;
		}

		if (freq > nums.length / 2)
			return candidate;
		else
			return -1;

	}

}
