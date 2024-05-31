import java.util.*;
class SelectionSort{
	void selectionSort(int[] arr){
		for(int i=0; i<arr.length-1; i++){
			int minIndex = i;
			for(int j=i+1; j<arr.length; j++){
				if(arr[j] < arr[minIndex]){
					minIndex = j;
				}
			}
			arr[i] = arr[i] + arr[minIndex];
			arr[minIndex] = arr[i] - arr[minIndex];
			arr[i] = arr[i] - arr[minIndex];
		}
	}
	public static void main(String[] args){
		int arr[] = new int[]{2,5,9,8,6,3};
		SelectionSort obj = new SelectionSort();
		obj.selectionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
       	
}
