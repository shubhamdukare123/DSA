import java.util.*;
class BubbleSort{
	void bubbleSort(int[] arr) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1; j++) {
				if(arr[j] > arr[j+1]){
					arr[j] = arr[j] + arr[j+1];
					arr[j+1] = arr[j] - arr[j+1];
					arr[j] = arr[j] - arr[j+1];
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = new int[]{2,3,5,3,2,4,5,3,9};
		BubbleSort obj = new BubbleSort();
		obj.bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
