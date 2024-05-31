import java.util.*;
class InsertionSort{
	void insertionSort(int[] arr) {
		for(int i=1; i<arr.length; i++){
			int j = i-1;
			int element = arr[i];
			while(j>=0 && arr[j] > element) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = element;
		}
	}
	public static void main(String[] args) {
		int arr[] = new int[]{4,3,2,6,4,3};
		InsertionSort obj = new InsertionSort();
		obj.insertionSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
