import java.util.HashMap;

public class TwoSum {

	public static int[] twoSumFunction(int[] arr, int target) {
		int returnValue[] = new int[2];
		HashMap<Integer, Integer> valueMap = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			valueMap.put(arr[i], arr[i] - target);
		}
		for(int i = 0; i < arr.length; i++) {
			if(valueMap.containsValue(arr[i] - target))
				returnValue[0] = arr[i];
		}
		return returnValue;
	}
	public static void main(String[] args) {
		int nums[] = {2, 7, 11, 15};
		int target = 9;
		
		int[] numbers = twoSumFunction(nums, target);
		System.out.println("Numbers that make the target value of " + target
				+ " are: " + nums[numbers[0]] + " and " + nums[numbers[1]]);
	}
}

/*
Given an array of numbers: [2,7,11,15], find two numbers 
that reach the given target sum of 9

*/
