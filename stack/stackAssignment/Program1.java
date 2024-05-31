//right adjacent element print else -1 
import java.util.*;
class StackDemo{
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		char ch;
		s.push(3);
		s.push(5);
		s.push(1);
		s.push(2);
		s.push(4);
		/*do{
			System.out.println("Enter element");
			int num = sc.nextInt();
			s.push(num);
			System.out.println("Continue?");
			ch = sc.next().charAt(0);
		}while(ch == 'Y' || ch == 'y');*/ //4 2 1 5 3    2 1 -1 3 -1 
		while(!s.empty()){ //
			int val = s.pop();
			if(!s.empty()){
				if(val > s.peek()){
					System.out.print(s.peek() + " ");
				}else{
					System.out.print("-1 ");
				}
			}else{
				System.out.print("-1 ");
			}
		}
		System.out.println();


	}
}
