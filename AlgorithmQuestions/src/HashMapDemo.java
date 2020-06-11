import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<>();		
		map1.put("1", 1);
		map1.put("2", 2);
		map1.put("3", 3);
		map1.put("4", 4);
		map1.put("5", 5);
		map1.put("6", 6);
		map1.put("7", 7);
		map1.put("8", 8);
		System.out.println(map1.size());
		System.out.println(map1);
	}
}
