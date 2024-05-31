import java.util.*;
class PrefixSum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};
		int n = 10;
		int psArr[] = new int[n];
		psArr[0] = arr[0];
		for(int i=1; i<n; i++){
			psArr[i] = psArr[i-1] + arr[i]; 
		}
		System.out.println("Enter no of queries");
		int Q = sc.nextInt();
		for(int i=0; i<Q; i++){
			int sum = 0;
			System.out.println("Enter start & end");
			int start = sc.nextInt();
			int  end = sc.nextInt();
			sum = psArr[end] - psArr[start-1];
			System.out.println("Sum is : " + sum);

		}
	}
}
