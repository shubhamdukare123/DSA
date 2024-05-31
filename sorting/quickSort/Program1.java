import java.util.Arrays;
class QuickSort{

	int partition(int[] arr, int start, int end){
		int pivot = arr[end];
		int i = start-1;
		for(int j=0; j<end-1; j++){
			if(arr[j]<pivot){
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[end];
		arr[end] = arr[i+1];
		arr[i+1] = temp;
		return i+1;
	}

	void quickSort(int[] arr, int start, int end){
		if(start<end){
			int pivotIdx = partition(arr, start, end);
			quickSort(arr,start,pivotIdx-1);
			quickSort(arr,pivotIdx+1,end);
		}
	}
	public static void main(String[] args){
		QuickSort obj = new QuickSort();
		int arr[] = new int[]{4,5,3,7,9,2};
		System.out.println(Arrays.toString(arr));
		obj.quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
