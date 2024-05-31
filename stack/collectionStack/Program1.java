import java.util.*;
class StackDemo{
	public static void main(String[] args){
		Stack s = new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println(s.pop()); //40
		System.out.println(s.peek()); //30
		System.out.println(s.size()); //3
		s.pop();//30
		s.pop();//20
		s.pop();//10		
		System.out.println(s.isEmpty()); //true
	}
}
