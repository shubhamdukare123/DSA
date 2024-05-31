import java.util.*;
class ArraySum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[]{-3,6,2,4,5,2,8,-9,3,1};
		int Q = sc.nextInt();
		
		for(int i=1; i<=Q; i++){
			int sum = 0;
			int start = sc.nextInt();
			int end = sc.nextInt();
			for(int j=start; j<=end; j++){
				sum = sum + arr[j];
			}
			System.out.println(sum);
		}
	}
}
