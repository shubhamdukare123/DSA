import java.util.*;
class MulArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int mod = sc.nextInt();
		int product = 1;
		int arr[] = {1,2,3,4};
		for(int i=0; i<arr.length ; i++){
			product = product * arr[i]; 
		}
		System.out.println(product);
	}
}
