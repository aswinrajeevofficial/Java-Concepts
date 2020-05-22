
public class BubbleSort {
	public static int[] bubbleSort(int[] arr) {		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length-i-1; j++) {				
				if(arr[j] > arr[j+1]) {					
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;					
				}
			}
		}		
		return arr;
	}
	public static void main(String[] args) {
		int[] arr = {5,3,7,8,1,3,5,6,7,10,43,12,2};
		System.out.println("Before sorting:");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}		
		arr = bubbleSort(arr);		
		System.out.println("\nAfter sorting:");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
