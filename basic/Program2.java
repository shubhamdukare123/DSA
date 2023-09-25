import java.util.*;
class FindSqrt{
	 int findSqrt(int num){
		int start = 1;
		int end = num;
		int itr = 0;
		int ans = 0;
		while(start <= end){
			itr++;
			int mid = (start + end)/2;
			if(mid*mid == num){
				System.out.println(itr);
				return mid;
			}
			else if(mid*mid > num)
				end = mid - 1;
			else{
				ans = mid;
				start = mid + 1;
			}
		}
		
		System.out.println(itr);
		return ans;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	 	int sqrt = findSqrt(num);
		System.out.println(sqrt);
	}
}
