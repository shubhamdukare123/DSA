import java.util.*;
class InsertionSort{
	public static void main(String[] args){
		int arr[] = new int[]{5,4,6,8,3,2};
		for(int i=0; i<arr.length-1; i++){
			int minIndex = i;
			for(int j=i+1; j<arr.length; j++){
				if(arr[j]<arr[minIndex]){
					minIndex = j;
				}
			}
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
