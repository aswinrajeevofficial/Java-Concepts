
public class MergeSort {
	
	public static int[] mergeSort(int arr[]) {
		if(arr.length < 2) {
			return arr;
		}
		int mid = arr.length/2;
		int left[] = new int[mid];
		int right[] = new int[arr.length - mid];
		for(int i = 0; i < mid; i++) {
			left[i] = arr[i];
		}
		for(int i = mid; i < arr.length; i++) {
			right[i - mid] = arr[i];
		}
		return mergeSortedArrays(mergeSort(left), mergeSort(right));		
	}
	
	public static int[] mergeSortedArrays(int leftArr[], int rightArr[]) {
		int sortedArray[] = new int[leftArr.length + rightArr.length];
		int i = 0, j = 0, k = 0;
		while(i < leftArr.length && j < rightArr.length) {
			if(leftArr[i] <= rightArr[j]) {
				sortedArray[k] = leftArr[i];
				i++;
			}
			else {
				sortedArray[k] = rightArr[j];
				j++;
			}
			k++;
		}
		while(i < leftArr.length) {
			sortedArray[k] = leftArr[i];
			i++;
			k++;
		}
		
		while(j < rightArr.length) {
			sortedArray[k] = rightArr[j];
			j++;
			k++;
		}
		return sortedArray;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {5,8,2,9,12,23,1,3,2};
		System.out.println("Before Sorting");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int sortedArray[] = mergeSort(arr);
		System.out.println("\nAfter sorting");
		for(int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i] + " ");
		}
	}
}
