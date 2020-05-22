
public class InsertionSort {

	public static int[] insertionSort(int[] arr) {		
		for(int i = 1; i < arr.length; i++) {
			for(int j = i; j > 0; j--) {				
				if(arr[j] < arr[j-1]) {					
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;					
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
		arr = insertionSort(arr);		
		System.out.println("\nAfter sorting:");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
/*
Explanation of Insertion Sort:

Initial Array: [5, 4, 2, 6, 1] 
Sorted portion: 5
Unsorted portion: 4, 2, 6, 1

We start outer loop with i = 1, since 0th index is sorted
and then outer loop j = i till it is greater than 0

After first iteration of inner loop (j = 1, j > 0)
if(arr[j] < arr[j-1]), we swap them. Here 4 is less than 5, so we swap

Sorted portion: 4, 5
Unsorted portion: 2, 6, 1
 */
