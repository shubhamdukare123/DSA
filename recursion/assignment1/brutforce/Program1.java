import java.util.*;
class FactorialDemo{

	int factorial(int num){
		int fact = 1;
		for(int i=num; i>0; i--){
			fact = fact * i;
		}
		return fact;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		FactorialDemo obj = new FactorialDemo();
		System.out.println(obj.factorial(num));
	}
}
