import java.util.*;
class Merge{
	public static void main(String[] args){
		int arr1[] = new int[]{3,7,9,11};
		int arr2[] = new int[]{2,5,8};

		int n = arr1.length + arr2.length;
		int arr[] = new int[n];
		int i=0;
		int j=0; 
		int k=0;
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
		System.out.println(Arrays.toString(arr));
	}
}
