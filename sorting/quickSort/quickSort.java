import java.util.*;
class QuickSort{
	int partition(int[] arr, int start, int end){
		int pivot = arr[end];
	        int i = start-1;
       		for(int j=0; j<end; j++){
			if(arr[j]<pivot){
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = arr[temp];
			}
		}
 				
	}
	void quickSort(int[] arr, int start, int end){
		if(start<end){
			int pivotIdx = partition(arr, start, end);
			quickSort(arr, start, pivotIdx-1);
			quickSort(arr, pivotIdx, end);
		}
	}
	public static void main(String[] args){
		int arr[] = new int[]{6,3,4,2,5,3,6};
		QuickSort obj = new QuickSort();
		obj.quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
