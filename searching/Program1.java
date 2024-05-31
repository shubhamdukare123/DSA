import java.util.*;
class BinarySearch{
		int binarySearch(int arr[], int search){
			int start = 0;
			int end = arr.length-1;
			while(start<=end){
				mid = (start+end)/2;
				if(arr[mid] == search)
					return mid;
				if(arr[mid] > search)
					end = mid-1;
				else
					start = mid + 1;

			}
			return -1;
		}
	public static void main(String[] args){
		BinarySearch obj = new BinarySearch();
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[]{10,20,30,40,50,60,70,80,90,100};
		int search = sc.nextInt();
		int index = obj.binarySearch(arr,search);
		if(index != -1)
			System.out.println("Element found at index " + index);
		else
			System.out.println("Element not found");
	}
}
