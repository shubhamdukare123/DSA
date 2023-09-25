import java.util.*;
class FindFactors{
	static int findFactors(int num){
		int count = 0;
		for(int i=1 ; i*i<=num; i++){
			if(num%i == 0){
			if(num/i == i){
				count++;
			}
			else{
				count = count + 2;
			}
		}
		
		}
		count++;
		return count;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = findFactors(num);
		System.out.println(count);
	}
}
