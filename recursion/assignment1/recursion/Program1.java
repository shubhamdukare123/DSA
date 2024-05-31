import java.util.*;
class FactRecursion{
	int fact = 1;
	int factorial(int num){
		if(num==0){
			return fact;
		}
		fact = fact * num;
		factorial(--num);
		return fact;	
	}
	public static void main(String[] args){
		FactRecursion obj = new FactRecursion();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(obj.factorial(num));
	}
}
