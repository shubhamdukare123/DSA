import java.util.*;
class MergeSort{
	void merge(int arr[], int start,int mid, int end){
		int arr1[] = new int[mid-start+1];
		int arr2[] = new int[end-mid];

		for(int i=0; i<mid-start+1; i++){
			arr1[i] = arr[start+i];
		}
		for(int j=0; j<end-mid; j++){
			arr2[j] = arr[mid+1+j];
		}
		int i=0;
		int j=0;
		int k=start;
		while(i<arr1.length && j<arr2.length){
			if(arr1[i]<arr2[j]){
				arr[k] = arr1[i];
				i++;
			}else{
				arr[k] = arr2[j];
				j++;
			}
			k++;
		}
		while(i<arr1.length){
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length){
			arr[k] = arr2[j];
			j++;
			k++;
		}
	}

	void mergeSort(int arr[], int start, int end){
		if(start<end){
			int mid = (start+end)/2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);

			merge(arr, start, mid, end);
		}
	}
	public static void main(String[] args){
		int arr[] = new int[]{9,1,8,2,7,3,6,4};
		MergeSort obj = new MergeSort();
		obj.mergeSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
