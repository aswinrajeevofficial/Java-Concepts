import java.util.*;

public class EsperQuestion1 {

	public static void findOutput(int arr[], int cooldown) {
		HashMap<Integer, Integer> valueMap = new HashMap<>();
		StringBuffer output = new StringBuffer();
		for(int i = 0; i < arr.length; i++) {
			if(i == 0) {
				valueMap.put(arr[i], cooldown);
				Integer value = arr[i];
				output.append(value.toString());
			}
			else if(valueMap.containsKey(arr[i]) && valueMap.get(arr[i]) != 0) {
				int cool = valueMap.get(arr[i]);
				while(cool > 0) {
					output.append("._.");
					cool--;
				}
				Integer value = arr[i];
				output.append(value.toString());
				valueMap.put(arr[i], cooldown);
			}
			else if(!valueMap.containsKey(arr[i])) {
				Set<Integer> keySet = valueMap.keySet();
				for(Integer key : keySet) {
					valueMap.put(key, valueMap.get(key)-1);
				}
				Integer value = arr[i];
				output.append(value.toString());
				valueMap.put(arr[i], cooldown);
			}
		}
		System.out.println(output.toString());
	}
	
	public static void main(String[] args) {
		int arr[] = {1,1,2,1};
		int cooldown = 2;
		
		findOutput(arr, cooldown);
	}
}
