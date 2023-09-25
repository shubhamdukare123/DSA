import java.util.Scanner;
class SumNumDemo{
	static int sumNum(int num){
		int sum = 0;
		for(int i=1; i<=num; i++){
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = sumNum(num);
		System.out.println(sum);
	}
}
