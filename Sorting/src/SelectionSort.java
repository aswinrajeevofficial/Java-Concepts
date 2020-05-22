
public class SelectionSort {

	public static int[] selectionSort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			int min = i;
			for(int j = i+1; j < arr.length; j++) {				
				if(arr[j] < arr[min]) 			
					min = j;			
			}
			System.out.println("\nIteration " + i + ", minimum element is " + arr[min] + ", swapping it with " + arr[i]);
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = {5,3,7,8,1,3,5,6,7,10,43,12,2};
		System.out.println("Before sorting:");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}		
		arr = selectionSort(arr);		
		System.out.println("\nAfter sorting:");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

/*
Explanation of Selection Sort: 

Initial Array: [5, 4, 2, 6, 1] 

In selection sort, the idea is to set the first value as min value
and iterate through the array and search for elements smaller than min value
If we find, we swap them

The outer loop runs from 0 to second last element
The inner loop runs from i+1 to last element

Let's dry run one iteration:
i = 0, min = i
j = 1, j < arr.length -> TRUE
if(arr[j] < arr[min]) -> 4 < 5, which is true, we set j as min
j = 2, j < arr.length -> TRUE
if(arr[j] < arr[min]) -> 2 < 4, which is true, we set j as min
j = 3, j < arr.length) -> TRUE
if(arr[j] < arr[min]) -> 6 < 2, not true, we proceed to next iteration
j = 4, j < arr.length) -> TRUE
if(arr[j] < arr[min]) -> 1 < 2, which is true, we set j as min

With one iteration, we found the minimum element of the array, no we need
to swap it with the 0th index or the ith index

int temp = arr[i];
arr[i] = arr[min];
arr[min] = temp;

This process is repeated until, the entire array is sorted.

 */
