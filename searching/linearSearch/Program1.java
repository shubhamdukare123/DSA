import java.util.*;
class LinearSearch{

	int searchArr(int arr[], int target){
		for(int i=0; i<arr.length; i++){
			if(arr[i] == target)
				return i;
		}
		return -1;
	}

	static public void main(String[] args){
		Scanner sc = new Scanner(System.in);
		LinearSearch obj = new LinearSearch();
		int arr[] = new int[5];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter target");
		int target = sc.nextInt();
		int index = obj.searchArr(arr,target);
		if(index != -1)
			System.out.println(target + "found at index : " + index);
		else
			System.out.println("Element no found");
	
	}
}
