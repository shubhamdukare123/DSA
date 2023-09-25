import java.util.*;
class SearchArray{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int arrSize = sc.nextInt();
		int arr[] = new int[4];
		for(int i=0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		System.out.println("Enter number to find");
		int num = sc.nextInt();
		int index = findNum(num, arr);
		System.out.println("No. found at index" + index);
	}
	static int findNum(int num, int arr[] ){
		for(int i=0; i<arr.length; i++){
			if(arr[i] == num){
				return i;
			}
		}
		return 0;
		
	}
}
