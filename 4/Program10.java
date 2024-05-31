import java.util.*;
class PrefixSumDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};
		int postArr[] = new int[arr.length];
		int sum = 0;
		postArr[0] = arr[0];
		for(int i=1; i<arr.length; i++){
			postArr[i] = postArr[i-1] + arr[i];
		}
 	 	int Q = sc.nextInt();
		for(int i=1; i<=Q; i++){
			int start = sc.nextInt();
			int end = sc.nextInt();
			if(start == 0){
				sum = postArr[end]; 
				System.out.println(sum);
			}
			else{
			sum = postArr[end] - postArr[start-1]; 
			System.out.println(sum);
			}
		}
	}
}
