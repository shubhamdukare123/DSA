import java.util.*;
class ArrayMinMax{
	static void printMinMax(int arr[]){
		int minNo = arr[0];
		int maxNo = arr[0];
		for(int i=0 ; i<arr.length; i++){
			if(arr[i]< minNo)
				minNo = arr[i];
			else if(arr[i] > maxNo)
				maxNo = arr[i];
		}
		System.out.println(minNo);
		System.out.println(maxNo);
	}
	public static void main(String[] args){
		int arr[] = {3,2,1,56,10000,167};
		printMinMax(arr);
	}
}
