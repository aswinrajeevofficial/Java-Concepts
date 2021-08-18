
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
//Added a comment here
/*
Explanation of Bubble Sort:
Initial Array: [5, 4, 2, 6, 1]
arr.length = 5
The outer loop will iterate from 0 to 4
The inner loop will iterate from 0 to length-i-1

Let's do a dry run of the first iteration
j will iterate from 0 to 4-0-1 = 3
j = 0
if(arr[j+1] < arr[j]) -> 4 < 5 is true, swap them
Array will be: 4, 5, 2, 6, 1
j = 1
if(arr[j+1] < arr[j]) -> 2 < 5 is true, swap them
Array will be: 4, 2, 5, 6, 1
j = 2
if(arr[j+1] < arr[j]) -> 6 < 5 is not true, not swapping them
j = 3 Last iteration
if(arr[j+1] < arr[j]) -> 1 < 6, is true, swap them
Array will be: 4, 2, 5, 1, 6

This is the array after first iteration. As you can see, with bubble sort
after the first iteration, the largest element in the array will be at the 
end index

*/