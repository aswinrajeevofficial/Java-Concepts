import java.util.HashMap;

public class TwoSum {

	public static String twoSumFunction(int[] arr, int target) {
		int returnValue[] = new int[2];
		HashMap<Integer, Integer> valueMap = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < arr.length; i++) {
			valueMap.put(target-arr[i], arr[i]);
//			int diff = target - arr[i];
//			if(valueMap.containsKey(diff)) {
//				returnValue[0] = valueMap.get(diff);
//				returnValue[1] = i;
//			}
//			else
//				valueMap.put(arr[i], i);
		}
		for(int i = 0; i < arr.length; i++) {
			if(valueMap.containsKey(arr[i])) {
				if(valueMap.containsKey(valueMap.get(arr[i]))){
					sb.append("{" + arr[i] + "," + valueMap.get(arr[i]) + "}");
					valueMap.remove(arr[i]);
					//return new int[] { arr[i], valueMap.get(arr[i]) };
					//returnValue[0] = arr[i];
					//returnValue[1] = valueMap.get(arr[i]);
				}
			}
				
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		int nums[] = {3, 5, 2, -4, 8, 11};
		int target = 7;
		System.out.println(twoSumFunction(nums, target));
	}
}

/*
Given an array of numbers: [2,7,11,15], find two numbers 
that reach the given target sum of 9

*/
